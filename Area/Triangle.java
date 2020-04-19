import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length : ");
        int length = input.nextInt();
        System.out.print("Enter the Breadth : ");
        int breadth = input.nextInt();
        double area = (1/2) * (length * breadth);
        System.out.println("Area Of the triangle is : " + area);
        input.close();
    }
}