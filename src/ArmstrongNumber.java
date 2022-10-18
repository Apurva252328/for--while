import java.util.Scanner;

public class ArmstrongNumber {
    //Print the number is armstrong number or not

    public static void main (String [] args){ // main method of this class
        int c , rem , arm =0; // local variable of main method
        System.out.println("Enter any Number"); // /printing concatenation line and Number enter by user
        Scanner scanner = new Scanner(System.in); // Creating scanner object
        int num =scanner.nextInt(); // declaring num variable by scanner object
        c = num; // storing num value in c variable
        while (num>0) // using while loop
        {
            rem = num%10; // by this logic remainder value  store in rem variable
            arm = (rem*rem*rem)+arm; // logic for armstrong number
            num = num/10; // num variable divided by 10 store in num
        }
        if(c==arm){ // comparing value of c and num variable
            System.out.println("It is Armstrong Number");  // printing this line if number is armstrong
        }
        else{
            System.out.println("It is not armstrong Number"); // printing this line if number is not armstrong
        }
    }
}
