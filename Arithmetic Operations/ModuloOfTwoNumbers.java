import java.util.Scanner;

// Method - 1

public class ModuloOfTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();

        System.out.println("Modulo of Two Numbers " + first + " and " + second + " is = " + (first % second));
        input.close();
    }
}

// Method - 2 (Using Method)

public class ModuloOfTwoNumbers {
    public static float remainder(float dividend, float divisor){
        return dividend % divisor;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        float first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        float second = input.nextInt();

        System.out.println("Modulo of Two Numbers " + first + " and " + second + " is = " + remainder(first, second));
        input.close();
    }
}

// Method - 3 (Without Using "%" Operator)

public class ModuloOfTwoNumbers {
    public static float remainder(float dividend, float divisor){
        // Handle divisor equals to 0 case 
        if (divisor == 0) { 
            System.out.println("Error: divisor "
                               + "can't be zero \n"); 
            return -1; 
        } 
  
        // Handle negative values 
        if (divisor < 0) 
            divisor = -divisor; 
        if (dividend < 0) 
            dividend = -dividend; 
  
        // Find the largest product of 'divisor' 
        // that is smaller than or equal to 'dividend' 
        float i = 1; 
        float product = 0; 
        while (product <= dividend) { 
            product = divisor * i; 
            i++; 
        } 
  
        // return remainder 
        return dividend - (product - divisor);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        float first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        float second = input.nextInt();

        System.out.println("Modulo of Two Numbers " + first + " and " + second + " is = " + remainder(first, second));
        input.close();
    }
}