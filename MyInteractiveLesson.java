import java.util.Scanner;

public class MyInteractiveLesson {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter your name: ");
      String yourName = input.next();
      
      System.out.println("Good morning, " + yourName + "!");
      
      System.out.print(yourName + ", what year were you born? ");
      int yourBirthYear = input.nextInt();
                 
      int thisYear = 2015;     
      int yourAge = thisYear - yourBirthYear;
      
      System.out.println(yourName + ", it seems like you are " + yourAge + " years old or going to turn " + yourAge + "this year!");
   }
}