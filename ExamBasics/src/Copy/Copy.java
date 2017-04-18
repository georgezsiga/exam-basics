package Copy;

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

  private void noArgument() {
    System.out.println("The usage of the command is:");
    System.out.println("copy [source] [destination]");
  }





  public static void main(String[] args) {



  }
}
