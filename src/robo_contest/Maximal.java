package robo_contest;

import java.util.Scanner;

public class Maximal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] inputs = new int[length];
        for (int i = 0; i < length; i++) {
            inputs[i] = scanner.nextInt();
        }
        System.out.println(Solution.solution((inputs)));
    }
}

/*
Вам дан одномерный массив. Требуется найти максимальное число заданного массива.
 */
    class Solution {
        static int solution(int[] args) {
            int maxValue = 0;
            int value = 0;

            for (int i = 0; i < args.length; i++) {
                if (args[i] >= maxValue) {
                    maxValue = args[i];
                }
                if (args[i] == maxValue) {
                    value++;
                }
            }

            return value;
        }
    }

