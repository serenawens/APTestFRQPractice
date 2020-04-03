package FRQ2015Again.Question4;

public class Range implements NumberGroup{
    private int min;
    private int max;

    public Range(int Min, int Max)
    {
       min = Min;
       max = Max;
    }

    public boolean contains(int num)
    {
        if(num>= min && num<=max)
        {
            return true;
        }
        return false;
    }

}
