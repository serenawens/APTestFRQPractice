package FRQ2016.Question3;

public class CrosswordA {
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
    public CrosswordA(boolean[][] blackSquares)
    {

    }

    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
    {
        return false;
    }
}

