package Task6;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Student[] studentsList = new Student[5];

        studentsList[0] = new Student("Аркадий", "Гриневич");
        studentsList[1] = new Student("Николай", "Ходко");
        studentsList[2] = new Student("Егор", "Волков");
        studentsList[0] = new Student("Василий", "Пупкин");
        studentsList[0] = new Student("Игорь", "Грачевский");

        int[] gradesList = new int[5];
        Random random = new Random();
        for (int i = 0; i < gradesList.length; i++) {
            gradesList[i] = 1 + random.nextInt(5);
        }

        double grade1 = (double) gradesList[0];
        double grade2 = (double) gradesList[1];
        double grade3 = (double) gradesList[2];
        double grade4 = (double) gradesList[3];
        double grade5 = (double) gradesList[4];

        double average = (grade1 + grade2 + grade3 + grade4 + grade5)/ 5;
        System.out.println(average);
    }
}
