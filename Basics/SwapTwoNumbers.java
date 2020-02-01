//Java Program to Swap Two Numbers Using Third Variable

import java.util.Scanner;

// Method - 1

public class SwapTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();
        System.out.println();

        System.out.println("Before Swapping");
        System.out.println("First = " + first);
        System.out.println("Second = " + second + "\n");

        int temp = first;
        first = second;
        second = temp;

        System.out.println("After Swapping");
        System.out.println("First = " + first);
        System.out.println("Second = " + second + "\n");
        
        input.close();
    }
}

// Method - 2 (Using Methods)

public class SwapTwoNumbers {

    public static void swap(int first, int second){
        int temp = first;
        first = second;
        second = temp;

        System.out.println("After Swapping");
        System.out.println("First = " + first);
        System.out.println("Second = " + second + "\n");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();

        System.out.println();
        System.out.println("Before Swapping");
        System.out.println("First = " + first);
        System.out.println("Second = " + second + "\n");

        swap(first, second);
        input.close();
    }
}