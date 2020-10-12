import java.util.Scanner; // imports the scanner

class Main {}
public class ComputerSpeak{
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Hello user I am a computer!");
    System.out.println("Would you like to play a game? (yes or no)");

    String response = scan.next(); // Shortens scan.next() to be just response

    if (response.equals("yes")) 
    {

      System.out.println("Well too bad.");
      System.out.println("It appears you expected more from this choice...");
      System.out.println("Oh... I know a game! The counting game! Would you like to play? (yes or no)");
      
       response = scan.next(); // Redefines the response to allow a new imput from next line 

      if (response.equals("yes"))
      {
        int x = 0;
        while (x <= 4)
        {

          x++;

         System.out.println(x);

        }

        System.out.println("Was that fun? (yes or no)");
        response = scan.next();
        if (response.equals("yes"))
        {
          System.out.println("Then you will like the for loop number game, it is very thrilling...");
          for (x = 0; x <= 5; x++) 
          {
            System.out.println(x);
          }
          System.out.println("Wasn't that just super entertaining?");
        }

      }
      
      if (response.equals("no")) 
      {

        System.out.println("Okay then your loss...");
        System.out.println("Since you are not in the mood for games, then you can just sit here in silence!");
      }

    }
    else if (response.equals("no")) {

      System.out.println("Good, I was not going to spend a year making a game.");
    }
    
  }
}