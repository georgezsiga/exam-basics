package OddAverage;

/**
 * Created by georgezsiga on 4/18/17.
 */

public class OddAvg {

  public double averageValueOfOddNumbers(int[] numbers) {
    int totalOfOddNumbers = 0;
    int counter = 0;
    for (int i = 1; i < numbers.length; i += 2) {
      if (numbers[i] % 2 == 1) {
        totalOfOddNumbers += i;
        counter ++;
      }
    }
    double averageOfOddNumbers = totalOfOddNumbers / counter;
    return averageOfOddNumbers;
  }

  public static void main(String[] args) {
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases
  }
}
