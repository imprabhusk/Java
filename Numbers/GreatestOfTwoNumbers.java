import java.util.Scanner;

// Method - 1

public class GreatestOfTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();

        System.out.println(first > second ? (first + " is Greater Number") : (second + " is Greater Number"));
        input.close();
    }
}

// Method - 2 (Using Method)

public class GreatestOfTwoNumbers {
    public static String greater(int first, int second){
        return (first > second ? (first + " is Greater Number") : (second + " is Greater Number"));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();

        System.out.println(greater(first, second));
        input.close();
    }
}