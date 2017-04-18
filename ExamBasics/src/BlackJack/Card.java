package BlackJack;

/**
 * Created by georgezsiga on 4/18/17.
 */
public class Card {

  String color, value;

  public Card(String color, String value) {
    this.color = color;
    this.value = value;
  }

  @Override
  public String toString() {
    return value + " " + color;
  }
}
