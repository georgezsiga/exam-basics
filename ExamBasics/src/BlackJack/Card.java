package BlackJack;

/**
 * Created by georgezsiga on 4/18/17.
 */
public class Card {

  String color, value;

  public Card(int randColor, int randNum) {
    if (randColor == 0) {
      this.color = "Hearts";
    } else if (randColor == 1) {
      this.color = "Spades";
    } else if (randColor == 2) {
      this.color = "Diamonds";
    } else {
      this.color = "Clubs";
    }
    if (randNum == 1) {
      this.value = "Ace";
    } else if (randNum > 0 && randNum < 11) {
      this.value = Integer.toString(randNum);
    } else if (randNum == 11) {
      this.value = "Jack";
    } else if (randNum == 12) {
      this.value = "Queen";
    } else {
      this.value = "King";
    }
  }

  @Override
  public String toString() {
    return value + " " + color;
  }
}
