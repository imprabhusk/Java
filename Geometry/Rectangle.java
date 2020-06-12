import java.util.Scanner;

// Method - 1 (Using Logic)

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle : ");
        double length = input.nextDouble();
        System.out.print("Enter the breadth of the Rectangle : ");
        double breadth = input.nextDouble();

        System.out.println("Area of the Rectangle is : " + length * breadth);
        input.close();
    }
}

// Method - 2 (Using static method)

public class Rectangle {

    public static double area(double length, double breadth){
        return length * breadth;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle : ");
        double length = input.nextDouble();
        System.out.print("Enter the breadth of the Rectangle : ");
        double breadth = input.nextDouble();

        System.out.println("Area of the Rectangle is : " + area(length, breadth));
        input.close();
    }
}

// Method - 3 (Using Object)

public class Rectangle {
    public static double area(double length, double breadth){
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle : ");
        double length = input.nextDouble();
        System.out.print("Enter the breadth of the Rectangle : ");
        double breadth = input.nextDouble();

        Rectangle rectangle = new Rectangle();
        System.out.println("Area of the Rectangle is : " + rectangle.area(length, breadth));
        input.close();
    }
}