package Barrons.PracticeTest1.Question1;

// 22 miN
public class Matrix {
    private int[][] max;

    public void reverseAllRows() {
        for (int r = 0; r < max.length; r++) {
            int[] tempRow = max[r];
            ArrayUtil.reverseArray(tempRow);
            max[r] = tempRow;
        }
    }

    public void reverseMatrix() {
        this.reverseAllRows();
        for (int r = 0; r < max.length / 2; r++) {
            int[] temp = max[r];
            int swapInd = max.length - 1 - r;
            max[r] = max[swapInd];
            max[swapInd] = temp;
        }
    }


}
