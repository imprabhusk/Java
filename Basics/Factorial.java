// Java Program to Find Factorial of a Given Number

import java.util.Scanner;

// Method - 1

// public class Factorial {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the Number to Find Factorial : ");
//         int number = input.nextInt();
//         int fact = 1;
//         for(int i = 1 ; i <= number ; i++){
//             fact *= i;
//         }
//         System.out.println("Factorial of the Number " + number + " is " + fact);
//         input.close();
//     }
// }

// Method - 2 (Using Methods)

// public class Factorial {

//     public static void factorial(int number) {
//         int fact = 1;
//         int i = 1;
//         while(number > 0 && i <= number){
//             fact *= i;
//             i++;
//         }
//         System.out.println("Factorial of the Number " + number + " is " + fact);
//     }
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the Number to Find Factorial : ");
//         int number = input.nextInt();
//         factorial(number);
//         input.close();
//     }
// }

// Method - 3 (Using Recursion Method)

public class Factorial {

    public static void factorial(int number) {
        int fact = 1;
        int temp = number;
        while(number > 0){
            fact *= number--;
        }
        System.out.println("Factorial of the Number " + temp + " is " + fact);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Factorial : ");
        int number = input.nextInt();
        factorial(number);
        input.close();
    }
}