package FRQ2006.Question2;

public abstract class TaxableItem implements Item{
    private double taxRate;

    public abstract double getListPrice();

    public TaxableItem(double rate)
    {
        taxRate=rate;
    }

    //returns the price of the item including tax
    public double purchasePrice()
    {
        return getListPrice() + getListPrice()*taxRate;
    }

}
