package acmp.arrays;

import java.util.Scanner;

public class ChangeGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int maxGrade = 0;
        int minGrade = array[0];


        for (int number :
                array) {
            if (number > maxGrade) {
                maxGrade = number;
            }

            if (number < minGrade) {
                minGrade = number;
            }
        }

        for (int i = 0; i < length; i++) {
            if (array[i] == maxGrade) {
                array[i] = minGrade;
            }
        }

        for (int element :
                array) {
            System.out.print(element + " ");
        }
    }
}
