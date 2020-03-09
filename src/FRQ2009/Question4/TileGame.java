package FRQ2009.Question4;

import java.util.ArrayList;

public class TileGame {
    /** represents the game board; guaranteed never to be null */
    private ArrayList<NumberTile> board;
    public TileGame()
    { board = new ArrayList<NumberTile>(); }

    /** Determines where to insert tile, in its current orientation, into game board
     * @param tile the tile to be placed on the game board
     * @return the position of tile where tile is to be inserted:
     * 0 if the board is empty;
     * -1 if tile does not fit in front, at end, or between any existing tiles;
     * otherwise, 0 ≤ position returned ≤ board.size()*/
    private int getIndexForFit(NumberTile tile)
    {
        int i=0;
        while(i<board.size())
        {
            int tileRight = tile.getRight();
            int tileLeft = tile.getLeft();
            if(i!=0 && i!=board.size()-1) {
                int rightSide = board.get(i + 1).getLeft();
                int leftSide = board.get(i - 1).getRight();
                if (tileRight == rightSide && tileLeft == leftSide) {
                    return i;
                }
            }
            else if(i==0 && tileRight==board.get(i).getLeft())
            {
                return i;
            }
            else if(i==board.size()-1 && tileLeft==board.get(i).getRight())
            {
                return i;
            }
            else
            {
                i++;
            }
        }
        return -1;
    }


    /** Places tile on the game board if it fits (checking all possible tile orientations if necessary).
     * If there are no tiles on the game board, the tile is placed at position 0.
     * The tile should be placed at most 1 time.
     * Precondition: board is not null
     * @param tile the tile to be placed on the game board
     * @return true if tile is placed successfully; false otherwise
     * Postcondition: the orientations of the other tiles on the board are not changed
     * Postcondition: the order of the other tiles on the board relative to each other is not changed*/
    public boolean insertTile(NumberTile tile)
    {
        if(getIndexForFit(tile)>-1)
        {
            board.add(getIndexForFit(tile),tile);
            return true;
        }
        int rotations=0;
        while(rotations<4)
        {
            tile.rotate();
            if(getIndexForFit(tile)>=0)
            {
                board.add(getIndexForFit(tile),tile);
                return true;
            }
            rotations++;
        }
        return false;
    }
}
