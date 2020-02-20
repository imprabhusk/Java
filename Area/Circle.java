// Java Program to Find Area of the Circle

// The Formula To Find Area of Circle is A = pi * r * r. where pi = 3.14

import java.util.Scanner;

// Method - 1 (Using Logic)

// public class Circle {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the radius of the Cicle to calculate Area : ");
//         int radius = input.nextInt();
//         System.out.println("Area of the Circle is : " + (float)3.14 * radius * radius);
//         input.close();
//     }
// }

// Method - 2 (Using static method)

public class Circle {
    public static float area(int radius){
        return (float)3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius to find Area of the Circle : ");
        int radius = input.nextInt();
        System.out.print("Area of the Circle is : " + area(radius));
        input.close();
    }
}