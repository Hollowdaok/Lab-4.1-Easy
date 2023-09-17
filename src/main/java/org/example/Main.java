package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введіть слово або фразу (або введіть 'exit' для виходу): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            boolean isPalindrome = PalindromeChecker.isPalindrome(input);

            if (isPalindrome) {
                System.out.println("Це слово/фраза є паліндромом.");
            } else {
                System.out.println("Це слово/фраза не є паліндромом.");
            }
        }

        scanner.close();
    }
}