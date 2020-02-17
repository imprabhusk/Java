// Java Program to Find Number is Evil Or Odious

// EvilOrOdiousNumber
// Convert the given Number into binary format, If the binary representation of the number contains even 
// number of 1's then its evil number or if contains odd number of 1's then its odious number

// For Example :
// 3 = 011 = Even number of 1's so its Evil Number
// 16 = 10000 = Odd number of 1's so its Odious Number

import java.util.Scanner;

// Method - 1 (Using Logic)

public class EvilOdiousNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Number is Evil or Odious Number : ");
        int number = input.nextInt();
        int temp = number;
        int count = 0;

        while(number != 0){
            if(number % 2 == 1)
                count++;
            number /= 2;
        }

        System.out.println(count % 2 == 0 ? temp + " is Evil Number" : temp + " is Odious Number");
        input.close();
    }
}

// Method - 2 (Using static method)

public class EvilOdiousNumber {

    public static int evilOdious(int number, int count){

        while(number != 0){
            if(number % 2 == 1)
                count++;
            number /= 2;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Number is Evil Or Odious Number : ");
        int number = input.nextInt();
        int temp = number;
        int count = 0;

        System.out.println(evilOdious(number, count) % 2 == 0 ? temp + " is Evil Number" : temp + " is Odious Number");
        input.close();
    }
}