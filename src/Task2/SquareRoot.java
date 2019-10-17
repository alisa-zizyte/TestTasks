package Task2;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        root();
    }

    public static int read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        return scanner.nextInt();
    }

    public static void root() {
        int a;
        do {
            a = read();
            if (a == 0) {
                System.out.println("a не должно равняться нулю!");
            }
        } while (a == 0);
        int b = read();
        int c = read();
        double d;

        d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);

            System.out.println(String.format("Корни уравнения: x1 = %.2f x2 = %.2f", x1, x2));
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("Корень уравнения: x = " + x);
        } else {
            System.out.println("Уравнение не имеет корней!");
        }
    }

}