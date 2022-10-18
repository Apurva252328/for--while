public class StringCount {
    // program for count character from name
    public static int count (String s, char x)
    // method with parameter  with return type
    {
        int store = 0; //local variable and store 0 value
        for (int i = 0 ; i<s.length();i++) // using for loop
        {
           if (s.charAt(i)==x)  // logic for find character from string variable
               store++;
        }

        return store;
    }
    public static void main(String[] args){ // main method
        String name ="apurva patel"; // local variable of main method can access only
        char x='a';
        System.out.println(count(name,x)); // printing output of how many a has in name variable
    }
}
