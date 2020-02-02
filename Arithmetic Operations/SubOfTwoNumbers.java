import java.util.Scanner;

// Method - 1

public class SubOfTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();

        System.out.println("Difference of Two Numbers " + first + " and " + second + " is = " + (first - second));
        input.close();
    }
}

// Method - 2 (Using Method)

public class SubOfTwoNumbers {
    public static int sub(int first, int second){
        return first - second;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();

        System.out.println("Difference of Two Numbers " + first + " and " + second + " is = " + sub(first, second));
        input.close();
    }
}

// Method - 3 (Without Using "-" Operator)

public class SubOfTwoNumbers {
    public static int sub(int first, int second){
        return first + ( ~ second + 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();

        System.out.println("Difference of Two Numbers " + first + " and " + second + " is = " + sub(first, second));
        input.close();
    }
}


// Method - 4 (Using Bitwise Operator)

public class SubOfTwoNumbers {
    public static int sub(int first, int second){
        while (second != 0){
            int borrow = (~first) & second;
            first = first ^ second;
            second = borrow << 1; 
        }
        return first;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();

        System.out.println("Difference of Two Numbers " + first + " and " + second + " is = " + sub(first, second));
        input.close();
    }
}


// Method - 5 (Using Another Method)

public class SubOfTwoNumbers {
    public static int sub(int first, int second){
        return second == 0 ? first : sub(first ^ second, (~first & second) << 1); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int second = input.nextInt();

        System.out.println("Difference of Two Numbers " + first + " and " + second + " is = " + sub(first, second));
        input.close();
    }
}