// Find the given Number is Even Or Odd

import java.util.Scanner;


// Method - 1 (Using if/else Logic)

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number To Find Odd Or Even : ");
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.println(number + " is Even Number");
        }
        else {
            System.out.println(number + " is Odd Number");
        }

        input.close();
    }
}

// Method - 2 (Using if/else Logic without Braces)

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number To Find Odd Or Even : ");
        int number = input.nextInt();

        if(number % 2 == 0)
            System.out.println(number + " is Even Number");
        else
            System.out.println(number + " is Odd Number");

        input.close();
    }
}

// Method - 3 (Using Ternary Operator method)

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number To Find Odd Or Even : ");
        int number = input.nextInt();

        System.out.println(number % 2 == 0 ?  (number + " is Even Number") : (number + " is Odd Number"));

        input.close();
    }
}

// Method - 4 (Using Static Method)

public class EvenOrOdd {

    public static void isEvenOrOdd(int number){
        System.out.println(number % 2 == 0 ?  (number + " is Even Number") : (number + " is Odd Number"));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number To Find Odd Or Even : ");
        int number = input.nextInt();
        isEvenOrOdd(number);
        input.close();
    }
}

// Method - 5 (Using Object)

public class EvenOrOdd {

    public void isEvenOrOdd(int number){
        System.out.println(number % 2 == 0 ?  (number + " is Even Number") : (number + " is Odd Number"));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number To Find Odd Or Even : ");
        int number = input.nextInt();

        EvenOrOdd evenOdd = new EvenOrOdd();

        evenOdd.isEvenOrOdd(number);
        input.close();
    }
}