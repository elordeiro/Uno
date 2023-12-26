package cs410.uno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameStateTest {

    static Player player0 = Player.of("Player 0");
    static Player player1 = Player.of("Player 1");
    static Player player2 = Player.of("Player 2");
    static Player player3 = Player.of("Player 3");

    /**
     * Ensures that after a game is started the top card is never a special card, 
     * the current player is player 0 and the game is not over.
     */
    @Test
    void startGameTest() {
        GameState gameState;
        for (int i = 0; i < 50; i++) {
            gameState = GameState.startGame(2, 7, 1, 1, 4);
            assertFalse(gameState.getTopCard().isSpecial());
            assertFalse(gameState.getTopCard().isWild());
        }
        gameState = GameState.startGame(2, 7, 1, 1, 4);
        assertFalse(gameState.isGameOver());
        assertEquals(player0.getName(), gameState.getCurrentPlayer().getName());
        
    }

    /**
     * Tests the isGameOver method and the getWinner method.
     */
    @Test
    void isGameOverTest() {
        GameState gameState = GameState.startGame(2, 7, 1, 1, 4);
        assertFalse(gameState.isGameOver());
        assertThrows(RuntimeException.class, () -> gameState.getWinner());
        while (!gameState.getCurrentPlayer().getHand().isEmpty()) {
            gameState.runOneTurn();
        }
        assertTrue(gameState.isGameOver());
        assertEquals(gameState.getCurrentPlayer().getName(), gameState.getWinner());
    }

    /**
     * Tests the runOneTurn method.
     * Checks that the next player is skipped after a skip card is played.
     * Checks that the direction of play is reversed after a reverse card is played.
     * Checks that the next player draws two cards after a draw two card is played.
     * Checks that color of wild card is set after a wild card is played and becomes the top card.
     */
    @Test
    void rulesTest() {
        GameState gameState = GameState.startGame(4, 10, 4, 0, 4);
        
        // Test skip. Emulates Player 0 playing a skip card.
        gameState.playCard(Card.of(Color.RED,Face.SKIP));
        assertEquals("Player 2", gameState.getCurrentPlayer().getName());

        // Test reverse. Emulates Player 2 playing a reverse card.
        gameState.playCard(Card.of(Color.RED,Face.REVERSE));
        assertEquals("Player 1", gameState.getCurrentPlayer().getName());

        // Test draw two. Emulates Player 1 playing a draw two card. Player 0 should draw two cards.
        // runOneTurn is called until Player 0 is the current player and has 12 cards in their hand (Everyone started with 10).
        gameState.playCard(Card.of(Color.RED,Face.DRAW_TWO));
        assertEquals("Player 3", gameState.getCurrentPlayer().getName());
        while (!gameState.getCurrentPlayer().getName().equals("Player 0")) {
            gameState.runOneTurn();
        }
        assertEquals(12, gameState.getCurrentPlayer().getHand().size());

        // Test wild card.
        Card wildRed = Card.of(Color.WILD,Face.WILD);
        wildRed.setColor(Color.RED);
        gameState.playCard(wildRed);
        assertEquals(Color.RED, gameState.getTopCard().getColor());

        Card wildBlue = Card.of(Color.WILD,Face.WILD);
        wildBlue.setColor(Color.BLUE);
        gameState.playCard(wildBlue);
        assertEquals(Color.BLUE, gameState.getTopCard().getColor());

        Card wildGreen = Card.of(Color.WILD,Face.WILD);
        wildGreen.setColor(Color.GREEN);
        gameState.playCard(wildGreen);
        assertEquals(Color.GREEN, gameState.getTopCard().getColor());

        Card wildYellow = Card.of(Color.WILD,Face.WILD);
        wildYellow.setColor(Color.YELLOW);
        gameState.playCard(wildYellow);
        assertEquals(Color.YELLOW, gameState.getTopCard().getColor());
    }

    /**
     * Similar tests to rulesTest but with two players.
     * Main difference is with the reverse card that should act as skip card. 
     */
    @Test
    void twoPlayerGameTest() {
        GameState gameState = GameState.startGame(2, 10, 1, 0, 4);
        assertEquals("Player 0", gameState.getCurrentPlayer().getName());
        
        // Test skip
        gameState.playCard(Card.of(Color.RED,Face.SKIP));
        assertEquals("Player 0", gameState.getCurrentPlayer().getName());

        // Test reverse
        gameState.playCard(Card.of(Color.RED,Face.REVERSE));
        assertEquals("Player 0", gameState.getCurrentPlayer().getName());

        // Test draw two
        gameState.playCard(Card.of(Color.RED,Face.DRAW_TWO));
        assertEquals("Player 0", gameState.getCurrentPlayer().getName());
        gameState.runOneTurn();
        assertEquals(12, gameState.getCurrentPlayer().getHand().size());
    }

    /**
     * Ensures that if a player does not have a playable card and they draw a non playable card,
     * the next player is the current player.
     */
    @Test
    void noValidCardTest() {
        GameState gameState = GameState.startGame(2, 5, 1, 0, 0);
        Player lastPlayer = gameState.getCurrentPlayer();
        Card lastCard = gameState.getTopCard();
        while (true) {
            if (gameState.isGameOver()) {
                gameState = GameState.startGame(2, 5, 1, 0, 0);
            }
            gameState.runOneTurn();
            if (lastCard == gameState.getTopCard()) {
                assertNotEquals(lastPlayer, gameState.getCurrentPlayer());
                break;
            }
            lastCard = gameState.getTopCard();
            lastPlayer = gameState.getCurrentPlayer();
        }
    }
}