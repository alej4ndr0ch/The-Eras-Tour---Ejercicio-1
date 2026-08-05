public class Locality {
    private int number;
    private double price;
    private int capacity;
    private int sold;

    public Locality(){

    }

    public Locality(int number, double price, int capacity, int sold){
        this.number = number;
        this.price = price;
        this.capacity = capacity;
        this.sold = 0;
    }

    public int sell(int quantity){
        sold += quantity;
        return sold;
    }

    public boolean hasSpace(int quantity){
        return sold + quantity <= capacity;
    }

    public int availableTickets(){
        return capacity - sold;
    }

    public int getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSold() {
        return sold;
    }
}
