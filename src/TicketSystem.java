import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicketSystem {
    private List<Locality> localities;
    private double box;

    private Random random = new Random();

    public TicketSystem(){
        this.localities = new ArrayList<Locality>();
        box = 0;
    }

    public void registerSale(Locality locality, int quantity){
        locality.sell(quantity);

        box += locality.getPrice() * quantity;
    }

    public Locality randomLocality() {
        int index = random.nextInt(localities.size());
        return localities.get(index);
    }

    public double getBox(){
        return box;
    }

    public Locality searchLocality(int number) {
        for (Locality locality : localities) {
            if (locality.getNumber() == number) {
                return locality;
            }
        }

        return null;
    }

    public void availability() {
        for (Locality locality : localities) {
            System.out.println(
                "Localidad " + locality.getNumber() +
                " | Vendidos: " + locality.getSold() +
                " | Disponibles: " + locality.availableTickets()
            );
        }
    }
}
