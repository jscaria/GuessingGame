import java.util.*;

public class Oracle {
   public static void main(String[] args){
      Scanner input = Scanner(System.in);
      
      System.out.println("Think of a number between 1 and 100.  Press enter when you're ready.");
      
      boolean notGuessed = true;
      int guess = 50;
      while(notGuessed){
         System.out.print("Is the number " + guess + "? Type 'Y' for Yes or 'N' for No. ");
         notGuessed = !input.next().toLowerCase().equals("y");
         
         System.out.print("Is the " + guess + " lower or higher? Type 'L' for lower or 'H' for higher.");
         guess /= 2;
        
      }
   }
}