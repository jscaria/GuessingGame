import java.util.*;

// There's a great write up for this at http://www.java-made-easy.com/guessing-game.html.

public class MyGuessingGame {
   public static void main(String[] args) {
      System.out.println("your name");
      Random r = new Random();
 
      boolean playing = true;
      Scanner input = new Scanner(System.in);
      
      while(playing) {
         int answer = r.nextInt(100)+1;
         System.out.println("Answer = " + answer);
   
 
         System.out.println("I'm thinking of a number between 1 and 100...");
         
         System.out.print("Your guess? ");
         int guess = input.nextInt();
         int numberOfGuesses = 1;
         
         while(guess != answer) {
            if(guess > answer) {
               System.out.println("It's lower.");
            }else if(guess < answer) {
               System.out.println("It's higher.");
            }
            
            numberOfGuesses++;
            System.out.print("Your guess? ");
            guess = input.nextInt();
         }
         
         System.out.println("You got it right in " + numberOfGuesses + " guesses!");
         System.out.print("Do you want to play again? "); 
         
         playing = input.next().toLowerCase().startsWith("y");
      }
   }
}