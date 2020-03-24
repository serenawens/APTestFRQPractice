package FRQ2012.Question4;

public class GrayImageTester {
    public static void main(String[] args) {
        GrayImage image = new GrayImage();
        System.out.println(image);
        System.out.println(image.countWhitePixels());
        image.processImage();
        System.out.println(image);
    }
}
