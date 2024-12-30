package StartJava;

import java.util.Scanner;

public class InRangeNumber {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = scanner.nextInt();

        //Check if the number is in the range of 1 to 100
        if (num>=1 && num<=100){
            System.out.println("The Number is within Range");
        }
        else {
            System.out.println("The Number is not wihtin Range");
        }

    }}
