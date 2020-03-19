package FRQ2015.Question1;

import java.util.Arrays;

//Completed 1-21-20
public class DiverseArray {
    public static int arraySum(int[] arr)
    {
        int arrSum=0;
        for (int i =0; i< arr.length; i++ )
        {
            arrSum = arrSum + arr[i];
        }
        return arrSum;
    }
    public static int[] rowSums(int[][] arr2D)
    {
        int[] arrayOfSums = new int[arr2D.length];
        int[] arr2DRow = new int[arr2D[0].length];
        for (int row =0; row<arrayOfSums.length; row++)
        {
            for (int col =0; col<arr2DRow.length; col++)
            {
                arr2DRow[col] = arr2D[row][col];
            }
            arrayOfSums[row] = arraySum(arr2DRow);
        }

        return arrayOfSums;
    }
    public static boolean isDiverse(int[][]arr2D)
    {
        // 1. get a 1D array of arr2D, using rowSums method
        //      a. create a new 1D array
        // 2. write method to compare the values of the 1D array
        int[] array = rowSums(arr2D);
        for(int i =0; i<array.length; i++)
        {
            for(int j =i+1; j<array.length; j++)
            {
                if (array[i] ==array[j])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int[][] arr2D = {{1,1,5,3,4},
                {12,7,6,1,9},
                {8,11,10,2,5},
                {3,2,3,0,7}};
        for (int i = 0; i<arr2D.length; i++)
        {
            for(int j =0; j<arr2D[0].length; j++)
            {
                System.out.print(arr2D[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
        int[] arr2 = rowSums(arr2D);
        for(int i =0; i<arr2.length; i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();


        System.out.println(isDiverse(arr2D));

    }
}

