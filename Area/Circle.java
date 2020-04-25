// Java Program to Find Area of the Circle

// The Formula To Find Area of Circle is A = pi * r * r. where pi = 3.14

import java.util.Scanner;

// Method - 1 (Using Logic)

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius to find Area of the Circle : ");
        double radius = input.nextDouble();
        System.out.println("Area of the Circle is : " + 3.14 * radius * radius);
        input.close();
    }
}

// Method - 2 (Using static method)

public class Circle {
    public static double area(double radius){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius to find Area of the Circle : ");
        double radius = input.nextDouble();
        System.out.print("Area of the Circle is : " + area(radius));
        input.close();
    }
}

// Method - 3 (Using Objects)

public class Circle {
    public double area(double radius){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius to find Area of the Circle : ");
        double radius = input.nextDouble();

        Circle cir = new Circle();
        System.out.println("Area of the Circle is : " + cir.area(radius));
        input.close();
    }
}