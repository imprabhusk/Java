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
        return (dividend - divisor * (dividend / divisor));
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