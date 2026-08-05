public class Buyer{
    private String name;
    private String email;
    private double budget;
    private int amount;

    public Buyer(){

    }

    public Buyer(String name, String email, double budget, int amount){
        this.name = name;
        this.email = email;
        this.budget = budget;
        this.amount = amount;
    }

    public String getName(){
        return name;
    }

    public int getAmount(){
        return amount;
    }

    public double budget(){
        return budget;
    }

    public String email(){
        return email;
    }
}