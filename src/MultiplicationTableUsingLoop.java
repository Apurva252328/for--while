import java.util.Scanner;

public class MultiplicationTableUsingLoop {
    // print multiplication table of given number

    public static void main(String[] args){ // main method of this class

        System.out.print(" Enter any Number for Table: "); // Enter number by user for any table
        Scanner scanner = new Scanner(System.in); // creating scanner object
        int num = scanner.nextInt();  // declaring num variable using scanner object

        System.out.print("Enter Last Number : ");// how far user wants multiplication table goes upTo
        int lastNum = scanner.nextInt();  // declaring  variable with scanner object

        System.out.println("Multiplication Table of "+ num +" is :"); // print line with concatenation
        for (int i = 1; i <=lastNum; i++) { // for loop with incremental
            System.out.println(num + "*" + i + "=" + num*i); // logic for multiplication table
            
        }


    }

}
