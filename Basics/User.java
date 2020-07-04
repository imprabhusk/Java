import java.util.Scanner;

public class User {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = input.next();
        System.out.println("Your Name is : " + name);
        input.close();
    }
}