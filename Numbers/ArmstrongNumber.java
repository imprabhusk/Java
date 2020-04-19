// Armstrong Number:
// The Sum of the Cubes of its digits is equal to the number itself.

// Example : Three digits
// 153 = 1^3 + 5^3 + 3^3
// 153 = 1 + 75 + 27
// 153 = 153

// Four Digits
// 1634 = 1^4 + 6^4 + 3^4 + 4^4
// 1634 = 1 + 1296 + 81 + 256
// 1634 = 1634

// 153, 370, 371, 407 are the Armstrong Numbers.

import java.util.Scanner;

// Method - 1

public class ArmstrongNumber {
    public static int findPower(int number, int power){
        int sum = 1;
        for(int i = 0; i < power; i++)
            sum *= number;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Number is Armstrong Number or Not : ");
        int number = input.nextInt();
        int temp = number;
        int sum = 0;

        // To Find Length of the Number
        int length = 0;
        while(temp > 0){
            temp /= 10;
            length++;
        }

        temp = number;
        
        while(temp > 0){
            int rem = temp % 10;
            sum += findPower(rem, length);
            temp /= 10;
        }

        System.out.println(sum == number ? number + " is an Armstrong Number" : number + " is Not an Armstrong Number");
    }
}

// Method - 2 (Using Static Method)

// public class ArmstrongNumber {
//     public static int findLength(int number){
//         int temp = number;
//         int digit = 0;

//         while(temp > 0){
//             digit++;
//             temp /= 10;
//         }
//         return digit;
//     }

//     public static int findPower(int number, int power){
//         int sum = 1;
//         for(int i = 1; i <= power; i++)
//             sum *= number;
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the Number to Find Armstrong Number or Not : ");
//         int number = input.nextInt();
//         int length = findLength(number);
//         int temp = number;
//         int rem = 0;
//         int sum = 0;

//         while(temp > 0){
//             rem = temp % 10;
//             sum += findPower(rem, length);
//             temp /= 10;
//         }

//         System.out.println((sum == number) ? number + " is an Armstrong Number" : number + " is not an Armstrong Number");
//     }
// }