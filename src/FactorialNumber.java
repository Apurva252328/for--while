import java.util.Scanner;

public class FactorialNumber {
    // Print factorial number of any number
    public static void main(String[] args){
       int fact = 1; // declaring local variable fact and store value 1 in it

        System.out.print("Enter any Number :"); // Enter number by user
        Scanner scanner = new Scanner(System.in); // Creating scanner object

        int num = scanner.nextInt(); // declaring local variable num with scanner object

        for (int i = 1; i <=num ; i++) // using for loop
        {
          fact = fact*i; // logic for factorial
        }
        System.out.println("Factorial Number is " + fact); // printing output of factorial number with fact variable
    }
}
