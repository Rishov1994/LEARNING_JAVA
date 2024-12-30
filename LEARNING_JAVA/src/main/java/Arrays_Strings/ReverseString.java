package Arrays_Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scanner.nextLine();

        //Declare Empty String
        String rev = "";

        //Reverse The Original String
        for (int i= str.length()-1; i>=0; i--) {
            rev = rev + str.charAt(i);
            //rev += str.charAt(i);[Same Functionality]
        }

        //Print the Reversed String
        System.out.println("The Reversed String is: "+rev);





    }
}
