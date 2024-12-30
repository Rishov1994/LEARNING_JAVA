package StartJava;

import java.util.Scanner;
public class AverageOfNos {
    public static void main(String[] args)
    {
        //Scan User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int num1 = scanner.nextInt();

        System.out.println("Enter The Second Number");
        int num2 = scanner.nextInt();

        System.out.println("Enter The Third Number");
        int num3 = scanner.nextInt();

        double Average = (double)(num1+num2+num3)/3;
        System.out.println("The Average of Three Numbers is: "+Average);
    }}
