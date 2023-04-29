package day2;

import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String numberToStr = String.valueOf(number);

        int length = numberToStr.length();

        int result = 0;

        for (char ch : numberToStr.toCharArray()) {
            result += Math.pow(Character.getNumericValue(ch), length);
        }

        if (result == number) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
