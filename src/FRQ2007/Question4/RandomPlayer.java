package FRQ2007.Question4;

import java.util.ArrayList;

public class RandomPlayer extends Player {

    public RandomPlayer(String name)
    {
        super(name);
    }

    public String getNextMove(GameState state)
    {
        ArrayList<String> currentMoves = state.getCurrentMoves();
        if(currentMoves.size()>0)
        {
            int randomIndex = (int)((Math.random()*(currentMoves.size()-1)));
            return currentMoves.get(randomIndex);
        }
        return "no move";
    }
}
