// Java Program to Find the Given Year is Leap Year Or Not

// A leap year is exactly divisible by 4 except for century years (years ending with 00).
// The century year is a leap year only if it is perfectly divisible by 400.

import java.util.Scanner;

// Method - 1

public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year to Find Leap Year Or Not : ");
        int year = input.nextInt();
        boolean result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(result == true ? (year + " is Leap Year") : (year + " is Not Leap Year"));
        input.close();
    }
}

// Method - 2 (Using Methods)

public class LeapYear {
    public static boolean isLeap(int year){
        boolean result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year to Find Leap Year Or Not : ");
        int year = input.nextInt();
        System.out.println(isLeap(year) == true ? (year + " is Leap Year") : (year + " is Not Leap Year"));
        input.close();
    }
}