package OddAverage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Created by georgezsiga on 4/18/17.
 */
class OddAvgTest {

  OddAvg oddAvg = new OddAvg();


  @Test
  void averageOf7numbers() {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7};
    assertEquals(4.0, oddAvg.averageValueOfOddNumbers(numbers));
  }

  @Test
  void averageOfnoOdds() {
    int[] numbers = {2, 4, 6, 8};
    assertEquals(0.0, oddAvg.averageValueOfOddNumbers(numbers));
  }

  @Test
  void averageOfOneOdd() {
    int[] numbers = {2, 4, 1, 6, 8};
    assertEquals(1.0, oddAvg.averageValueOfOddNumbers(numbers));
  }

}