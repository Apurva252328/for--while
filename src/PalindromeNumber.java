import java.util.Scanner;

public class PalindromeNumber {
    //Find out number is palindrome number or not

    public static void main(String[] args){ // main method

        int c , rem ,s=0 ; // local variable of main method
        System.out.println(" Enter any Number :"); // Enter number by user

        Scanner scanner = new Scanner(System.in); // Creating scanner object
        int num = scanner.nextInt(); // declaring num variable of scanner object

        c = num; //transfer num value in c variable

        while (num>0){ // condition for num variable
           rem=num%10; // remainder value store in rem variable
            s = (s*10)+rem; // logic for palindrome number
            num = num/10;
        }
        if(c==s) // comparing the value of c and s variable
        {
            System.out.println("It is Palindrome Number"); // if number is palindrome thn this line is print
        }
        else {
            System.out.println("It is not Palindrome Number"); // if number is not palindrome thn this line is print
        }

    }
}
