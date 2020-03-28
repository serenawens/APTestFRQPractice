package FRQ2015Again.Question1;

import java.sql.SQLOutput;

//Time Taken to write+mentally test: 18 minutes
public class ArraySum {
    public static void main(String[] args)
    {
        int[][] arr2D = {{1,3,2,7,3},
                        {10,10,4,6,2},
                        {5,3,5,9,6},
                        {7,6,0,2,1}};
        int[] rowSum = rowSums(arr2D);
        String list ="";
        for(int i=0; i< rowSum.length; i++)
        {
            if(rowSum[i]!=rowSum.length-1)
                list += rowSum[i] + ", ";
            else
                list+= rowSum[i];
        }
        //System.out.println("[ " + list + " ]");
        System.out.println(isDiverse(arr2D));
    }
    public static int arraySum(int[] arr)
    {
        int sum =0;
        for(int val : arr)
        {
            sum += val;
        }
        return sum;
    }
    public static int[] rowSums(int[][] arr2D)
    {
        int[] rowSum = new int[arr2D.length];
        for(int row=0; row<arr2D.length; row++)
        {
            int[] tempArr = new int[arr2D[0].length];
            for(int col=0; col<arr2D[0].length; col++)
            {
                tempArr[col] = arr2D[row][col];
            }
            rowSum[row] = arraySum(tempArr);
        }
        return rowSum;
    }

    public static boolean isDiverse(int[][] arr2D)
    {
        int[] rowSums = rowSums(arr2D);
        for(int i=0; i<rowSums.length; i++)
        {
            for(int k = i+1; k<rowSums.length; k++)
            {
                if(rowSums[i]==rowSums[k])
                {
                    return false;
                }
            }
        }
        return true;

    }


}
