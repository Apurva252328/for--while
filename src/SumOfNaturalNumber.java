import java.util.Scanner;

public class SumOfNaturalNumber {
    // program for addition of natural number

      public static void main(String[] args){ // main method of this class
      int sum = 0; //declaring local sum variable

          System.out.println("Enter the number :"); // /printing concatenation line and value enter by user
          Scanner scanner = new Scanner(System.in); // creating a scanner object
          int num = scanner.nextInt(); // declaring num variable using scanner
          for (int i = 1; i <=num ; i++) { // using loop with incremental
              sum = sum+i;  // logic for addition of natural number
          }
          System.out.println("Addition of Natural numbers are =" +sum); // printing output with sum variable
      }
}
