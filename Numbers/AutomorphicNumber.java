// Java Program to Find Number is Strong Or Not

// Automorphic Number :
// The Number whose square ends with the same digit.

// For Example :
// 5 = 5 ^ 5 = 25 //Last digit is 5
// 6 = 6 ^ 6 = 36 //Last digit is 6
// 25 = 25 * 25 = 325 //Last digit is 25

import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Automorphic Number Or Not : ");
        int number = input.nextInt();
        int result = 0;

        int square = number * number;

        while (square != 0) {
            result = square % 10;
            square /= 10;
        }

        System.out
                .println(result == number ? number + " is Automorphic Number" : number + " is Not Automorphic Number");
        input.close();
    }
}