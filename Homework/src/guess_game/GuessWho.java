package guess_game;

import java.util.*;

public class GuessWho {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Твое загаданное слово
        String name = "Alisa";
        //Создаем массив с длинной этого слова
        char[] arrayName = new char[name.length()];
        char[] enteredSymbols = new char[100];
        int counter = 0;
        boolean isChanged = false;

        //фигачим в массив вместо букв звездочки
        for (int i = 0; i < name.length(); i++) {
            arrayName[i] = '*';
        }
        //Выводим звездочки
        System.out.println(arrayName);
        //Пока в массиве есть звездочки
        while (new String(arrayName).contains("*")) {
            System.out.println("Введите букву");
            //вводим с клавиатуры символ
            String symbol = scanner.next();
            //идем в слове по каждой букве
            if (Character.isLetter(symbol.toLowerCase().toCharArray()[0])) {
                char symbolGuess = symbol.toLowerCase().toCharArray()[0];
                if (enteredSymbols.length == 0 || !containsSymbol(enteredSymbols, symbolGuess)) {
                    enteredSymbols[counter] = symbolGuess;
                    counter++;
                    for (int i = 0; i < name.length(); i++) {
                        //если буква в слове = той, что ты ввела
                        if (name.toLowerCase().charAt(i) == symbolGuess) {
                            //меняем звездочку в массиве на эту букву
                            arrayName[i] = symbolGuess;
                            isChanged = true;
                        }
                    }
                    if (!isChanged) {
                        System.out.println("Не угадали");
                    }
                } else {
                    System.out.println("Вы уже вводили эту букву!");
                }
            } else {
                System.out.println("Невалидный ввод!");
            }
            System.out.println(arrayName);
        }
        System.out.println("KRASAVA");
    }

    private static boolean containsSymbol(char[] symbols, char symbol) {
        for (int i = 0; i < symbols.length; i++) {
            if (symbol == symbols[i]) {
                return true;
            }
        }
        return false;
    }
}
