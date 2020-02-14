// Java Program to Find Number is Disarium Number Or Not

// Disarium Number :
// Sum of the digits powered with their respective positions is equal to the
// Number itself

// For Example :
// 89 = 8 ^ 1 + 9 ^ 2
// 89 = 8 + 81
// 89 = 89

import java.util.Scanner;

// Method - 1 (Using Logic)

// public class DisariumNumber {

// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter the Number to Find Disarium Number Or Not : ");
// int number = input.nextInt();
// int sum = 0;
// int count = 0;

// int temp = number;
// // To Count number of digits
// while (temp > 0) {
// temp /= 10;
// count++;
// }

// temp = number;
// // To calculate sum of the number with its power
// while (temp > 0) {
// int remainder = temp % 10;
// sum += Math.pow(remainder, count--);
// temp /= 10;
// }

// System.out.print(sum == number ? number + " is Disarium Number" : number + "
// is Not Disarium Number");
// input.close();
// }
// }

// Method - 2 (Using static method)

public class DisariumNumber {
    public static int disarium(int number) {
        int temp = number;
        int count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        temp = number;
        int sum = 0;
        while (temp > 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, count--);
            temp /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Disarium Number Or Not : ");
        int number = input.nextInt();

        System.out.println(
                disarium(number) == number ? number + " is Disarium Number" : number + " is Not Disarium Number");
        input.close();
    }
}