package Task4;

import java.util.Scanner;

public class Fibonachchi {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fibo(n);
    }

    public static void fibo(int n) {
        int f0 = 0;
        int f1 = 1;
        int f2 = f0 + f1;
        int f;
        System.out.print(f0 + " " + f1 + " " + f2 + " ");
        for (int i = 3; i <= n; i++ ){
            f = f1 + f2;
            System.out.print(f + " ");
            f1 = f2;
            f2=f;
        }
    }
}
