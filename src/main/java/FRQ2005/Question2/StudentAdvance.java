package FRQ2005.Question2;

public class StudentAdvance extends Advance {

    public StudentAdvance(int howManyDaysAgo)
    {
        super (howManyDaysAgo);
    }

    public double getPrice()
    {
        return super.getPrice()/2;
    }

    public String toString()
    {
        return super.toString() + "\n (student ID required)";
    }
}
