package StepsToAFiveAlgorithmPractice.BasicQuestion4;
//Time taken: 5 minutes including testing
import java.util.Arrays;

public class StockStrength {
    public static void main(String[] args) {
        double[] rsiValues = {55.6, 63.2, 68.1, 70.1, 72.4, 73.9, 71.5, 68.3, 67.1, 66.2};
        System.out.println(Arrays.toString(overpriced(rsiValues)));
    }
    public static int[] overpriced(double[] rsiValues)
    {
        int[] sold = new int[rsiValues.length];
        for(int i=0; i<rsiValues.length;i++)
        {
            double rsi = rsiValues[i];
            if(rsi > 70)
            {
                sold[i] = 1;
            }
            else
            {
                sold[i] = 0;
            }

        }
        return sold;
    }

}
