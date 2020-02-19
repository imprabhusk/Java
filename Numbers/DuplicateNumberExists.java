// Java Program to Find Duplicate Numbers Exists in a given number or not.

// Duplicate Numbers :
// If the number is repeated again and again in the given number. we need to find the 
// repeating number and its number of occurence

// For Example :
// 123123 
// Duplicate Numbers are 1, 2, 3
// 1 = 2 times
// 2 = 2 times
// 3 = 2 times

import java.util.Scanner;

// Method - 1 (Using Logic)

public class DuplicateNumberExists {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Duplicate Numbers Exists Or Not : ");
        int number = input.nextInt();
        int arr[] = new int[10];
        
        while(number > 0){
            int remainder = number % 10;
            arr[remainder]++;
            number /= 10;
        }

        for(int i = 0; i <= 9; i++){
            if(arr[i] > 1)
                System.out.println("Number " + i + " occurs " + arr[i] + " times");
        }
        input.close();
    }
}

// Method - 2 (Using static method)

public class DuplicateNumberExists {
    public static void duplicateNumber(int number, int arr[]){
        while(number > 0){
            int remainder = number % 10;
            arr[remainder]++;
            number /= 10;
        }
        for(int i = 0; i <= 9; i++){
            if(arr[i] > 1)
                System.out.println("Number " + i + " occurs " + arr[i] + " times");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Duplicate Number Exists Or Not : ");
        int number = input.nextInt();
        int arr[] = new int[10];

        duplicateNumber(number, arr);
        input.close();
    }
}