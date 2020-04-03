package FRQ2016.Question3;

public class Square {
    private boolean isWhite;
    private int squareVal;

    /**Constructs one square of a crossword puzzle grid
     *  Postcondition:
     *      -The square is black if and only if isBlack is true.
     *      -The square has number num.
     */
    public Square(boolean isBlack, int num)
    {
        isWhite = !isBlack;
        squareVal = num;
    }

    public String toString()
    {
        if(isWhite)
        {
            if(squareVal!=0)
                return "White: " + squareVal;
            else
                return "Empty White";
        }
        return "Black";
    }


}
