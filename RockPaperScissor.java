public class RockPaperScissor {
   public static void main(String[] args) {
      System.out.println("Pick rock (1), paper (2) or scissors (3): ");
      String yourGuess = "rock";
      String computerGuess = "scissors";
      
      if(yourGuess.equals("rock")) {
         if(computerGuess.equals("scissors")) {
         
            System.out.println("You lost!   Computer picked rock.");
         }
         
         if(computerGuess.equals("paper")) {
         
            System.out.println("You won!   Computer picked rock.");
         }
      }
      
      if(yourGuess.equals("scissors")) {
         if(computerGuess.equals("rock")) {
         
            System.out.println("You lost!   Computer picked rock.");
         }
         
         if(computerGuess.equals("paper")) {
         
            System.out.println("You won!   Computer picked paper.");
         }
      }
            
 
       
      if(yourGuess.equals("paper")) {
         if(computerGuess.equals("rock")) {
         
            System.out.println("You won!   Computer picked rock.");
         }
         
         if(computerGuess.equals("scissors")) {
         
            System.out.println("You lost!   Computer picked rockscissors.");
         }
      }
          
               
   }
}