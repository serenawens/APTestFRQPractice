package FRQ2006.Question2;

public class Vehicle extends TaxableItem {

    private double dealerCost;
    private double dealerMarkup;

    public Vehicle(double rate, double cost, double markup)
    {
        super (rate);
        dealerCost = cost;
        dealerMarkup = markup;
    }

    public void changeMarkup(double markup)
    {
        dealerCost = markup;
    }

    public double getListPrice()
    {
        return dealerCost + dealerMarkup;
    }

}
