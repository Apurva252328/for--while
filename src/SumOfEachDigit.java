import java.util.Scanner;

public class SumOfEachDigit {
    //program for addition of each  five digits number

    public static void main(String[] args){ // main method of this class
        int rem, sum =0;
       // local variable of main method can access only

        System.out.println("Enter any 5 number : ");// printing concatenation line Enter number by user

        Scanner scanner = new Scanner(System.in); // Creating scanner object
        int num = scanner.nextInt(); // declaring num variable with scanner object

        // if num =256
        while(num>0){ // using while loop
            rem = num % 10; // remainder is 6
            sum = sum + rem; // sum = 0 +6
            num = num /10; // 256/10 = 25 so on goes like this
        }
        System.out.println("Sum of Each 5 Digit :" + sum); // printing output of sum of each digit

    }
}
