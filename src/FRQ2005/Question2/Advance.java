package FRQ2005.Question2;

public class Advance extends Ticket {
    private int daysAgo;

    public Advance(int howManyDaysAgo)
    {
        daysAgo =  howManyDaysAgo;
    }
    public double getPrice() {
        if (daysAgo >= 10)
        {
            return 30;
        }
        return 40;
    }
}
