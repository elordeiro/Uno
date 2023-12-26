package cs410.uno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test 
    void Deck() {
        assertEquals(40, Deck.of(1, 0, 0).size());
        assertEquals(52, Deck.of(1, 1, 0).size());
        assertEquals(56, Deck.of(1, 1, 4).size());
    }

    /**
     * Tests the draw method.
     * Ensures that the cards drawn are removed from the deck and become the top card once they are discarded.
     */
    @Test
    void drawDiscardAndTopCardTest() {
        Deck deck = Deck.of(1, 1, 4);
        assertEquals(56, deck.size());
        
        Card card1 = deck.draw();
        Card card2 = deck.draw();
        Card card3 = deck.draw();
        Card card4 = deck.draw();
        Card card5 = deck.draw();
        assertEquals(51, deck.size());
        
        deck.discard(card1);
        assertEquals(52, deck.size());
        assertEquals(card1, deck.getTopCard());

        deck.discard(card2);
        assertEquals(53, deck.size());
        assertEquals(card2, deck.getTopCard());

        deck.discard(card3);
        assertEquals(54, deck.size());
        assertEquals(card3, deck.getTopCard());

        deck.discard(card4);
        assertEquals(55, deck.size());
        assertEquals(card4, deck.getTopCard());

        deck.discard(card5);
        assertEquals(56, deck.size());
        assertEquals(card5, deck.getTopCard());
    }

    /**
     * Ensures that when the drawPile is empty, the discardPile is shuffled and becomes the drawPile.
     */
    @Test
    void drawPileResetTest() {
        Deck deck = Deck.of(1, 1, 4);
        assertEquals(56, deck.size());
        Card card = deck.draw();
        for (int i = 0; i < 60; i++) {
            deck.discard(card);
            card = deck.draw();
        }
        assertEquals(55, deck.size());
    }
}