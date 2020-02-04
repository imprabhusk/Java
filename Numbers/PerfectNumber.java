// Java Program to Find Perfect Number

// Perfect Number :

// For example 

// 6 is a perfect number because 6 is divisible by 1, 2, 3 and the sum of these values is 1 + 2 + 3 = 6.
// 28 is a perfect number because 28 is divisible by 1, 2, 4, 7, 14 and the sum of these values is 1 + 2 + 4 + 7 + 14 = 28.
// Remember, we have to exclude the number itself.
// That is why we have not added 28 here. 
// Some of the Java perfect numbers are 6, 28, 496, 8128, and 33550336, so on.

import java.util.Scanner;

// Method - 1

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Perfect Number Or Not : ");
        int number = input.nextInt();
        int sum = 0;

        for(int i = 1; i < number; i++){
            if(number % i == 0)
                sum += i;
        }

        System.out.println(sum == number ? number + " is a Perfect Number" : number + " is Not a Perfect Number");
        input.close();
    }
}

// Method - 2 (Using Method)

public class PerfectNumber {
    public static void perfectNumber(int number){
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0)
                sum += i;
        }
        System.out.print(sum == number ? number + " is a Perfect Number" : number + " is Not a Perfect Number");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Perfect Number Or Not : ");
        int number = input.nextInt();
        perfectNumber(number);
        input.close();
    }
}

// Method - 3 (Using Objects)

class Calculate {
    public void perfect(int number) {
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0)
                sum += i;
        }
        System.out.print(sum == number ? number + " is a Perfect Number" : number + " is Not a Perfect Number");
    }
}

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Perfect Number Or Not : ");
        int number = input.nextInt();

        Calculate calc = new Calculate();
        calc.perfect(number);
        input.close();
    }
}