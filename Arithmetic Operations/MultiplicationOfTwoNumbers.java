import java.util.Scanner;

// Method - 1 

public class MultiplicationOfTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.println("Enter the Second Number : ");
        int second = input.nextInt();

        System.out.println("Product of Two Numbers " + first + " and " + second + " is = " + (first * second));
        input.close();
    }
}

// Method - 2 (Using Methods)

public class MultiplicationOfTwoNumbers {
    public static int product(int first, int second) {
        return first * second;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.println("Enter the Second Number : ");
        int second = input.nextInt();

        System.out.println("Product of Two Numbers " + first + " and " + second + " is = " + product(first, second));
        input.close();
    }
}

// Method - 3 (Without Using "*" Operator (Recursive Method))

// public class MultiplicationOfTwoNumbers {
//     public static int product(int first, int second){
//         if(second == 0){
//             return 0;
//         }
//         if(second > 0){
//             return (first + product(first, second - 1));
//         }
//         if(second < 0){
//             return -product(first, -second);
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the First Number : ");
//         int first = input.nextInt();
//         System.out.print("Enter the Second Number : ");
//         int second = input.nextInt();

//         System.out.println("Product of Two Numbers " + first + " and " + second + " is = " + product(first, second));
//         input.close();
//     }
// }