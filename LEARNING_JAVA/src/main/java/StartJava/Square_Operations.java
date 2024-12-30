package StartJava;

import java.util.Scanner;

public class Square_Operations {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the length of the square
        System.out.println("Enter the length of the square: ");
        int l = scanner.nextInt(); // Read the input as an integer
        //Area of Square
        int area=l*l;
        //Perimeter of Square
        int perimeter=4*l;
        //Printing Area and Perimeter
        System.out.println("Area of Square is: "+area);
        System.out.println("Perimeter of Square is: "+perimeter);
    }
}