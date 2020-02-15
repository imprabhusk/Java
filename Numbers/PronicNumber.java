// Java Program to Find Number is Pronic Number Or Not

// Pronic Number :
// Product of Two Consecutive Number

// For Example :
// 2 * 3 = 6
// 5 * 6 = 30

import java.util.Scanner;

// Method - 1

public class PronicNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Pronic Number Or Not : ");
        int number = input.nextInt();
        boolean flag = false;
        int n = 1;

        for (int i = 1; i <= number; i++) {
            if (n * (n + 1) == number)
                flag = true;
            n++;
        }

        System.out.println(flag == true ? number + " is Pronic Number" : number + "is Not a Pronic Number");
        input.close();
    }
}

// Method - 2 (Using static Method)

public class PronicNumber {

    public static boolean isPronic(int number, boolean flag) {
        int n = 1;

        for (int i = 1; i <= number; i++) {
            if (n * (n + 1) == number)
                flag = true;
            n++;
        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Pronic Number Or Not : ");
        int number = input.nextInt();
        boolean flag = false;

        System.out.println(
                isPronic(number, flag) == true ? number + " is Pronic Number" : number + " is Not a Pronic Number");
        input.close();
    }
}