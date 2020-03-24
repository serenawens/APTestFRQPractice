package FRQ2013.Question4;

import java.util.Arrays;

public class SkyViewTester {
    public static void main(String[] args) {
        double[] scanned = {0.3,0.7,0.8,0.4,1.4,1.1,0.2,0.5,0.1,1.6,0.6,0.9};
        SkyView sky = new SkyView(4,3,scanned);
        System.out.println(sky);
        System.out.println(sky.getAverage(1,2,0,1));
    }

}
