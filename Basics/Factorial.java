// Java Program to Find Factorial of a Given Number

import java.util.Scanner;

// Method - 1 (using for loop)

// public class Factorial {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number to find factorial : ");
//         int number = input.nextInt();

//         if (number < 0)
//             System.out.println("Factorial of the negative number is undefined");
//         else {
//             int fact = 1;
//             for (int i = 1; i <= number; i++) {
//                 fact *= i;
//             }
//             System.out.println("Factorial of the number " + number + " is " + fact);
//         }
//         input.close();
//     }
// }

// Method - 2 (Using while loop)

public class Factorial {

    public static int factorial(int number) {
        int fact = 1;
        int i = 1;

        if (number < 0)
            return -1;
        else {
            while (number > 0 && i <= number) {
                fact *= i;
                i++;
            }
        }
        return fact;
        // System.out.println("Factorial of the number " + number + " = " + fact);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find factorial : ");
        int number = input.nextInt();

        int result = factorial(number);

        System.out.println(result == -1 ? "Factorial of the negative number is undefined"
                : "Factorial of the number " + number + " = " + result);

        input.close();
    }
}

// // Method - 3 (Using Recursion Method)

// public class Factorial {

// public static void factorial(int number) {
// int fact = 1;
// int temp = number;
// while(number > 0){
// fact *= number--;
// }
// System.out.println("Factorial of the Number " + temp + " is " + fact);
// }
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter the Number to Find Factorial : ");
// int number = input.nextInt();
// factorial(number);
// input.close();
// }
// }