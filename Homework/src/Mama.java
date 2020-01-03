import java.util.Scanner;

public class Mama {

    public static void main(String[] args) {
        System.out.println("Введите предложение: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        reverseText(text);
        wordsText(text);
        starsText(text);
        upperText(text);
        textToChars(text);
    }

    private static void reverseText(String text) {
        String reversedText = new StringBuilder(text).reverse().toString();
        System.out.println(reversedText);
    }

    private static void wordsText(String text) {
        String[] words = text.split("\\s");
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static void starsText(String text) {
        String textStars = text.replaceAll(" ", "*");
        System.out.println(textStars);
    }

    private static void upperText(String text) {
        String upperText = text.toUpperCase();
        System.out.println(upperText);
    }

    private static void textToChars(String text) {
        char[] chars = text.toCharArray();
        for (int i = 4; i < 10; i++) {
            System.out.println(chars[i]);
        }

    }
}