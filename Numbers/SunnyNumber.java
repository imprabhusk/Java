// Java Program to Find Number is Sunny Number Or Not

// Sunny Number :
// Adding 1 to the given number and square root of it becomes whole number.

// For Example :
// Let's Take Given Number is 3
// Adding 1 to it gives 4
// Then Square Root of it becomes 2 which is Whole Number.

import java.util.Scanner;

// Method - 1 

// public class SunnyNumber {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the Number to Find Sunny Number Or Not : ");
//         int number = input.nextInt();

//         double squareRoot = Math.sqrt(number + 1);
//         System.out
//                 .print((int) squareRoot == squareRoot ? number + " is Sunny Number" : number + " is Not Sunny Number");
//         input.close();
//     }
// }

// Method - 2 (Using static method)

public class SunnyNumber {
    public static double sunny(int number) {
        return Math.sqrt(number + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Sunny Number Or Not : ");
        int number = input.nextInt();

        System.out.println(
                (int) sunny(number) == sunny(number) ? number + " is Sunny Number" : number + " is Not Sunny Number");
        input.close();
    }
}