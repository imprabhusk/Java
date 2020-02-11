// Java Program to Find the Number is Happy Number Or Not

// Happy Number :
// Sum of Square of the digit (until it becomes single digit) is Equal to 1

// For Example :
// 23 = 2 ^ 2 + 3 ^ 2
// 13 = 4 + 9
// 13 = 1 ^ 1 + 3 ^ 2
// 10 = 1 + 9
// 10 = 1 ^ 1 + 0 ^ 0
// 1                        // Happy Number

// 42 = 4 ^ 2 + 2 ^ 2
// 20 = 16 + 4
// 20 = 2 ^ 2 + 0 ^ 0
// 4                        // Not a Happy Number

import java.util.Scanner;

public class HappyNumber {

    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Happy Number Or Not : ");
        int number = input.nextInt();
        int temp = number;
        int remainder;
        int sum = 0;

        while (sum != 1 && sum != 4) {
            sum = 0;
            while (number > 0) {
                remainder = number % 10;
                sum += square(remainder);
                number /= 10;
            }
            number = sum;
        }

        System.out.print(sum == 1 ? temp + " is Happy Number" : temp + " is Not Happy Number");
        input.close();
    }
}