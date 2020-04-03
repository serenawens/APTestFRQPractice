package FRQ2014.Question4;

public class Drink implements MenuItem {
    private String name;
    private double price;

    public Drink(String menuName, double cost)
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
