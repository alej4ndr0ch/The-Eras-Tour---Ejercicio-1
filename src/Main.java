import java.util.Scanner;

public class Main {
    public static void main(String []Args){
        Scanner scanner = new Scanner(System.in);
        int option;

        TicketSystem system = new TicketSystem();
        Buyer buyer = null;

        do {
            System.out.println(
                "------------------------------------------------\n" +
                "|            BIENVENIDO AL SISTEMA             |\n" +
                "|                DE BOLETOS DE                 |\n" +
                "|                THE ERAS TOUR                 |\n" +
                "------------------------------------------------"
            );

            System.out.println("Seleccione una opcion:");
            System.out.println("------------------------------------------------");
            System.out.println("1. Comprar nuevos tickets:");
            System.out.println("2. Nueva solicitud de bolestos:");
            System.out.println("3. Disponibilidad de asientos totales:"); 
            System.out.println("4. Disponibilidad de asientos individual");
            System.out.println("5. Dinero ingresado de los boletos:");
            System.out.println("6. Salir:");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Nombre: ");
                    String name = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Cantidad de boletos: ");
                    int quantity = scanner.nextInt();

                    System.out.print("Presupuesto: ");
                    double budget = scanner.nextDouble();
                    scanner.nextLine();

                    buyer = new Buyer(name, email, budget, quantity);

                    System.out.println("Comprador registrado.");
                break;

                case 2:
                    if (buyer == null) {
                        System.out.println("Primero debe registrar un comprador.");
                    } else {
                        System.out.println(buyer);
                    }
                break;

                case 3:
                    system.availability();
                break;

                case 4:

                break;

                case 5:
                    System.out.println("Ingreso de caja: $" + system.getBox());
                break;

                case 6:
                    System.out.println("¡¡ Muchas Gracias Por Utilizar Nuestro Sistema !!");
                break;
            
                default:
                    System.out.println("Esa opción no existe.");

                break;
            }
        }while(option != 5);

        scanner.close();
    }
}
