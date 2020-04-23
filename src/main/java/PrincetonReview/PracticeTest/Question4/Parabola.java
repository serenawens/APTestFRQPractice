package PrincetonReview.PracticeTest.Question4;

public class Parabola {
    //Instance variables based off of y = format:
    // y = ax^2 + b + c
    private int a;
    private int b;
    private int c;

    public Parabola(int A, int B, int C) {
        a = A;
        b = B;
        c = C;
    }

    public double getAxis() {
        return b / (-2.0 * a);
    }

    public boolean isOnGraph(int x, int y) {
        return y == ((double) a * (Math.pow(x, 2)) + (double) b * x + c);
    }

    public String toString() {
        return "y = " + a + "x^2 + " + b + "x + " + c;
    }

}
