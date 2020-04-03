package FRQ2014.Question4;

public class Sandwich implements  MenuItem{
    private String name;
    private double price;

    public Sandwich(String menuName, double cost)
    {
        name = menuName;
        price = cost;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
