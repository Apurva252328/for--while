public class NumberDividedBy {
    // Program of print number divisible by 3 and 5
    public static void main(String[] args){ // main method of this class

        System.out.println("Numbers Divisible by 3 :");// printing concatenation line
        for (int i = 1; i <=100 ; i++)//loop is goes on until 100 times
        {
            if(i%3==0) //logic for number divisible by 3
            {
                System.out.print(i+" "); // print output for number divisible by 3
            }
        }
        System.out.println(); // print blank line between output 3 and 5

        System.out.println("Numbers Divisible by 5 :"); //printing concatenation line

        for (int i = 1; i <=100 ; i++) //using for loop
        {
            if (i%5==0) // logic for number divisible by 5
            {
                System.out.print(i+" "); // print output for number divisible by 5
            }
        }
    }
}
