// Java Program to Generate the Fibonacci Series upto the Limit.

import java.util.Scanner;

// Method - 1

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

// Method - 2 (Using Methods)

public class Fibonacci {
    public static void generateFibonacci(int first, int second, int limit){
        for(int i = 1; i <= limit; i++){
            int result = first + second;
            System.out.print(result + " ");
            first = second;
            second = result;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();
        System.out.print("Enter the Number To Generate Fibonacci Series : ");
        int limit = input.nextInt();

        generateFibonacci(first, second, limit);

        input.close();
    }
}