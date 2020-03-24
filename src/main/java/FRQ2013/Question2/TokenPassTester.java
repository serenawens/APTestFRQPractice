package FRQ2013.Question2;

public class TokenPassTester {
    public static void main(String[] args) {
        TokenPass game = new TokenPass(4);
        System.out.println(game);
        System.out.println(game.getCurrentPlayer());
        game.distributeCurrentPlayerTokens();
        System.out.println(game);
    }
}
