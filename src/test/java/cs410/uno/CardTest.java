package cs410.uno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    static Card redZero = Card.of(Color.RED, Face.ZERO);
    static Card yellowSkip = Card.of(Color.YELLOW, Face.SKIP);
    static Card greenReverse = Card.of(Color.GREEN, Face.REVERSE);
    static Card blueDrawTwo = Card.of(Color.BLUE, Face.DRAW_TWO);

    @Test 
    void Card() {
        assertThrows(RuntimeException.class, () -> Card.of(Color.WILD, Face.ONE));
        assertThrows(RuntimeException.class, () -> Card.of(Color.RED, Face.WILD));
    }

    /**
     * Tests the getColor method.
     * Ensures that the color of a card is the same as the color of the card that was created.
     */
    @Test
    void getColorTest() {
        Card wild = Card.of(Color.WILD, Face.WILD);
        assertEquals(Color.RED, redZero.getColor());
        assertEquals(Color.YELLOW, yellowSkip.getColor());
        assertEquals(Color.GREEN, greenReverse.getColor());
        assertEquals(Color.BLUE, blueDrawTwo.getColor());
        assertEquals(Color.WILD, wild.getColor());
    }
    /**
     * Tests the setColor method.
     * The first test is to ensure that the color of a wild card can be set.
     * The second test is to ensure that the color of a wild card cannot be set a second tine.
     * The third test is to ensure that the color of a non-wild card cannot be set.
     */
    @Test
    void setColorTest() {
        Card card = Card.of(Color.WILD, Face.WILD);
        card.setColor(Color.RED);
        assertEquals(Color.RED, card.getColor());
        assertThrows(RuntimeException.class, () -> card.setColor(Color.BLUE));
        assertThrows(RuntimeException.class, () -> redZero.setColor(Color.RED));
    }

    /**
     * Tests the getFace method.
     * Ensures that the face of a card is the same as the face of the card that was created.
     */
    @Test
    void getFaceTest() {
        Card wild = Card.of(Color.WILD, Face.WILD);
        assertEquals(Face.ZERO, redZero.getFace());
        assertEquals(Face.SKIP, yellowSkip.getFace());
        assertEquals(Face.REVERSE, greenReverse.getFace());
        assertEquals(Face.DRAW_TWO, blueDrawTwo.getFace());
        assertEquals(Face.WILD, wild.getFace());
    }

    /**
     * Tests the matches method.
     * Ensures that cards with same faces or same colors match, whether or not they are a special card.
     * Ensures that cards with different faces and different colors do not match.
     * Ensures that wild cards matchs all cards in both ways, card1 matches card2 and card2 matches card1.
     */
    @Test
    void matchesTest() {
        assertTrue(redZero.matches(Card.of(Color.RED, Face.ONE)));
        assertTrue(redZero.matches(Card.of(Color.RED, Face.SKIP)));
        assertTrue(redZero.matches(Card.of(Color.RED, Face.REVERSE)));
        assertTrue(redZero.matches(Card.of(Color.RED, Face.DRAW_TWO)));
        assertTrue(redZero.matches(Card.of(Color.YELLOW, Face.ZERO)));
        assertTrue(redZero.matches(Card.of(Color.GREEN, Face.ZERO)));
        assertTrue(redZero.matches(Card.of(Color.BLUE, Face.ZERO)));
        
        assertTrue(yellowSkip.matches(Card.of(Color.YELLOW, Face.ONE)));
        assertTrue(yellowSkip.matches(Card.of(Color.YELLOW, Face.SKIP)));
        assertTrue(yellowSkip.matches(Card.of(Color.YELLOW, Face.REVERSE)));
        assertTrue(yellowSkip.matches(Card.of(Color.YELLOW, Face.DRAW_TWO)));
        assertTrue(yellowSkip.matches(Card.of(Color.RED, Face.SKIP)));
        assertTrue(yellowSkip.matches(Card.of(Color.GREEN, Face.SKIP)));
        assertTrue(yellowSkip.matches(Card.of(Color.BLUE, Face.SKIP)));

        assertFalse(redZero.matches(Card.of(Color.BLUE, Face.ONE)));
        assertFalse(redZero.matches(Card.of(Color.BLUE, Face.SKIP)));
        assertFalse(redZero.matches(Card.of(Color.BLUE, Face.REVERSE)));
        assertFalse(redZero.matches(Card.of(Color.BLUE, Face.DRAW_TWO)));
        assertFalse(redZero.matches(Card.of(Color.YELLOW, Face.ONE)));
        assertFalse(redZero.matches(Card.of(Color.GREEN, Face.ONE)));

        Card wild = Card.of(Color.WILD, Face.WILD);
        assertTrue(wild.matches(redZero));
        assertTrue(wild.matches(yellowSkip));
        assertTrue(wild.matches(greenReverse));
        assertTrue(wild.matches(blueDrawTwo));
        assertTrue(wild.matches(wild));

        assertTrue(redZero.matches(wild));
        assertTrue(yellowSkip.matches(wild));
        assertTrue(greenReverse.matches(wild));
        assertTrue(blueDrawTwo.matches(wild));
    }

    /**
     * Tests the isSpecial method.
     * Ensures that only special cards are special.
     */
    @Test
    void isSpecialTest() {
        assertFalse(redZero.isSpecial());
        assertTrue(yellowSkip.isSpecial());
        assertTrue(greenReverse.isSpecial());
        assertTrue(blueDrawTwo.isSpecial());
        assertTrue(Card.of(Color.WILD, Face.WILD).isSpecial());
    }

    /**
     * Tests the isValid method.
     * Ex. of non-valid cards:
     * - Card.of(Color.WILD, Face.ONE)
     * - Card.of(Color.RED, Face.WILD) with its affect still active
     */
    @Test
    void isValidTest() {
        assertTrue(redZero.isValid());
        assertTrue(yellowSkip.isValid());
        assertTrue(greenReverse.isValid());
        assertTrue(blueDrawTwo.isValid());
        
        Card wild = Card.of(Color.WILD, Face.WILD);
        assertTrue(wild.isValid());
        wild.setColor(Color.RED);
        assertTrue(wild.isValid());
        
        assertThrows(RuntimeException.class, () -> Card.of(Color.WILD, Face.ONE));
    }

    /**
     * Tests the isWild method.
     * Ensures that only wild cards are wild.
     */
    @Test
    void isWildTest() {
        assertFalse(redZero.isWild());
        assertFalse(yellowSkip.isWild());
        assertFalse(greenReverse.isWild());
        assertFalse(blueDrawTwo.isWild());
        assertTrue(Card.of(Color.WILD, Face.WILD).isWild());
    }
}