import java.util.Scanner;

public class MyCalculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      int firstNumber = input.nextInt();
      
      System.out.print("Enter another number: ");
      int secondNumber = input.nextInt();
      
      int firstPlusSecond = Add(firstNumber, secondNumber);
      System.out.println(firstNumber + "+" + secondNumber + "=" + firstPlusSecond);
      
      int firstMinusSecond = Subtract(firstNumber, secondNumber);
      System.out.println(firstNumber + "-" + secondNumber + "=" + firstMinusSecond);
      
      int firstTimesSecond = Multiply(firstNumber, secondNumber);
      System.out.println(firstNumber + "*" + secondNumber + "=" + firstTimesSecond);
      
      double firstDividedBySecond = Divide(firstNumber, secondNumber);
      System.out.println(firstNumber + "/" + secondNumber + "=" + firstDividedBySecond);
      
      int firstModSecond = Mod(firstNumber, secondNumber);
      System.out.println(firstNumber + "%" + secondNumber + "=" + firstModSecond);                 
   }
   
   
   public static int Add(int x, int y) {
      return x + y;
   }
   
   public static int Subtract(int x, int y) {
      return x - y;
   }
   
   public static int Multiply(int x, int y) {
      return x * y;
   }
   
   public static int Mod(int x, int y) {
      return x % y;
   }
   
   public static double Divide(int x, int y) {
      return (double)x / y;
   }
}