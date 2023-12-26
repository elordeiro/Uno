package cs410.uno;

enum Color {
    RED, GREEN, BLUE, YELLOW, WILD
}

enum Face {
    ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAW_TWO, WILD
}

/**
 * Represents a card in the game of Simplified Uno.
 *  A card has a color and a face.
 *  A card can be a wild card, which means it can be played on any card.
 *      A wild card's color has to be set once it is played.
 *      A wild card's color can only be set once.
 *      A [Color]-Wild card is allowed on the dicard pile but not in a players hand.
 *  A card can be played on another card if:
 *      The card's color matches the other card's color
 *      The card's face matches the other card's face
 *      The card is a wild card
 *      The other card is a wild card
 */
public class Card {
    private Color color;
    final private Face face;


    public Card(Color color, Face face) {
        if (color == Color.WILD && face != Face.WILD) {
            throw new RuntimeException("Wild card must have face WILD");
        }
        if (color != Color.WILD && face == Face.WILD) {
            throw new RuntimeException("Non-wild card cannot have face WILD");
        }
        this.color = color;
        this.face = face;
    }

    public static Card of (Color color, Face face) {
        return new Card(color, face);
    }

    /**
     * Sets the color of a wild card.
     * Only wild colors can be set, and they can only be set once.
     * Ex. Card: WILD-WILD can be set to RED-WILD
     *     Card: RED-WILD cannot be set to anything else
     *     Card: RED-ONE cannot be set to anything
     * @param newColor
     * @throws RuntimeException if the card is not a wild card or if the color has already been set
     */
    public void setColor(Color newColor) {
        if (color == Color.WILD && face == Face.WILD) {
            this.color = newColor;
        } else {
            throw new RuntimeException("Cannot change color of non-wild card");
        }
    }

    /**
     * Checks if a card can be played on another card.
     * Ex. Card: RED-ONE can be played on Card: RED-TWO
     *     Card: RED-ONE can be played on Card: BLUE-ONE
     *     Card: RED-ONE can be played on Card: RED-WILD
     *     Card: RED-ONE cannot be played on Card: BLUE-TWO
     *     Card: GREEN-SKIP can be played on Card: RED-SKIP
     *     Card: GREEN-SKIP can be played on Card: GREEN-TWO
     * @param other the card to be played on
     * @return true if the cards can be played on top of one another, false otherwise
     */
    public boolean matches(Card other) {
        return color == other.color || face == other.face || color == Color.WILD || other.color == Color.WILD;
    }

    /**
     * Checks if a card is a special card.
     * Special cards are cards that have non-numeral faces
     * Ex: Skip, Reverse, Draw Two, Wild
     * @return true if the card is a special card, false otherwise
     */
    public boolean isSpecial() {
        return color == Color.WILD || face == Face.SKIP || face == Face.REVERSE || face == Face.DRAW_TWO || face == Face.WILD;
    }

    /**
     * Checks if a card is valid.
     * A card is valid if it is has a WILD color with face WILD or if it has a non-WILD color.
     * Ex. Card: RED-ONE is valid
     *     Card: WILD-RED is not valid
     *     Card: RED-WILD is valid if it is on the discard pile
     *     Card: RED-WILD is not valid if it is in a player's hand
     * @return true if the card is valid, false otherwise
     */
    public boolean isValid() {
        if (color == Color.WILD) {
            return face == Face.WILD;
        }
        return true;
    }

    /**
     * Checks if a card is a wild card.
     * Wild cards are cards that still have a color of WILD
     * Ex: WILD-RED, WILD-GREEN, WILD-BLUE, WILD-YELLOW, WILD-WILD
     * @return true if the card is a wild card, false otherwise
     */
    public boolean isWild() {
        return color == Color.WILD;
    }

    /**
     * Gets the color of a card.
     * @return the color of the card
     */
    public Color getColor() {
        return color;
    }

    /**
     * Gets the face of a card.
     * @return
     */
    public Face getFace() {
        return face;
    }

    /**
     * String representation of a card.
     * @return a string representation of a card in the format "color-face"
     *        'color' is right justified and fills 6 spaces
     *        'face' is left justified and fills 8 spaces
     */
    public String toString() {
        return String.format("%6s-%-8s", color, face);
    }
}
