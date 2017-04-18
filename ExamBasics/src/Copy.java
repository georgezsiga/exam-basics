import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by georgezsiga on 4/18/17.
 */
// This should be the basic replica of the 'cp' command
// If ran from the command line without arguments
// It should print out the usage:
// copy [source] [destination]
// When just one argument is provided print out
// No destination provided
// When both arguments provided and the source is a file
// Read all contents from it and write it to the destination
public class Copy {

  private String[] args;

  private Copy(String[] args) {
    this.args = args;
  }

  private boolean contains(String argument) {
    if (args.length > 0) {
      for (String arg : args) {
        if (arg.contains(argument)) {
          return true;
        }
      }
    }
    return false;
  }

  private void noArgument() {
    System.out.println("The usage of the command is:");
    System.out.println("copy [source] [destination]");
  }

  private void oneArgument() {
    System.out.println("No destination provided");
  }

  private void copyFile() {

    String fileSource;
    String destination;
    try {
      Path filePath = Paths.get(fileSource);
      List<String> lines = Files.readAllLines(filePath);
      printToFile(destination, lines);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("There is a prbblem reading the file");
    }
  }

  public void printToFile(String destination, List<String> content) {
    try {
      Path filePath = Paths.get(destination);
      Files.write(filePath, content);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Uh-oh, could not write the file!");
    }
    System.out.println("You successfully copied the file");
  }

  public static void main(String[] args) {
    Copy argument = new Copy(args);
    if (args.length == 0) {
      argument.noArgument();
    } else if (args.length == 1) {
      argument.oneArgument();
    } else {
      argument.copyFile();
    }
  }
}
