import java.util.Scanner;

public class PrintReverseNumber {
    //program for print reverse number

    public static void main(String[] args){ // main method of this class

        int r ; // declaring r variable
        System.out.print("Enter any 5 Number : "); // printing concatenation line and Enter number by user

        Scanner scanner = new Scanner(System.in); // Creating scanner object
        int num = scanner.nextInt(); // Declaring int num variable with scanner object

        System.out.print("Reverse order of numbers is :" );//printing concatenation line
        while (num>0) // Using while loop if num greater then 0
        {
           r = num%10; // storing remainder value in r variable
            System.out.print(r);// printing output as in reverse
            num = num/10;

        }
    }
}
