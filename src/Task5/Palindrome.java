package Task5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Введите слово или фразу: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String text) {
        String onlyLetters = text.replaceAll(" ", "");
        String reverse = new StringBuilder(onlyLetters).reverse().toString();
        if (onlyLetters.equalsIgnoreCase(reverse)) {
            return true;
        } else {
            return false;
        }
    }
}
