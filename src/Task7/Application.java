package Task7;

import java.util.Scanner;

public class Application {

    private static final String STOP_WORD = "quit";
    private static final Scanner SCANNER = new Scanner(System.in);
    private static String input = "";

    public static void main(String[] args) {


        while (true) {
            read();

            if (input.equals(STOP_WORD)) {
                System.out.println("Программа завершена");
                break;
            }

            String parsedInteger = "";
            String operator = "";
            int parsed = 0;
            int result = 0;

            for (int i = 0; i < input.length(); i++) {
                char symbol = input.charAt(i);

                if (Character.isDigit(symbol)) {
                    parsedInteger += symbol;
                }

                if (!Character.isDigit(symbol) || i == input.length() - 1) {
                    parsed = Integer.parseInt(parsedInteger);
                    if (operator.equals("")) {
                        result = parsed;
                    } else {
                        if (operator.equals("+")) {
                            result += parsed;
                        } else if (operator.equals("-")) {
                            result -= parsed;
                        }

                    }
                    parsedInteger = "";
                    operator = "" + symbol;
                }
            }
            System.out.println("Результат: " + result);

        }
    }

    private static String read() {
        boolean flag = false;
        do {
            System.out.println("Введите целое число, знак действия и второе целое число");
            input = SCANNER.next().toLowerCase();
            input = input.replace(" ", "");
            if (hasStopWord(input)) {
                input = STOP_WORD;
                System.out.println("Введён " + STOP_WORD);
                break;
            }
            if (isValid(input)) {
                flag = true;
            } else {
                System.out.println("Введены некорректные данные: " + input);
            }
        } while (!flag);
        return input;
    }

    private static boolean hasStopWord(String input) {
        return input.contains(STOP_WORD);
    }

    private static boolean isValid(String input) {
        boolean flag = false;
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            flag = (Character.isDigit(symbol) || (symbol == '+') || (symbol == '-'));
        }
        return flag;
    }
}