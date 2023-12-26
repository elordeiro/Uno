package cs410.uno;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    static Card card1 = Card.of(Color.RED, Face.ONE);
    static Card card2 = Card.of(Color.YELLOW, Face.TWO);
    static Card card3 = Card.of(Color.GREEN, Face.THREE);
    static Card card4 = Card.of(Color.BLUE, Face.FOUR);
    static Card card5 = Card.of(Color.RED, Face.SKIP);
    static Card card6 = Card.of(Color.YELLOW, Face.REVERSE);
    static Card card7 = Card.of(Color.GREEN, Face.DRAW_TWO);

    /**
     * Tests the getName method.
     */
    @Test
    void getNameTest() {
        Player player = Player.of("Player");
        assertEquals("Player", player.getName());
    }

    /**
     * Tests the getHand, addCard, removeCard, and playCard methods.
     * The final test is to ensure that the player cannot play a card that does not match the top card.
     */
    @Test
    void getHandAndAddCardTests() {
        Player player = Player.of("Player");
        assertEquals(0, player.getHand().size());
        player.addCard(card1);
        player.addCard(card2);
        player.addCard(card3);
        player.addCard(card4);
        player.addCard(card5);
        player.addCard(card6);
        player.addCard(card7);
        assertEquals(7, player.getHand().size());
    
        player.removeCard(card1);
        assertEquals(6, player.getHand().size());
        player.removeCard(card2);
        assertEquals(5, player.getHand().size());
        player.removeCard(card3);
        assertEquals(4, player.getHand().size());

        Card topCard = Card.of(Color.BLUE, Face.FOUR);
        assertEquals(card4, player.playCard(topCard).get());

        topCard = Card.of(Color.BLUE, Face.SKIP);
        assertEquals(card5, player.playCard(topCard).get());
        
        topCard = Card.of(Color.YELLOW, Face.TWO);
        assertEquals(card6, player.playCard(topCard).get());
        
        // Player does not have a matching card to play
        topCard = Card.of(Color.BLUE, Face.SKIP);
        assertFalse(player.playCard(topCard).isPresent());
    }

    /**
     * Tests the hasWon method.
     * Ensures that the player has won when they have no cards left in their hand.
     */
    @Test
    void hasWonTest() {
        Player player = Player.of("Player");
        player.addCard(card1);
        player.addCard(card2);
        player.addCard(card3);

        assertFalse(player.hasWon());

        player.removeCard(card1);
        player.removeCard(card2);
        player.removeCard(card3);

        assertTrue(player.hasWon());
    }
}