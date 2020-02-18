// Java Program to Reverse the Number

// For Example : 
// 123 = 321
// 1234 = 4321

import java.util.Scanner;
public class ReverseNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Reverse : ");
        int number = input.nextInt();
        int append = 0;

        while(number != 0){
            int remainder = number % 10;
            append = (append * 10) + remainder;
            number /= 10;
        }

        System.out.println("Reversed Number is : " + append);
        input.close();
    }
}