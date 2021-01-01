// Print the word with odd letters as cross type (X type)

import java.util.Scanner;

public class Question_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string with odd letters : ");
        String pattern = input.next();

        for (int i = 0; i < pattern.length(); i++) {
            for (int j = 0; j < pattern.length(); j++) {
                if (i == j || i + j == pattern.length() - 1)
                    System.out.print(pattern.charAt(i));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        input.close();
    }
}