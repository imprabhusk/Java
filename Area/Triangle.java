import java.util.Scanner;

// public class Triangle {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the Length : ");
//         float length = input.nextInt();
//         System.out.print("Enter the Breadth : ");
//         float height = input.nextInt();
//         double area = (1/2) * (length * height);
//         System.out.println("Area Of the triangle is : " + area);
//         input.close();
//     }
// }

// Method - 2 (Using static method)

public class Triangle {
    public static float area(float length, float height){
        return (float)(1/2) * (length * height);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float length = input.nextInt();
        float height = input.nextInt();
        System.out.println("Area of the Triangle is " + area(length, height));
    }
}