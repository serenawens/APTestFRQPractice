package StepsToAFiveAlgorithmPractice.BasicQuestion1;

import java.util.ArrayList;
import java.util.Arrays;

//Time taken: 3 minutes inclding testing
public class HighLowReplace {
    public static void main(String[] args) {
        int[] arr = {634, 521, 786, 899, 509, 235, 750, 806, 142, 645};
        //System.out.println(Arrays.toString(arr));
        int[] replaced = replaceHighAndLow(arr);
        //System.out.println(Arrays.toString(replaced));

    }

    public static int[] replaceHighAndLow(int[] arr)
    {
        int[] replaced = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>750)
            {
                replaced[i]=1000;
            }
            else if(arr[i]<250)
            {
                replaced[i] = 0;
            }
            else
            {
                replaced[i] = arr[i];
            }
        }
        return replaced;
    }

}
