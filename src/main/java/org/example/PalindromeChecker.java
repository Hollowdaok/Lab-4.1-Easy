package org.example;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {

        str = str.replaceAll("\\s+", "").toLowerCase();


        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
