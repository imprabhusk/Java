import java.util.Scanner;

// Method - 1

public class GreatestOfTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();

        System.out.println("Greatest of Two Numbers is = " + (first > second ? first: second));
        input.close();
    }
}

// Method - 2 (Using Method)

public class GreatestOfTwoNumbers {
    public static int greater(int first, int second){
        return (first > second ? first : second);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();

        System.out.println("Greatest of Two Numbers is = " + greater(first, second));
        input.close();
    }
}