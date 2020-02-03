import java.util.Scanner;

// Method - 1

public class SmallestOfTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();

        System.out.println(first > second ? (second + " is Smallest Number") : (first + " is Smallest Number"));
        input.close();
    }
}

// Method - 2 (Using Method)

public class SmallestOfTwoNumbers {
    public static String greater(int first, int second){
        return (first > second ? (second + " is Smallest Number") : (first + " is Smallest Number"));
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