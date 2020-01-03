import java.util.Scanner;

public class Rhomb {
    public static void main(String[] args) {
        System.out.println("Введите длину стороны ромба: ");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        int side = Integer.parseInt(value);

        drawRhomb(side);
    }
    private static void drawRhomb(int side) {
        if (side >= 1) {
            for (int i = 1; i < side; i++) {

                for (int j = side; j > i; --j) {
                    System.out.print(" ");
                }
                System.out.print("*");

                if(i>1) {
                    for (int j = 1; j < 2 * i - 2; ++j) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = side; i >= 1; --i) {

                for (int j = side; j > i; --j) {
                    System.out.print(" ");
                }
                System.out.print("*");
                if (i > 1) {
                    for (int j = 1; j < i * 2 - 2; ++j) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        } else
            System.out.println("Неправильный ввод!");
    }
}