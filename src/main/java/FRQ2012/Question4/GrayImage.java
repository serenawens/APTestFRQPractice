package FRQ2012.Question4;
// TIme taken: 14 minutes
public class GrayImage {
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    /** The 2-dimensional representation of this image. Guaranteed not to be null.
     * All values in the array are within the range [BLACK, WHITE], inclusive.*/
    private int[][] pixelValues = {{221,184,178,84, 135},
                                    {84, 255,255,130, 84},
                                    {78,255,0,0,78},
                                  {84,130,255,130,84}};

    public GrayImage()
    { }

    public String toString()
    {
        String array2d = "";
        for(int row=0; row<pixelValues.length;row++)
        {
            for(int col=0; col<pixelValues.length; col++)
            {
                array2d += pixelValues[row][col] + ", ";
            }
            array2d += "        ";
        }
        return "[ " + array2d + " ]";
    }

    /** @return the total number of white pixels in this image.
     * Postcondition: this image has not been changed.*/
    public int countWhitePixels()
    {
        int whitePixelCounter=0;
        for(int row=0; row<pixelValues.length; row++)
        {
            for(int col =0; col<pixelValues[0].length; col++)
            {
                if(pixelValues[row][col] == WHITE)
                {
                    whitePixelCounter++;
                }
            }
        }
        return whitePixelCounter;
    }

    /** Processes this image in row-major order and decreases the value of each pixel at
     * position (row, col) by the value of the pixel at position (row + 2, col + 2) if it exists.
     * Resulting values that would be less than BLACK are replaced by BLACK.
     * Pixels for which there is no pixel at position (row + 2, col + 2) are unchanged.
     */
    public void processImage()
    {
        for(int row =0; row<pixelValues.length; row++)
        {
            for(int col=0; col<pixelValues[0].length;col++)
            {
                if(row+2<pixelValues.length && col+2<pixelValues[0].length)
                {
                    pixelValues[row][col] -= pixelValues[row+2][col+2];
                    if(pixelValues[row][col]<BLACK)
                    {
                        pixelValues[row][col]= BLACK;
                    }
                }
            }
        }
    }
}

