// Java Program to Find Number is Trimorphic Number Or Not

// Trimorphic Number :
// Cube of the Number ends with the Number itsef


// For Example :
// 4 = 4 * 4 * 4 = 64       //Number ends with 4
// 25 = 25 * 25 * 25 = 625  //Number ends with 25

import java.util.Scanner;

// Method - 1 (Using Logic)

public class TrimorphicNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to Find Trimorphic Or Not : ");
        int number = input.nextInt();
        int temp = number;
        boolean flag = true;

        int cube = (int) Math.pow(number, 3);

        while(number != 0){
            if(number % 10 != cube % 10){
                flag = false;
                break;
            }
            number /= 10;
            cube /= 10;
        }
        
        System.out.println(flag ? temp + " is Trimorphic Number" : temp + " is Non Trimorphic Number");
        input.close();
    }
}