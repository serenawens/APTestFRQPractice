package FRQ2005.Question2;

import static java.lang.Integer.parseInt;

public abstract class Ticket
{
    private int serialNumber; // unique ticket id number
    private static int nextSerialNumber=100;

    public Ticket()
    {
        serialNumber = getNextSerialNumber();
    }

    // returns the price for this ticket
    public abstract double getPrice();

    // returns a string with information about the ticket
    public String toString()
    {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }

    // returns a new unique serial number
    private static int getNextSerialNumber()
    {
        /* implementation not shown */
        return nextSerialNumber++;
    }

}
