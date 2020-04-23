package PrincetonReview.PracticeTest.Question1;

import java.util.ArrayList;

public class Screen {
    private ArrayList<Pixel>[] data;
    private int numCols;

    public Screen(int width, int height) {
        numCols = width;
        data = new ArrayList[height];
    }

    public Pixel pixelAt(int row, int col) {
        for (ArrayList<Pixel> list : data) {
            for (Pixel pixel : list) {
                if (pixel != null && pixel.getRow() == row && pixel.getCol() == col) {
                    return pixel;
                }
            }
        }
        return null;
    }

    public void pixelOn(int row, int col) //row==height col=width
    {
        data[row].set(col, new Pixel(row, col));
    }


}
