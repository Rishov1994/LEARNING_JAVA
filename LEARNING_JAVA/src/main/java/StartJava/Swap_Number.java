package StartJava;

//This is A Program To Swap Two Variables without Using A Third Variable

import java.util.Scanner;

public class Swap_Number {
    public  static void main(String args[]){
        //Scan User Input For Two Variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the Second Number: ");
        int b = scanner.nextInt();

        //Reassign Values
        //Taking Example of a=5 and b=10
        a= a+b; //Now a= 5+10=15
        b= a-b; //Now b= 15-10=5
        a= a-b; //Now a= 15-5=10

        System.out.println("After Swapping New Value Of a: "+a);
        System.out.println("After Swapping New Value Of b: "+b);

    }
}
