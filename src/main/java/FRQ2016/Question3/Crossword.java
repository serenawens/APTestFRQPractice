package FRQ2016.Question3;
//Time taken: 18 minutes
public class Crossword {
    /** Each element is a Square object  with a color(black or white) and a number.
     *  puzzle[r][c] represents the square in row r, column c
     *   There is at least one row in the puzzle.*/
    private Square[][] puzzle;



    /**Constructs  a crossword puzzle grid
     *  Precondition: There is at least one row in blacksquares
     *  Postcondition:
     *      -The crossword puzzle grid has the same dimensions as blackSquares.
     *      -the Square object at row r, column c in the crossword puzzle grid is black
     *      if and only if blackSquares[r][c] is true
     *      -The squares in the puzzles are labeled according to the crossword labeling rule*/
    public Crossword(boolean[][] blackSquares)
    {
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        int labelNum = 1;
        for(int row = 0; row<blackSquares.length; row++)
        {
            for(int col =0; col<blackSquares[0].length; col++)
            {
                // if the square is white and is fit to be labeled
                if(!blackSquares[row][col] && toBeLabeled(row, col, blackSquares))
                {
                    //initialize the square with a number
                    puzzle[row][col]  = new Square(false, labelNum);
                    labelNum++;
                }
                //if the square is white but can't be labeled
                else if(!blackSquares[row][col])
                {
                    puzzle[row][col] = new Square(false, 0);
                }
                //if the square is black
                else
                {
                    puzzle[row][col] = new Square(true, 0);
                }
            }
        }
    }

    /** Returns true if the square at row r, column c should be labeled with a positive number;
     *          false if otherwise
     *  The square at row r, column c is black if and only if blackSquares[r][c] is true.
     *  Precondition: r and c are valid indexes in blackSquares.*/
    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
    {
        boolean isWhite = !blackSquares[r][c];
        boolean firstRow = r==0;
        boolean firstCol = c==0;
        boolean whiteAbove = !firstRow && (blackSquares[r-1][c] == isWhite);
        boolean whiteLeft = !firstCol && (blackSquares[r][c-1]== isWhite);
        return isWhite && (!whiteAbove || ! whiteLeft);
    }

}
