// Java Program to Swap Two Numbers Without Using Third Variable

import java.util.Scanner;

Method - 1 (Addition)

public class SwapWithoutThirdVariable {

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

        first = first + second;
        second = first - second;
        first = first - second;

        System.out.println("After Swapping");
        System.out.println("First = " + first);
        System.out.println("Second = " + second + "\n");
        
        input.close();
    }
}

// Method - 2 (Using Multiplication and Division)

public class SwapWithoutThirdVariable {

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

        first = first * second;
        second = first / second;
        first = first / second;

        System.out.println("After Swapping");
        System.out.println("First = " + first);
        System.out.println("Second = " + second + "\n");
        
        input.close();
    }
}

// Method - 3 (Using Exor Operator ^ )

public class SwapWithoutThirdVariable {

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

        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println("After Swapping");
        System.out.println("First = " + first);
        System.out.println("Second = " + second + "\n");
        
        input.close();
    }
}

// Method - 4 (Using above all in Methods)


public class SwapWithoutThirdVariable {
    public static void before(int first, int second){
        System.out.println("Before Swapping");
        System.out.println("First = " + first);
        System.out.println("Second = " + second + "\n");
    }

    public static void after(int first, int second){
        System.out.println("After Swapping");
        System.out.println("First = " + first);
        System.out.println("Second = " + second + "\n");
    }

    public static void usingAddition(int first, int second){
        before(first, second);

        first = first + second;
        second = first - second;
        first = first - second;

        after(first, second);
    }

    public static void usingMultiplicationAndDivision(int first, int second){
        before(first, second);

        first = first * second;
        second = first / second;
        first = first / second;

        after(first, second);
    }

    public static void usingExor(int first, int second){
        before(first, second);

        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        after(first, second);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();
        System.out.println();

        System.out.println("Using Addition Method" + "\n");
        usingAddition(first, second);

        System.out.println("Using Multiplication and Division Method" + "\n");
        usingMultiplicationAndDivision(first, second);

        System.out.println("Using Exor Operator Method" + "\n");
        usingExor(first, second);

        input.close();
    }
}