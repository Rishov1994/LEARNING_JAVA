package Arrays_Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //Input The String
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str= scanner.nextLine();

        //Initialize an empty string to store the reversed result
        String revString = "";

        //Loop Through the String
        //Start Value= str.length()-1
        //Loop until int i>=0
        //Decrement i by 1 value (i--)
        for (int i = str.length()-1; i>=0; i--){
            //append values received to the revString
            revString += str.charAt(i);
        }
        System.out.println("Reversed String is " +revString);

        //Convert Both Strings to LowerCase
        String lower1= str.toLowerCase();
        String lower2= revString.toLowerCase();

        //Compare Both Strings
        if (lower1.equals(lower2)){
            System.out.println("The String Is Palindrome");
        }
        else {
            System.out.println("The String Is Not Palindrome");
        }
    }
}
