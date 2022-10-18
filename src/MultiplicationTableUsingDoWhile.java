import java.util.Scanner;

public class MultiplicationTableUsingDoWhile {
    //program for multiplication table using do while loop

    public static void main(String [] args){ // main method
        int i =1,j=1 , output,output1, num1 ,num2, output2; // local variable for main method can access only

        Scanner scanner = new Scanner(System.in); // creating scanner object
        System.out.print("Enter any number : "); //for number to print
        int num = scanner.nextInt(); //declaring num variable for scanner object

        System.out.println("Multiplication Table of " + num + " : "); // print  output with  concatenation line

       do{     //  in do we do loop action first

            output= num*i; // logic for 1st column
            System.out.print(output + " " ); //printing output for 1st column
            i = i+1; //incremental by 1 and add in i variable

            num1=num+1; // add num with 1 and store new value variable num1

            output1 = num1*j;  // logic for 2nd column
            System.out.print(output1+ " "); //printing output for 2nd column
            j= j+1; // incremental by 1 and add in j variable

           output2 =output+output1; // adding output and output1 and everytime in output2
           System.out.println(output2 + " "); //printing output for 3rd column

       }
       while (i<=3); // in while statement  we give condition how many time loop goes on

    }

}
