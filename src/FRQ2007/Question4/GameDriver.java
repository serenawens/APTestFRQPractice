package FRQ2007.Question4;

public class GameDriver {
    private GameState state;

    public GameDriver(GameState initial)
    {
        state= initial;
    }

    /**This method should first print the initial state of the game.
     * It should then repeatedly determine the current player and that player's next move, print both the player's name
     and the chosen move, and make the move.
     When the game is over, it should stop making moves and print either the name of the winner and the word "wins"
     or the message "Game ends in a draw" if
     there is no winner.
     You may assume that the GameState makeMove method has been implemented so
     that it will properly handle any move description returned by the Player getNextMove method,
     including the string "no move".
     **/
    public void play()
    {
        System.out.println("Initial state: " + state);

        while(!state.isGameOver())
        {
            Player currentPlayer = state.getCurrentPlayer();
            String currentMove = currentPlayer.getNextMove(state);
            state.makeMove(currentMove);
            System.out.println(currentPlayer + " makes " + currentMove);
        }
        String winner = state.getWinner().getName();
        if(winner == (null))
        {
            System.out.println("Game ends in draw");
        }
        else
        {
            System.out.println(winner + " wins");
        }




    }
}
