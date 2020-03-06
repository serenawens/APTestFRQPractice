package FRQ2009.Question1;

public class NumberCube
{
    /** @return an integer value between 1 and 6, inclusive
     */
    public int toss()
    {
        return (int)(Math.random()*6);
    }
    /** Returns an array of the values obtained by tossing a number cube numTosses times.
     * @param cube a NumberCube
     * @param numTosses the number of tosses to be recorded
     * Precondition: numTosses > 0
     * @return an array of numTosses values*/
    public static int[] getCubeTosses(NumberCube cube, int numTosses)
    {
        int[] tosses = new int[numTosses];
        for(int toss: tosses)
        {
            toss= cube.toss();
        }
        return tosses;
    }

    /** Returns the starting index of a longest run of two or more consecutive repeated values
     * in the array values.
     * @param values an array of integer values representing a series of number cube tosses
     * Precondition: values.length > 0
     * @return the starting index of a run of maximum size;
     * -1 if there is no run*/
    public static int getLongestRun(int[] values)
    {
        int maxRun=1;
        int maxRunIndex=0;
        int currRun=1;
        int currRunIndex=0;
        for(int i=0;i<values.length-1; i++)
        {
            if(currRun<=1)
            {
                currRunIndex=i;
            }
            if(values[i]==values[i+1])
            {
                currRun++;
            }
            else if(currRun>maxRun)
            {
                maxRunIndex=currRunIndex;
                maxRun=currRun;
            }
        }
        if(maxRun<=1)
        {
            return -1;
        }
        return maxRunIndex;
    }


}