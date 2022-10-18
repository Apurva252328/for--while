import java.util.Scanner;

public class FibonacciSeries {
    // Program for print 7 numbers of fibonacci series
    public static void main(String[] args){ // main method of this class

        Scanner scanner = new Scanner(System.in);
        //creating object of scanner

        System.out.print("Enter value of a : "); // printing concatenation line and value enter by user
        int a = scanner.nextInt();
        // declaring variable a with help of scanner object

        System.out.print("Enter value of b : "); //printing concatenation line and value enter by user
        int b = scanner.nextInt();
        // declaring variable b with help of scanner object

        int c ;
        // declaring variable c
        System.out.print("Fibonacci Series is :"); //printing concatenation line

        for (int i = 0; i < 7; i++) // print 7 times number with the help of loop
        {
            System.out.print(a + " ");
            c = a +b; // addition of variable a and b is store in c
            a = b; // value of b is store in a
            b = c; // value of c is store in b

        }
    }
}
