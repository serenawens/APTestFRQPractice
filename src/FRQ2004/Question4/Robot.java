package FRQ2004.Question4;

public class Robot {
    private int[] hall;
    private int pos;  // Robot's current position, tile number
    private boolean facingRight;

    public Robot(int[] hallway, int position, boolean isItFacingRight) {
        hall = hallway;
        pos = position;
        facingRight = isItFacingRight;
    }

    public Robot() {
    }

    //* post condition: returns true if this Robot has a wall immediately infront of it
    // so that it cannot move forward; other wise it returns false
    private boolean forwardMoveBlocked() {
        if (((pos == hall.length - 1) && facingRight )|| (pos == 0 && !facingRight)) {
            return true;
        }
        return false;
    }

    //Post condition: one move has been made according to
    // specifications above and the state of
    //this robot is updated

    //one move can be removing a tile,
    // and if it is empty, moving to the next tile
//   if not empty, stay on the tile
// another move: the path is blocked, so the robot switches direction
    private void move()
    {
        if (hall[pos] > 0) //if there are more tiles
        {
            hall[pos]--; //remove a tile
            if (hall[pos] == 0) //if the tile is now empty
            {
                if (!forwardMoveBlocked()) //if you can move forward
                {
                    if (facingRight) //if robot facing right
                    {
                        pos++;
                    }
                    else //if robot facing left
                    {
                        pos--;
                    }
                }
                else
                {
                    facingRight = !facingRight;
                }
            }
        }
        else
        {
            if (forwardMoveBlocked())
            {
                facingRight= !facingRight;
            }
            else
            {
                if(facingRight)
                {
                    pos++;
                }
                else
                {
                    pos--;
                }
            }
        }
    }
    //postCondition:  no more items remain
    //in the hallway, returns the number
    //of moves made
    public int clearHall() {
        int moves = 0;
        while (!hallIsClear()) {
            moves++;
            this.move();

        }
        return moves;
    }

    //postCondition: returns true
    //if the hallways contains no items;
    private boolean hallIsClear() {
        boolean clear;
        int numberOfClear = 0;
        for (int tile : hall) {
            if (tile == 0) {
                numberOfClear++;
            }
        }
        if (numberOfClear == hall.length) {
            clear = true;
        } else {
            clear = false;
        }
        return clear;
    }
}
