package FiveSteps.PracticeExam1.Question4;

public class AlterImage {
    public Pixel[][] generatePixelArray(int[][] reds, int[][] greens, int[][]blues)
    {
        Pixel[][] image = new Pixel[reds.length][reds[0].length];
        for(int row=0; row<image.length; row++)
        {
            for(int col =0; col<image[0].length; col++)
            {
                int red = reds[row][col];
                int green = greens[row][col];
                int blue = blues[row][col];
                image[row][col] = new Pixel(red,green,blue);
            }
        }
        return image;
    }
    public Pixel[][] flipImage(Pixel[][] image, boolean horiz)
    {
        Pixel[][] altered = new Pixel[image.length][image[0].length];
        if(horiz)
        {
            for(int row = 0; row<altered.length/2; row++)
            {
                for(int col =0; col<altered[row].length; col++)
                {
                    int swapInd = altered.length-row-1;
                    altered[row][col] = image[swapInd][col];
                    altered[swapInd][col] = image[row][col];
                }
            }
        }
        else
        {
            for(int row = 0; row<altered.length; row++)
            {
                for(int col =0; col<altered[row].length/2; col++)
                {
                    int swapInd = altered[row].length-col-1;
                    altered[row][col] = image[row][swapInd];
                    altered[row][swapInd] = image[row][col];
                }
            }
        }
        return altered;
    }
}
