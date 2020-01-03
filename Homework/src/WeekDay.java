import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeekDay {

    private static final String REGEX = "^[1-7]{1}$";
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        switch (read()) {
            case (1):
                System.out.println("Понедельник");
                break;
            case (2):
                System.out.println("Вторник");
                break;
            case (3):
                System.out.println("Среда");
                break;
            case (4):
                System.out.println("Четверг");
                break;
            case (5):
                System.out.println("Пятница");
                break;
            case (6):
                System.out.println("Суббота");
                break;
            case (7):
                System.out.println("Воскресенье");
                break;
        }
    }

    private static boolean isWeekday(String weekDay) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(weekDay);
        return matcher.matches();
    }

    private static int read() {
        String weekday;
        while (true) {
            System.out.println("Введите номер дня недели от 1 до 7: ");
            weekday = SCANNER.nextLine();
            if (isWeekday(weekday)) {
                return Integer.parseInt(weekday);
            }
            System.out.println("Вы ввели некорретное число!");
        }
    }
}

