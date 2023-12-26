package cs410.uno;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Represents the state of a game of Simplified Uno.
 * A game state has the following properties:
 * - A list of players
 * - A deck of cards
 * - A current player (the player whose turn it is)
 * - A direction (clockwise or counter-clockwise)
 * - A top card (the first card on the discard pile)
 * - A game over flag
 * The game state is responsible for:
 * - Starting the game
 * - Running one turn
 * - Determining if the game is over
 * - Determining the winner
 * - Determining the next player
 * - Inforcing game rules:
 *     - A player can only play a card if it is valid, and they must play a card if they can.
 *     - A player that does not have a valid card must draw a card.
 *     - If the card drawn can be played, it must be played.
 *     - If the card drawn cannot be played, the player's turn ends.
 *     - If a player plays a special card, the corresponding effect is taken upon the next player's turn.
 *     - A skip card skips the next player's turn.
 *     - A reverse card reverses the direction of the game (In a two player game, this card acts as a skip card).
 *     - A draw two card makes the next player draw two cards and skips their turn.
 */
public class GameState {

    final private ArrayList<Player> players;
    final private Deck deck;
    private Player currentPlayer;
    private boolean isClockwise;
    private boolean isGameOver;

    public GameState(Deck deck, ArrayList<Player> players) {
        this.players = players;
        this.deck = deck;
        this.currentPlayer = players.get(0);
        this.isClockwise = true;
        this.isGameOver = false;
        View.start();
    }

    /* After the startGame method ends, the game state should represent the
     * situation immediately before the first player takes their first turn.
     * That is, the players should be arranged, their initial hands have been dealt,
     * and the discard pile and draw pile have been created.
     */
    public static GameState startGame(int countPlayers,
                                      int countInitialCardsPerPlayer,
                                      int countDigitCardsPerColor,
                                      int countSpecialCardsPerColor,
                                      int countWildCards) 
    {
        if (countPlayers < 2) {
            throw new RuntimeException("Must have at least two players");
        }
        if (countInitialCardsPerPlayer < 1) {
            throw new RuntimeException("Must have at least one card per player");
        }

        Deck deck = new Deck(countDigitCardsPerColor, countSpecialCardsPerColor, countWildCards);
        ArrayList<Player> players = new ArrayList<Player>();
        
        for (int i = 0; i < countPlayers; i++) {
            Player player = new Player("Player " + i);
            players.add(player);
            for (int j = 0; j < countInitialCardsPerPlayer; j++) {
                player.addCard(deck.draw());
            }
        }
        return new GameState(deck, players);
    }

    /* The current player takes their turn, and if they play a special card
     * the corresponding effects are performed. When the method returns,
     * the next player is ready to take their turn.
     * If the game is already over, this method has no effect.
     */
    public void runOneTurn() {
        if (isGameOver) {
            return;
        }
        View.preTurn(this);
        
        Optional<Card> card = currentPlayer.playCard(deck.getTopCard());
        if (card.isPresent()) {
            playCard(card.get());
        } else {
            card = drawCard();
            if (card.isPresent()) {
                playCard(card.get());
            } else {
                noValidCard();
            }
        }
    }

    /**
     * Plays a card and evaluates it.
     * @param card
     */
    public void playCard(Card card) {
        deck.discard(card);
        View.preEval(currentPlayer, card);
        evaluateTopCard();
    }
    
    /**
     * Evaluates the top card on the discard pile.
     * If the top card is a special card, its side effect is taken.
     * If the top card does not have a side effect, the next player takes their turn.
     */
    private void evaluateTopCard() {
        if (currentPlayer.hasWon()) {
            isGameOver = true;
            View.gameOver(getWinner());
            return;
        }

        switch (deck.getTopCard().getFace()) {
            case SKIP:
                skip();
                break;
            case REVERSE:
                reverse();
                break;
            case DRAW_TWO:
                drawTwo();
                break;
            default:
                nextPlayer();
                break;
        }
    }

    /**
     * Skips the next player's turn.
     * Ex. In a 3 player game: 
     *         Player 0 plays RED-SKIP
     *         Player 1 is skipped
     *         Player 2 takes their turn
     */
    private void skip() {
        nextPlayer();
        View.skip(currentPlayer);
        nextPlayer();
    }

    /**
     * Reverses the direction of the game.
     * Ex. In a 3 player game:
     *        Player 1 plays RED-NINE
     *        Player 2 plays RED-REVERSE
     *        Player 0 takes their turn
     *      In a 2 player game:
     *       Player 0 plays RED-REVERSE
     *       Player 0 takes their turn
     */
    private void reverse() {
        View.reverse();
        isClockwise = !isClockwise;
        if (players.size() == 2) {
            return;
        }
        nextPlayer();
    }

    /**
     * Makes the next player draw two cards and skips their turn.
     * Ex. In a 3 player game:
     *        Player 0 plays RED-NINE
     *        Player 1 plays RED-DRAW_TWO
     *        Player 2 draws two cards and is skipped
     *        Player 0 takes their turn
     */
    private void drawTwo() {
        nextPlayer();
        View.drawTwo(currentPlayer);
        currentPlayer.addCard(deck.draw());
        currentPlayer.addCard(deck.draw());
        nextPlayer();
    }

    /**
     * Sets the next player to the player after the current player in the direction of the game.
     */
    private void nextPlayer() {
        int index = players.indexOf(currentPlayer);
        if (isClockwise) {
            index++;
            if (index >= players.size()) {
                index = 0;
            }
        } else {
            index--;
            if (index < 0) {
                index = players.size() - 1;
            }
        }
        currentPlayer = players.get(index);
    }

    /**
     * Tells the current player to draw a card from the draw pile.
     * @return an optional containing the card to be played or an empty optional if the player cannot play a card
     */
    private Optional<Card> drawCard() {
        View.drawing(currentPlayer);
        currentPlayer.addCard(deck.draw());
        return currentPlayer.playCard(deck.getTopCard());
    }

    /**
     * Outputs that the current player that they do not have a valid card to play,
     * and advances to the next player.
     */
    private void noValidCard() {
        View.noValid(currentPlayer);
        nextPlayer();
    }

    /**
     * Gets the current player.
     * @return the current player
     */
    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    /**
     * Gets the top card on the discard pile.
     * @return the top card on the discard pile
     */
    public Card getTopCard() {
        return deck.getTopCard();
    }

    /**
     * Gets the winner of the game, if there is one
     * @return the name of the winner
     */
    public String getWinner() {
        if (!isGameOver) {
            throw new RuntimeException("Game is not over");
        }
        return currentPlayer.getName();
    }

    /**
     * Gets the direction of the game.
     * @return true if the game is clockwise, false if the game is counter-clockwise
     */
    public boolean isClockwise() {
        return isClockwise;
    }

    /* Indicates whether the game is over.
     */
    boolean isGameOver() {
        return isGameOver;
    }

    /**
     * Returns a string representation of the game state.
     */
    public String toString() {
        String result = "Top card: " + deck.getTopCard() + " Direction: " + (isClockwise ? "vv" : "^^") + "\n";
        for (Player player : players) {
            if (player == currentPlayer) {
                result += ">>" + player + "\n";
            } else {
                result += "  " + player + "\n";
            }
        }
        return result;
    }
}
