// Note : dividend = quotient * divisor + remainder

import java.util.Scanner;

// Method - 1

public class DivisionOfTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        float first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        float second = input.nextInt();

        System.out.println("Division of Two Numbers " + first + " and " + second + " is = " + (first / second));
        input.close();
    }
}

// Method - 2 (Using Method)

public class DivisionOfTwoNumbers {
    public static float divide(float first, float second) {
        return first / second;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        float first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        float second = input.nextInt();

        System.out.println("Division of Two Numbers " + first + " and " + second + " is = " + divide(first, second));
        input.close();
    }
}

// Method - 3 (Without Using "/" Operator)

public class DivisionOfTwoNumbers {
    public static float divide(float dividend, float divisor){
        // Calculate sign of divisor i.e., 
        // sign will be negative only iff 
        // either one of them is negative 
        // otherwise it will be positive 
        int sign = ((dividend < 0) ^  (divisor < 0)) ? -1 : 1; 
      
        // Update both divisor and 
        // dividend positive 
        dividend = Math.abs(dividend); 
        divisor = Math.abs(divisor); 
      
        // Initialize the quotient 
        int quotient = 0; 
          
        while (dividend >= divisor){ 
            dividend -= divisor; 
            ++quotient; 
        } 
        return sign * quotient; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        float first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        float second = input.nextInt();

        System.out.println("Division of Two Numbers " + first + " and " + second + " is = " + divide(first, second));
        input.close();
    }
}