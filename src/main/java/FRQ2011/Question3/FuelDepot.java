package FRQ2011.Question3;

import java.util.List;

public class FuelDepot {
    /** The robot used to move the filling mechanism */
    private FuelRobot filler;

    /** The list of fuel tanks */
    private List<FuelTank> tanks;

    /** Determines and returns the index of the next tank to be filled.
     * @param threshold fuel tanks with a fuel level £ threshold may be filled
     * @return index of the location of the next tank to be filled
     * Postcondition: the state of the robot has not changed*/
    public int nextTankToFill(int threshold)
    {
        int lowest = threshold;
        int lowIndex=filler.getCurrentIndex();
        for(int i=0; i<tanks.size(); i++)
        {
            FuelTank tank = tanks.get(i);
            if(tank.getFuelLevel()<=lowest)
            {
                lowIndex=i;
                lowest = tank.getFuelLevel();
            }
        }
        return lowIndex;
    }

    /** Moves the robot to location locIndex.
     * @param locIndex the index of the location of the tank to move to
     * Precondition: 0 £ locIndex < tanks.size()
     * Postcondition: the current location of the robot is locIndex*/
    public void moveToLocation(int locIndex)
    {
        while(filler.getCurrentIndex()!=locIndex)
        {
           if((filler.getCurrentIndex()+1==tanks.size() && filler.isFacingRight())
                   || (filler.getCurrentIndex()==0 && !filler.isFacingRight()))
           {
               filler.changeDirection();
           }
           filler.moveForward(1);
        }
    }

}
