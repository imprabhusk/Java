// Java Program to Generate the Fibonacci Series upto the Given Number.

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();
        System.out.print("Enter the Number To Generate Fibonacci Series : ");
        int limit = input.nextInt();
        int result;

        for(int i = 1; i <= limit; i++){
            result = first + second;
            System.out.print(result + " ");
            first = second;
            second = result;
        }
        input.close();
    }
}