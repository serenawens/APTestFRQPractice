package FRQ2015Again.Question2;

public class HiddenWordTester {
    public static void main(String[] args) {
        HiddenWord harp = new HiddenWord("HARPS");
       String hint = harp.getHint("AAAAA");
        System.out.println(hint);
        hint = harp.getHint("HELLO");
        System.out.println(hint);
        hint  = harp.getHint("HEART");
        System.out.println(hint);
        hint = harp.getHint("HARMS");
        System.out.println(hint);
        hint = harp.getHint("HARPS");
        System.out.println( hint);
    }
}
