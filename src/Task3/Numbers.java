package Task3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Numbers {
    public static void main(String[] args) {

        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] randomList = new int[num];
        Random random = new Random();
        for (int i = 0; i < randomList.length; i++) {
            randomList[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(randomList));


        even(randomList);
        three(randomList);
        five(randomList);
        odd(randomList);
    }

    public static int calculateSizeByNumber(int[] list, int value) {
        int counter = 0;
        for (int i = 0; list.length > i; i++) {
            if (list[i] % value == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int calculateSizeByNumber2(int[] list, int value) {
        int counter = 0;
        for (int i = 0; list.length > i; i++) {
            if (list[i] % value != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void even(int[] list) {
        int counterEven = calculateSizeByNumber(list, 2);
        int[] evenNumbers = new int[counterEven];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            int value = list[i];
            if (value % 2 == 0) {
                evenNumbers[index] = value;
                index++;
            }
        }
        print(evenNumbers, "Чётные числа: ");
    }


    public static void three(int[] list) {
        int counterThree = calculateSizeByNumber(list, 3);
        int[] threeNumbers = new int[counterThree];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            int value = list[i];
            if (value % 3 == 0) {
                threeNumbers[index] = value;
                index++;
            }
        }

        print(threeNumbers, "Кратные трём числа: ");
    }

    public static void five(int[] list) {
        int counterFive = calculateSizeByNumber(list, 5);
        int[] fiveNumbers = new int[counterFive];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            int value = list[i];
            if (value % 5 == 0) {
                fiveNumbers[index] = value;
                index++;
            }
        }
        print(fiveNumbers, "Кратные пяти числа: ");
    }


    public static void odd(int[] list) {
        int counterOdd = calculateSizeByNumber2(list, 2);
        int[] oddNumbers = new int[counterOdd];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            int value = list[i];
            if (value % 2 != 0) {
                oddNumbers[index] = value;
                index++;
            }
        }
        print(oddNumbers, "Нечётные числа: ");
    }

    public static void print(int[] list, String message) {
        System.out.print(message);
        System.out.println(Arrays.toString(list));
    }
}