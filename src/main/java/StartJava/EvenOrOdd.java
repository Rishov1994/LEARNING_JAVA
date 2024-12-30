package StartJava;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        //Scan User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = scanner.nextInt();

        if (num %2==0) //Condition
        {
        //Syntax for Even Number
            System.out.println("The Number is Even");
        }
        else {
            //Syntax for Odd Number
            System.out.println("The Number is Odd");
        }

    }
}
