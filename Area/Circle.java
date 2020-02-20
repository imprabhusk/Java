// Java Program to Find Area of the Circle

// The Formula To Find Area of Circle is A = pi * r * r. where pi = 3.14

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the Cicle to calculate Area : ");
        int radius = input.nextInt();
        System.out.println("Area of the Circle is : " + (float)3.14 * radius * radius);
        input.close();
    }
}