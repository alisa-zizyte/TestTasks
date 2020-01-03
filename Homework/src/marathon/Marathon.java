package marathon;

import java.util.*;
import java.util.Scanner;

public class Marathon {

    private static String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
    private static int[] timeInt = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

    public static void main(String[] args) {

        List<Participant> participants = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            participants.add(i, new Participant(names[i], timeInt[i]));
        }
        participants.sort(new ParticipantByTimeComparator());

        for (Participant participant : participants) {
            System.out.println(participant);
        }

        System.out.println("Введите номер места в забеге: ");
        Scanner scanner = new Scanner(System.in);
        String place = scanner.nextLine();

        try {

            if(Integer.valueOf(place)>= 1 && Integer.valueOf(place) <= (names.length)) {
                System.out.println(participants.get(Integer.valueOf(place) - 1));
            }
            else System.out.println("Неправильный номер места!");

        } catch (NumberFormatException e) {
            System.out.println("Невалидный ввод!");
        }

    }
}


