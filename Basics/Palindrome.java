// Java Program to check whether the string is Palindrome Or Not.

import java.util.Scanner;

// Method - 1

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String to Check Palindrome Or Not : ");
        String original = input.next();
        boolean flag = true;
        for(int i = 0; i < original.length(); i++){
            if(original.charAt(i) != original.charAt(original.length() - i - 1)){
                flag = false;
            }
        }
        System.out.println(flag == true ? (original + " is Palindrome") : (original + " is Not Palindrome"));
        input.close();
    }
}

// Method - 2 

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String to Check Palindrome Or Not : ");
        String original = input.next();
        String reverse = "";
        for(int i = original.length() - 1; i >= 0; i--){
            reverse += original.charAt(i);
        }
        System.out.println(original.equals(reverse) == true ? (original + " is Palindrome") : (original + " is Not Palindrome"));
        input.close();
    }
}

// Method - 3

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String To Check Palindrome Or Not : ");
        String original = input.next();
        String reverse = new StringBuilder(original).reverse().toString();
        System.out.println(original.equals(reverse) ? (original + " is Palindrome") : (original + " is Not Palindrome"));
        input.close();
    }
}