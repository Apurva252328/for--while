import java.util.Scanner;

public class SumOfFirstAndLastDigit {
    // program for one and last digit of 5 numbers

    public static void main(String[] args){ // main method of this class

        Scanner scanner = new Scanner(System.in); //creating scanner object
        System.out.print("Enter any 5 Digit Number :"); // printing 5 digit number
        int num = scanner.nextInt(); // declaring num variable with scanner object

        int lastDigit = num%10; // logic for find out last digit from 5 numbers
        int firstDigit = num;  // store value of num in first digit variable

        while (firstDigit>=10) {  // using while loop
         firstDigit = firstDigit/10; //logic for first digit
        }
        System.out.println("First Digit : " + firstDigit); // output for printing of one digit
        System.out.println("Last Digit : " + lastDigit);  // output for  printing of last digit
        System.out.println("Sum of first and last digit = " +(firstDigit+lastDigit)); // sum of one and last digit

    }
}
