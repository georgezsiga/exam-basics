package BlackJack;

import java.util.ArrayList;

/**
 * Created by georgezsiga on 4/18/17.
 */
public class Deck {

  ArrayList<Card> deck;
  int numberOfCards;

  public Deck(int wholeNumber) {
    deck = new ArrayList<Card>();
    this.numberOfCards = wholeNumber;
    addCards();
  }

  public void addCards() {
    if (numberOfCards < 4) {

    } else {
      for (int i = 0; i < numberOfCards; i++) {
        int randNum = randomCardValue();
        int randColor = randomCardColor();
        Card card = new Card(randColor, randNum);
        deck.add(card);
      }
    }
  }

  @Override
  public String toString() {
    return numberOfCards + " cards - ";
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
