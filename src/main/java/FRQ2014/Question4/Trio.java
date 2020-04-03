package FRQ2014.Question4;

public class Trio  implements MenuItem {
    private String name;
    private double price;

    public Trio(Sandwich sandwich, Salad salad, Drink drink)
    {
        name = sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
        double minCost = Integer.MAX_VALUE;
        if(sandwich.getPrice()<minCost)
        {
            minCost = sandwich.getPrice();
        }
        if (salad.getPrice()<minCost)
        {
            minCost = salad.getPrice();
        }
        if(drink.getPrice()< minCost)
        {
            minCost = drink.getPrice();
        }
        price = sandwich.getPrice() + salad.getPrice() + drink.getPrice() - minCost;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
