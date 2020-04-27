package Barrons.PracticeTest1.Question1;

import java.util.Arrays;

public class ArrayUtil {

    public static void reverseArray(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            int swapInd = arr.length - 1 - i;
            arr[i] = arr[swapInd];
            arr[swapInd] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,7,5,1,0};
        System.out.println(Arrays.toString(arr));
        ArrayUtil.reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
