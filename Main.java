import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Hello user I am a computer!");
    System.out.println("Would you like to play a game? (yes or no)");

    String response = scan.next();

    if (response.equals("yes")) {

      System.out.println("Well too bad.");
      System.out.println("It appears you expected more from this choice...")
      System.out.println("Oh... I know a game! The counting game! Would you like to play?");
      String response = scan.next();

    }
    else if (response.equals("no")) {

      System.out.println("Good, I was not going to spend a year making a game.");
    }
    
  }
}