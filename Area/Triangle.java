import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length : ");
        double length = input.nextDouble();
        System.out.print("Enter the height : ");
        double height = input.nextDouble();
        double area = 0.5 * (length * height);
        System.out.println("Area of the Triangle is : " + area);
        input.close();
    }
}

// Method - 2 (Using static method)

public class Triangle {
    public static double area(double length, double height){
        return 0.5 * (length * height);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the Triangle : ");
        double length = input.nextDouble();
        System.out.print("Enter the height of the Triangle : ");
        double height = input.nextDouble();
        System.out.println("Area of the Triangle is " + area(length, height));
        input.close();
    }
}

// Method - 3 (Using Objects)

public class Triangle {
    public static double area(double length, double height){
        return 0.5 * (length * height);
    } 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length of the Triangle : ");
        double length = input.nextDouble();
        System.out.print("Enter the Height of the Triangle : ");
        double height = input.nextDouble();

        Triangle triangle = new Triangle();
        // triangle.area(length, height);
        System.out.println("Area of the Triangle is : " + triangle.area(length, height));
        input.close();
    }
}