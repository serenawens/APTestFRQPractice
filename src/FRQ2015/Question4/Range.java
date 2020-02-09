package FRQ2015.Question4;

import java.util.Arrays;

public class Range implements NumberGroup {
    private int minVal;
    private int maxVal;
    private int[] group;

    public Range(int min, int max)
    {
        minVal = min;
        maxVal= max;
        group = new int[maxVal-minVal +1];
        int temp = minVal;
        for(int i = 0; i<group.length; i++)
        {
            group[i] = temp;
            temp++;
        }

    }

    public int[] getGroup()
    {
        return group;
    }

    public String toString()
    {
        return Arrays.toString(group);
    }

    public boolean contains(int num)
    {
        for (int number : group)
        {
            if(number ==num)
            {
                return true;
            }
        }
        return false;
    }
}
