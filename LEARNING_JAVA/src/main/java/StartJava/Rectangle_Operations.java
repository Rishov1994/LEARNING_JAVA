package StartJava;

import java.util.Scanner;

public class Rectangle_Operations {

    public static void main(String[] args) {
        //Use scanner Class to read input
        Scanner scanner = new Scanner(System.in);

        //Read Input from User
        System.out.println("Enter the length of the rectangle: ");
        int l = scanner.nextInt();

        System.out.println("Enter the breadth of the rectangle: ");
        int b = scanner.nextInt();

        //Area of Rectangle
        int Area = l * b;
        //Perimeter of Rectangle
        int perimeter = 2 * (l + b);

        //Printing Area and Perimeter
        System.out.println("Area of Rectangle is: " + Area);
        System.out.println("Perimeter of Rectangle is: " + perimeter);

    }

}
