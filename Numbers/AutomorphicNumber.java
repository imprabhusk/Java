// Java Program to Find Number is Strong Or Not

// Automorphic Number :
// The Number whose square ends with the same digit.

// For Example :
// 5 = 5 ^ 5 = 25 //Last digit is 5
// 6 = 6 ^ 6 = 36 //Last digit is 6
// 25 = 25 * 25 = 325 //Last digit is 25

import java.util.Scanner;

//Method - 1 (Using Logic)
public class AutomorphicNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Automorphic Number Or Not : ");
        int number = input.nextInt();
        int temp = number;
        int remainder = 0;
        int divisor = 10;
        boolean flag = false;

        int square = temp * temp;

        while (temp > 0) {

            remainder = square % divisor;
            if (number == remainder) {
                flag = true;
                break;
            }

            temp /= 10;
            divisor *= 10; // If it has more than one digit we need to multiply with 10
                           // 1st iteration 10, 2nd iteration 100, 3rd iteration 1000 and so on
        }

        System.out.println(flag == true ? number + " is Automorphic Number" : number + " is Not Automorphic Number");
        input.close();
    }
}