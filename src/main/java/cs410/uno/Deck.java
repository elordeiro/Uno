package cs410.uno;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents a deck of cards in the game of Simplified Uno.
 * A deck has a draw pile, a discard pile and a top card.
 * After a deck is created it is set to play.
 * The first top card for the first round will never be a special card.
 * A deck will never run out of cards.
 * The discard pile will be shuffled and used as the draw pile once the draw pile is empty.
 * Players can draw cards from the draw pile.
 * Players can discard cards to the discard pile.
 * Players can see the top card of the discard pile.
 */
public class Deck {
    private ArrayList<Card> drawPile;
    private ArrayList<Card> discardPile;
    private Card topCard;

    public Deck(int countDigitCardsPerColor,
                int countSpecialCardsPerColor,
                int countWildCards) 
    {
        this.drawPile = new ArrayList<Card>();

        createCards(countDigitCardsPerColor, false);
        createCards(countSpecialCardsPerColor, true);
        for (int i = 0; i < countWildCards; i++) {
            drawPile.add(new Card(Color.WILD, Face.WILD));
        }

        shuffle();
        this.topCard = drawPile.remove(0);
        this.discardPile = new ArrayList<Card>();
        while (topCard.isSpecial()) {
            discard(topCard);
            topCard = draw();
        }
    }
    static public Deck of(int countDigitCardsPerColor,
                          int countSpecialCardsPerColor,
                          int countWildCards) 
    {
        return new Deck(countDigitCardsPerColor, countSpecialCardsPerColor, countWildCards);
    }

    private void createCards(int countCardsPerColor, boolean isSpecial) {
        for (int i = 0; i < countCardsPerColor; i++) {
            for (Color color : Color.values()) {
                for (Face face : Face.values()) {
                    try {
                        Card card = new Card(color, face);
                        if (card.isSpecial() == isSpecial && !card.isWild()) {
                            drawPile.add(card);
                        }
                    } catch (RuntimeException e) {
                        // Ignore invalid cards
                    }
                }
            }
        }
    }
    
    /**
     * Shuffles the draw pile.
     */
    public void shuffle() {
        Collections.shuffle(drawPile);
    }

    /**
     * Draws a card from the draw pile.
     * If the draw pile is empty, the discard pile is shuffled,
     * is used as the draw pile.
     * @return
     */
    public Card draw() {
        if (drawPile.isEmpty()) {
            drawPile = discardPile;
            discardPile = new ArrayList<Card>();
            shuffle();
        }
        return drawPile.remove(0);
    }

    /**
     * Discards a card. The discarded card becomes the top card, 
     * and the previous top card is added to the discard pile.
     * @param card
     */
    public void discard(Card card) {
        discardPile.add(topCard);
        topCard = card;
    }

    /**
     * Gets the top card of the discard pile.
     * @return
     */
    public Card getTopCard() {
        return topCard;
    }
    
    /**
     * Gets the number of cards in the entire deck including drawPile discardPile and topCard.
     * @return
     */
    public int size() {
        return drawPile.size() + discardPile.size() + 1;
    }
}