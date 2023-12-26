package cs410.uno;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Optional;

/**
 * Represents a player in the game of Simplified Uno.
 * A player has a name and a hand of cards.
 * A player will always play a card if they can.
 * A player will always play a valid card.
 * The card the player will choose is the first valid card in their hand after their hand is shuffled.
 * If the player plays a wild card, the color of the wild card will be the color that the player 
 * has the most of in their hand.
 */
public class Player {

    final private String name;
    final private ArrayList<Card> hand;

    /**
     * Creates a player with a name and an empty hand.
     * @param name
     */
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    /**
     * Creates a player with a name and an empty hand.
     * @param name
     */
    public static Player of(String name) {
        return new Player(name);
    }

    /**
     * Plays a card from a player's hand.
     * If the player has a valid card, it will be removed from their hand and returned in an optional.
     * If the player does not have a valid card, an empty optional will be returned.
     * If the player has a wild card, the color of the wild card will be set to the color that the 
     * player has the most of in their hand.
     * @param topCard
     * @return an optional containing the card to be played or an empty optional if the player cannot play a card
     */
    public Optional<Card> playCard(Card topCard) {
        Collections.shuffle(hand);
        for (Card card : hand) {
            if (card.matches(topCard)) {
                removeCard(card);
                if (card.isWild()) {
                    card.setColor(pickColor());
                }
                return Optional.of(card);
            }
        }
        return Optional.empty();
    }
    
    /**
     * Picks a color for a wild card.
     * The color will be the color that the player has the most of in their hand.
     * @return the color that the player has the most of in their hand
     */
    private Color pickColor() {
        int red = 0;
        int green = 0;
        int blue = 0;
        int yellow = 0;
        for (Card card : hand) {
            if (card.getColor() == Color.RED) {
                red++;
            } else if (card.getColor() == Color.GREEN) {
                green++;
            } else if (card.getColor() == Color.BLUE) {
                blue++;
            } else if (card.getColor() == Color.YELLOW) {
                yellow++;
            }
        }
        if (red >= green && red >= blue && red >= yellow) {
            return Color.RED;
        } else if (green >= red && green >= blue && green >= yellow) {
            return Color.GREEN;
        } else if (blue >= red && blue >= green && blue >= yellow) {
            return Color.BLUE;
        } else {
            return Color.YELLOW;
        }
    }

    /**
     * Gets the name of a player.
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the hand of a player.
     * @return 
     */
    public ArrayList<Card> getHand() {
        return hand;
    }

    /**
     * Adds a card to a player's hand.
     * @param card
     */
    public void addCard(Card card) {
        hand.add(card);
    }

    /**
     * Removes a card from a player's hand.
     * @param card
     */
    public void removeCard(Card card) {
        hand.remove(card);
    }

    /**
     * Checks if a player has won.
     * @return true if the player has won, false otherwise
     */
    public boolean hasWon() {
        return hand.isEmpty();
    }

    /**
     * String representation of a player.
     * @return the name of the player, their card count and their hand
     */
    @Override
    public String toString() {
        return name + " hand [" + hand.size() + "]: " + hand;
        
    }

    /**
     * Checks if two players are equal.
     */
    public boolean equals(Object other) {
        if (other instanceof Player op) {
            return name.equals(op.name);
        }
        return false;
    }
}