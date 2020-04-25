import java.util.Scanner;

// Method - 1 (Using Logic)

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sides of the square : ");
        double side = input.nextDouble();

        System.out.println("Area of the square is : " + side * side);
        input.close();
    }
}

// Method - 2 (Using static Method)

public class Square {
    public static double area(double side){
        return side * side;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sides of the Square : ");
        double side = input.nextDouble();

        System.out.println("Area of the Square is : " + area(side));
        input.close();
    }
}

// Method - 3 (Using Objects)

public class Square {
    public static double area(double side){
        return side * side;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sides of the Square : ");
        double side = input.nextDouble();

        Square square = new Square();
        System.out.println("Area of the Square is : " + square.area(side));
        input.close();
    }
}