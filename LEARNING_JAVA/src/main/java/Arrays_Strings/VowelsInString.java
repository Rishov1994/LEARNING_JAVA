package Arrays_Strings;

import java.util.Scanner;

public class VowelsInString {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scanner.nextLine();

        //Declare a variable to store the count of vowels
        int VowelCount=0;

        //Convert the String to LowerCase
        String strLower= str.toLowerCase();

        //Iterate Over The String
        for (int i=0; i<strLower.length(); i++){
            //Check if the character is a vowel
            char ch = strLower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                VowelCount++;
            }
        }
        System.out.println("The Number of Vowels in the String is: "+VowelCount);

    }
}
