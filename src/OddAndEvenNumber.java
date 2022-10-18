import java.util.Scanner;

public class OddAndEvenNumber {
    // program for find out odd and even number
    public static void main(String[] args) {
        int i ;// i variable initialized with 1 value
        int rem, sum = 0; // local variable for main method

        System.out.print("Enter any 5 Numbers :"); // enter number by user
        Scanner scanner = new Scanner(System.in); // creating scanner object
        int num = scanner.nextInt(); //declaring scanner variable
        if (num%2==0){  // comparing reminder of num is equal to zero thn its goes inside the loop
            for (i=0;i<=num;i=i+2)  // for loop for printing even number
            {
                sum=sum+i;  // everytime store new value in sum
            }
            System.out.println("Sum of Even Number " + sum);//output for even number
        }else {
            for (i = 1; i <=num ; i=i+2) // loop for odd number
            {
               sum=sum+i; //everytime store new value in sum
            }
            System.out.println("Sum of Odd Number " + sum); // output for odd number
        }

    }
}




