// Java Program to Find Number is Strong Or Not

// Strong Number:
// The Sum of the Factorial of its digits is equal to the number itself

// Example:
// 145 = 1! + 4! + 5!
// 145 = 1 + (4 * 3 * 2 * 1) + (5 * 4 * 3 * 2 * 1)
// 145 = 1 + 24 + 120
// 145 = 145

import java.util.Scanner;

// Method - 1

public class StrongNumber {
    public static int factorial(int number){
        int fact = 1;
        for(int i = 0; i <= number; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Strong Number Or Not : ");
        int number = input.nextInt();
        int sum = 0;
        
        while(number > 0){
            int result = number % 10;
            sum += factorial(result);
            number /= 10;
        }

        System.out.println(number == sum ? "Strong Number" : "Not Strong Number");
        input.close();
    }
}