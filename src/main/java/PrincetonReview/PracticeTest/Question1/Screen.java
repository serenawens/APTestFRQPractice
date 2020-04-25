package PrincetonReview.PracticeTest.Question1;

import java.util.ArrayList;

public class Screen {
    private ArrayList<ArrayList<Pixel>> data;
    private int numCols;

    public Screen(int width, int height) {
        numCols = width;
        data = new ArrayList<ArrayList<Pixel>>();
        for (int i = 0; i < height; i++) {
            data.add(new ArrayList<Pixel>());
        }
    }

    public Pixel pixelAt(int row, int col) {
        //traverse the outer array that represents Rows
        for (ArrayList<Pixel> r : data) {
            for (Pixel pixel : r) {
                if (pixel.getCol() == col && pixel.getRow() == row) {
                    return pixel;
                }
            }
        }
        return null;
    }

    public void pixelOn(int row, int col) //row=height col=width
    {
        Pixel pixel = new Pixel(row, col);
        ArrayList<Pixel> column = data.get(row);
        if (col == 0) { //if its at the beginning
            column.add(0, pixel);
        } else if (col == column.size() - 1) { //if its at the end
            column.add(pixel);
        } else { //if its in the middle
            for (int i = 0; i < column.size() - 1; i++) { //traverse column
                Pixel currPix = column.get(i);
                Pixel nextPix = column.get(i + 1);
                if (currPix.getCol() < col && col < nextPix.getCol()) { //if its between two pixels
                    column.add(i + 1, pixel);
                    break;
                }
            }
        }
    }


}
