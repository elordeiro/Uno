package cs410.uno;

public class Main {
    public static void main(String[] args) {
        int numPlayers    = 4;
        int numCards      = 7;
        int numDigitCards = 2;
        int numSkipCards  = 2;
        int numWildCards  = 2;
        GameState game = GameState.startGame(numPlayers, numCards, numDigitCards, numSkipCards, numWildCards);

        // Main game loop
        while (!game.isGameOver()) {
            game.runOneTurn();
        }
    }
}
