package BlackJack;

import java.util.ArrayList;

/**
 * Created by georgezsiga on 4/18/17.
 */
public class Deck {

  ArrayList<Card> deck;
  int numberOfCards;

  public Deck(int numberOfCards) {
    deck = new ArrayList<Card>();
    this.numberOfCards = numberOfCards;
  }


}
