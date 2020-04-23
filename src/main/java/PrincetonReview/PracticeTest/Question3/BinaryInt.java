package PrincetonReview.PracticeTest.Question3;

import java.util.ArrayList;

public class BinaryInt {
    private int binary;

    public BinaryInt() {
        binary = 0;
    }

    public BinaryInt(int decimalInt) {
        ArrayList<Integer> digitsReverse = new ArrayList<Integer>();
        int dec = decimalInt;
        while (dec > 0) {
            digitsReverse.add(dec % 2);
            dec /= 2;
        }
        String digits = "";
        for (int i = digitsReverse.size() - 1; i >= 0; i--) {
            digits += digitsReverse.get(i);
        }
        binary = Integer.parseInt(digits);
    }

    public BinaryInt addBinaryInt(BinaryInt bin) {
        return new BinaryInt();
    }

    public String toString() {
        return Integer.toString(binary);
    }

    public int compareTo(BinaryInt bin) {
        return -1;
    }
}


