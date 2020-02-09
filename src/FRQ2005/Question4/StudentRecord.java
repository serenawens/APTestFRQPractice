package FRQ2005.Question4;

public class StudentRecord {
    private int[] scores; // contains scores.length values
                            // scores.length > 1

    // constructors and other data fields not shown

    // returns the average (arithmetic mean) of the values in scores
    // whose subscripts are between first and last, inclusive
    // precondition: 0 <= first <= last < scores.length
    private double average(int first, int last)
    {
        int sumTotal = 0;
        for (int i=first; i<=last; i++)
        {
            sumTotal += scores[i];
        }
        return (double)sumTotal/(last-first +1);
    }

    // returns true if each successive value in scores is greater
    // than or equal to the previous value;
    // otherwise, returns false
    private boolean hasImproved()
    {
        for(int index = 0; index<scores.length-1; index++)
        {
            if (scores[index]<scores[index+1])
            {
                return false;
            }
        }
        return true; //assume that its all perfect
    }

    // if the values in scores have improved, returns the average
    // of the elements in scores with indexes greater than or equal
    // to scores.length/2;
    // otherwise, returns the average of all of the values in scores
    public double finalAverage()
    {
        if (hasImproved())
        {
            return average(((scores.length-1)/2), scores.length-1);
        }
            return average(0, scores.length);
        //if hasImproved():
        //take the good top scores then use average() to produce the final average
        //first = (int) (scores.length-1)/2 and last= scores.length-1
        //if !hasImproved(), return a normal average
        // first =0 and last = scores.length
    }
}
