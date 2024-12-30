package StartJava;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char c= scanner.next().charAt(0);

        if (c== 'A' || c== 'E' || c== 'I' || c== 'O' || c== 'U' || c== 'a' || c== 'e' || c== 'i' || c== 'o' || c== 'u'){
            System.out.println("The Character is Vowel");
        }
        else {
            System.out.println("The Character is Consonant");
        }


    }
}
