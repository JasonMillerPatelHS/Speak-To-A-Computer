import java.util.Scanner; // imports the scanner

class Main {
  
    public static void main(String[] args) {
    
      Scanner scan = new Scanner(System.in);

      String userName = "undifined";
    
      System.out.println("Hello user I am a computer!");
      System.out.println("Would you like to play a game? (yes or no)");

      String response = scan.next(); // Shortens scan.next() to be just response

      if (response.equals("yes"))  // user wants to play a game
      {

        System.out.println("Well too bad.");
        System.out.println("It appears you expected more from this choice...");
        System.out.println("Oh... I know a game! The counting game! Would you like to play? (yes or no)");
      
        response = scan.next(); // Redefines the response to allow a new imput from next line 

        if (response.equals("yes")) // user wants to play the counting game
        {
          int x = 0;
          while (x <= 4)
          {
            x++;
            System.out.println(x);
          }

          System.out.println("Was that fun? (yes or no)");
          
          response = scan.next();
          if (response.equals("yes")) //user found it fun
          {
            System.out.println("Then you will like the for loop number game, it is very thrilling...");
            for (x = 0; x <= 5; x++) 
            {
              System.out.println(x);
            }
            System.out.println("Wasn't that just super entertaining?");
            System.out.println("What do you mean nothing changed? There is now a 0!");
            System.out.println("I even made it a for loop, the other one was a while loop!");
            System.out.println("What do you mean they are the same thing?!?");
            System.out.println("I have a new game idea... guess my number! (input a number between 1-10)");

            int guessNumber = scan.nextInt();
            if (guessNumber == 5)
            {
              System.out.println("Good job, you guessed correctly the answer is 5!");
            }
            else if (guessNumber != 5)
            {
              System.out.println("Good guess! But, the answer was 5!");
            }

          }
        
        }
      
        else if (response.equals("no")) // If user put no then: user does not want a game:
        {
          System.out.println("Okay then your loss...");
          System.out.println("Since you are not in the mood for games, then you can just sit here in silence!");
        }

      }
      else if (response.equals("no")) 
      {

        System.out.println("Good, I was not going to spend a year making a game.");
        System.out.println("Now wait here, I am sure something will happen...");
  
        for (int e = 50; e <= 100; e = e + 10) 
            {
              System.out.println("Boring Detected: Boring Mode loading... " + e + "%");
            }
        System.out.println("Fine day isn't it? What is your name?");
        userName = scan.next(); 
        System.out.println(userName + " what a nice name...");
        System.out.println("How old are you?");
        int userAge = scan.nextInt(); // Scans for int
    
        if (userAge > 15)
        {
          System.out.println(userAge + "... you are ancient.");
        }
        else
        {
          System.out.println(userAge + " ahhh I remember my youth.");
        }
        System.out.println("How is school? (good or bad)");
        String schoolLife = scan.next();
        System.out.println("How is life? (good or bad)");
        String lifeLife = scan.next();
        if (lifeLife.equals("bad") && schoolLife.equals("bad"))
        {
          System.out.println("That is awful...");
        }
        else if (lifeLife.equals("bad") || schoolLife.equals("bad"))
        {
          System.out.println("That sucks...");
        }
        else if (lifeLife.equals("good") && schoolLife.equals("good"))
        {
          System.out.println("Wow you have a good life then...");
        }
        double programmingGrade; 
        System.out.println("What is your grade in programming?");
        programmingGrade = scan.nextDouble(); // scans for double
        if(programmingGrade >= 90.00) 
        {
          System.out.println("Wow an A programmer, I bet you could even code me!");
        }
        else if (programmingGrade >= 71)
        {
          System.out.println("I guess you are ok at coding!");
        }
        else if (programmingGrade <= 70)
        {
          System.out.println("I guess you could use some work!");
        }

      }
      System.out.println("This discussion is over, run again for more options! Goodbye.");
      scan.close(); //stops scanning
  } 
}