// Java Program to Find Number is Neon Number Or Not

// Neon Number :
// The Sum of Digits of Square of the Number is equal to the Number itself

// For example : 
// 9 = 9^2
// 9 = 81
// 9 = 8 + 1
// 9 = 9

import java.util.Scanner;

public class NeonNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Neon Number Or Not : ");
        int number = input.nextInt();
        int square = number * number;
        int sum = 0;

        while(square != 0){
            int result = square % 10;
            sum += result;
            square /= 10;
        }

        System.out.print(number == sum ? number + " is Neon Number" : number + " is Not Neon Number");
        input.close();
    }
}