import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){ // main method of this class

        Scanner scanner = new Scanner(System.in);//creating scanner object
        System.out.print("Enter a number :"); // Enter number by user
        int num = scanner.nextInt();//declaring num variable with scanner object
        int count =0; // declaring count variable

        for (int i = 1; i <=num ; i++) { // using for loop
            if(num % i ==0)//if any number is divided by i and equal to 0
            {
                count++;// thn its enter this curly baracket n increase count by 1
            }
        }
        if(count==2)//condition for count is equal to 2 thn number is prime
        {
            System.out.println("Number is Prime");  // if number is prime then this line is print
        }else {
            System.out.println("Number is not Prime"); // if number is not prime then this line is print
        }
    }
}
