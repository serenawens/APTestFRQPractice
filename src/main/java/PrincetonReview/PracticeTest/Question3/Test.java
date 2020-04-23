package PrincetonReview.PracticeTest.Question3;

public class Test {
    public static void Test() {
        BinaryInt a1 = new BinaryInt(2314279623);
        BinaryInt b1 = new BinaryInt(32365550123);
        BinaryInt a2 = new BinaryInt(3412579010);
        BinaryInt b2 = new BinaryInt(2128250735);

        BinaryInt sum1 = a1.addBinaryInt(b1);
        BinaryInt sum2 = a2.addBinaryInt(b2);
        if (sum1.compareTo(sum2) < 0) {
            System.out.println(sum2);
        } else {
            System.out.println(sum1);
        }

    }
}
