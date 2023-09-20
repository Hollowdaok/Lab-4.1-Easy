package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word or phrase (or type 'exit' to exit):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            boolean isPalindrome = PalindromeChecker.isPalindrome(input);

            if (isPalindrome) {
                System.out.println("This word/phrase is a palindrome.");
            } else {
                System.out.println("This word/phrase is not a palindrome.");
            }
        }

        scanner.close();
    }
}
