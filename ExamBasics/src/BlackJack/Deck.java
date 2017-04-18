package BlackJack;

import java.util.ArrayList;

/**
 * Created by georgezsiga on 4/18/17.
 */
public class Deck {

  ArrayList<Card> deck;
  int numberOfCards, hearts, spades, diamonds, clubs;

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
    for (int i = 0; i < deck.size() ; i++) {
      if (deck.get(i).color.contains("Hearts")) {
        hearts ++;
      } else if (deck.get(i).color.contains("Spades")) {
        spades ++;
      } else if (deck.get(i).color.contains("Diamonds")) {
        diamonds ++;
      } else {
        clubs ++;
      }
    }
  }


  @Override
  public String toString() {
    return numberOfCards + " cards - " + clubs + " Clubs, " + diamonds + " Diamonds, " + hearts + " Hearts, " + spades + " Spades";
  }

  public int randomCardValue() {
    int cardValue = (int) (Math.random() * 13 +1);
    return cardValue;
  }

  public int randomCardColor() {
    int cardValue = (int) (Math.random() * 4);
    return cardValue;
  }
}
