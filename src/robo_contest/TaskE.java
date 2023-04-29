package robo_contest;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] answers = new int[length];

        for (int i = 0; i < length; i++) {
            int number = scanner.nextInt();
            answers[i] = findAnswer(number);
        }

        for (int i :
                answers) {
            System.out.println(i);
        }
    }

    static int findAnswer(int number) {
        int result = 0;
        String numberToStr = String.valueOf(number);
        char[] chars = numberToStr.toCharArray();
        int[] nums = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            nums[i] = Character.getNumericValue(chars[i]);
        }

        for (int i :
                nums) {
            if (i != 0) {
                if (number % i == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}