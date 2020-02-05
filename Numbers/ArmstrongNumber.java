// Armstrong Number:
// The Sum of the Cubes of its digits is equal to the number itself

// Example :
// 153 = 1^3 + 5^3 + 3^3
// 153 = 1 + 75 + 27
// 153 = 153

// 153, 370, 371, 407 are the Armstrong Numbers

import java.util.Scanner;

// Method - 1

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Armstrong Or Not : ");
        int number = input.nextInt();
        int temp = number;
        int sum = 0;
        int result = 0;

        while(temp > 0){
            result = temp % 10;
            sum += (result * result * result);
            temp /= 10;
        }

        System.out.println(number == sum ? number + " is an Armstrong Number" : number + " is Not an Armstrong Number");
        input.close();
    }
}

// Method - 2 (Using Static Method)

public class ArmstrongNumber {
    public static void armstrong(int number){

        int temp = number;
        int result = 0;
        int sum = 0;

        while(temp > 0){
            result = temp % 10;
            sum += (result * result * result);
            temp /= 10;
        }

        System.out.println(number == sum ? number + " is an Armstrong Number" : number + " is Not an Armstrong Number");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Armstrong Or Not : ");
        int number = input.nextInt();

        armstrong(number);
        input.close();
    }
}