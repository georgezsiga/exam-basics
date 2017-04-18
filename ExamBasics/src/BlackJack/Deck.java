package BlackJack;

import java.util.ArrayList;

/**
 * Created by georgezsiga on 4/18/17.
 */
public class Deck {

  int numberOfCards, hearts, spades, diamonds, clubs;
  ArrayList<Card> deck;

  public Deck(int wholeNumber) {
    deck = new ArrayList<Card>();
    this.numberOfCards = wholeNumber;
    addCards();
  }

  public void addCards() {
    if (numberOfCards < 4) {
      for (int i = 0; i < numberOfCards; i++) {
        Card card = new Card(i, randomCardValue());
        deck.add(card);
      }
    } else {
      for (int i = 0; i < numberOfCards; i++) {
        if (i < 4) {
          Card card = new Card(i, randomCardValue());
          deck.add(card);
        } else {
          Card card = new Card(randomCardColor(), randomCardValue());
          deck.add(card);
        }
      }
    }
  }

  public void colorsInTheDeck() {
    hearts = 0;
    spades = 0;
    diamonds = 0;
    clubs = 0;
    for (int i = 0; i < deck.size(); i++) {
      if (deck.get(i).color.contains("Hearts")) {
        hearts++;
      } else if (deck.get(i).color.contains("Spades")) {
        spades++;
      } else if (deck.get(i).color.contains("Diamonds")) {
        diamonds++;
      } else {
        clubs++;
      }
    }
  }

  public Card draw() {
    Card card = deck.get(0);
    deck.remove(card);
    return card;
  }

  public void shuffleDeck() {
    ArrayList<Card> tempDeck = new ArrayList<Card>();
    while (deck.size() > 0) {
      Card card = deck.get(randomGetACard(deck.size()));
      tempDeck.add(card);
      deck.remove(card);
    }
    deck = tempDeck;
  }

  public int randomCardValue() {
    int cardValue = (int) (Math.random() * 13 + 1);
    return cardValue;
  }

  public int randomCardColor() {
    int cardValue = (int) (Math.random() * 4);
    return cardValue;
  }

  public int randomGetACard(int deckSize) {
    int getThisCard = (int) (Math.random() * deckSize);
    return getThisCard;
  }

  @Override
  public String toString() {
    colorsInTheDeck();
    return deck.size() + " cards - " + clubs + " Clubs, " + diamonds + " Diamonds, " + hearts
        + " Hearts, " + spades + " Spades";
  }
}
