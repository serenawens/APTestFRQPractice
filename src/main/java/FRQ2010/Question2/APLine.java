package FRQ2010.Question2;
//TIme taken: 8 minutes
public class APLine {
    private int a;
    private int b;
    private int c;

    public APLine(int Ax, int By, int constant)
    {
        a = Ax;
        b= By;
        c=constant;
    }

    public double getSlope()
    {
        return -(a/b);
    }

    public boolean isOnLine(int x, int y)
    {
        double test = a*x + b*y +c;
        return test==0;
    }

}
