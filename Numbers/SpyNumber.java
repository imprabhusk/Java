// Java Program to Find Number is Spy Number Or Not

// Spy Number :
// The Sum of its digits is Equal to the Product of its digits.

// For Example :
// 123 = 1 + 2 + 3 = 6
// 123 = 1 * 2 * 3 = 6

// 1124 = 1 + 1 + 2 + 4
// 1124 = 1 * 1 * 2 * 4

import java.util.Scanner;

// Method - 1

public class SpyNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Spy Number Or Not : ");
        int number = input.nextInt();
        int temp = number;
        int sum = 0;
        int product = 1;

        while (number > 0) {
            int remainder = number % 10;
            sum += remainder;
            product *= remainder;
            number /= 10;
        }

        System.out.println(sum == product ? temp + " is Spy Number" : temp + " is Not Spy Number");
        input.close();
    }
}

// Method - 2 (Using static method)

public class SpyNumber {

    public static int add(int number, int sum) {

        while (number > 0) {
            int remainder = number % 10;
            sum += remainder;
            number /= 10;
        }
        return sum;
    }

    public static int multiply(int number, int product) {
        while (number > 0) {
            int remainder = number % 10;
            product *= remainder;
            number /= 10;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Spy Number Or Not : ");
        int number = input.nextInt();
        int sum = 0;
        int product = 1;

        System.out.println(add(number, sum) == multiply(number, product) ? (number + " is Spy Number")
                : (number + " is Not Spy Number"));
        input.close();
    }
}