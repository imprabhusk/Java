// Prime Number is a Number which is divisible by 1 and itself.

// For example:
// 3 is divisible by 1 and itself (3).
// 6 is divisibl3 by 1,2,3 and 6. So 6 is not Prime Number.

// Java Program to check whether the Given Number is Prime Or Not

import java.util.Scanner;

// Method - 1

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Prime Or Not : ");
        int number = input.nextInt();
        boolean flag = true;
        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0)
                flag = false;
        }
        System.out.println(flag == true ? (number + " is Prime Number") : (number + " is Not Prime Number"));
        input.close();
    }
}

// Method - 2 (Using Methods)

public class PrimeNumber {

    public static boolean isPrime(int number, boolean flag){
        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Prime Or Not : ");
        int number = input.nextInt();
        boolean flag = true;
        boolean result = isPrime(number, flag);
        System.out.println(result == true ? (number + " is Prime Number") : (number + " is Not Prime Number "));
        input.close();
    }
}
