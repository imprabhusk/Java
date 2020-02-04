import java.util.Scanner;

// Method - 1

public class SmallestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();
        System.out.print("Enter the Third Number : ");
        int third = input.nextInt();

        System.out.println("Smallest Number is = " + (first < second ? (first < third ? first : third) : (second < third ? second : third)));
        input.close();
    }
}

// Method - 2 (Using Method)

public class SmallestOfThreeNumbers {
    public static int smallest(int first, int second, int third){
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

        System.out.print("Smallest Number is = " + smallest(first, second, third));
        input.close();
    }
}