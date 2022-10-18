import java.util.Scanner;

public class PrintNumbers {
// program for printing any 10 numbers from user input range

        public static void main(String[] args){ // main method of this class

            Scanner scanner = new Scanner(System.in);
            //Creating scanner object so user can enter any no. as per there choice

            System.out.print("Enter Start of Number : "); // /printing concatenation line
            int a = scanner.nextInt();
            // Declaring variable a for printing value of start number.

            System.out.print("Enter End of Number : "); ///printing concatenation line
            int b = scanner.nextInt();
            // Declaring variable b for printing value of end number .

            for (int i = a; i <=b ; i++) // using for loop if I >=to b variable
            {
                System.out.println("Output of user input range is : " + i); // /printing output with concatenation line

            }
        }


}
