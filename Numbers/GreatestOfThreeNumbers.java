import java.util.Scanner;

// Method - 1

public class GreatestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();
        System.out.print("Enter the Third Number : ");
        int third = input.nextInt();

        System.out.println("Greatest Number is = " + (first > second ? (first > third ? first : third) : (second > third ? second : third)));
        input.close();
    }
}

// Method - 2 (Using Method)

public class GreatestOfThreeNumbers {
    public static int greater(int first, int second, int third){
        int result = first > second ? (first > third ? first : third) : (second > third ? second : third);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();
        System.out.print("Enter the Third Number : ");
        int third = input.nextInt();

        System.out.print("Greatest Number is = " + greater(first, second, third));
        input.close();
    }
}