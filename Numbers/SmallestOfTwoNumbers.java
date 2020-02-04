import java.util.Scanner;

// Method - 1

public class SmallestOfTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();

        System.out.println("Smallest Number is = " + (first > second ? second : first));
        input.close();
    }
}

// Method - 2 (Using Method)

public class SmallestOfTwoNumbers {
    public static int smallest(int first, int second){
        return (first > second ? second : first);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();

        System.out.println("Smallest Number is = "+ smallest(first, second));
        input.close();
    }
}