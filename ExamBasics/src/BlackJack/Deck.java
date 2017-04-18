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
    for (int i = 0; i < numberOfCards ; i++) {
      Card card = new Card("Spade", "2");
      deck.add(card);
    }
  }

}
