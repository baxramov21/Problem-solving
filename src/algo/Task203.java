package algo;

import java.util.Scanner;

public class Task203 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputsAmount = scanner.nextInt();
        int[] inputs = new int[inputsAmount];
        for (int i = 0; i < inputsAmount; i++) {
            inputs[i] = scanner.nextInt();
        }
        int circleAmount = scanner.nextInt();
        int[] results = new int[circleAmount];
        for (int i = 0; i < circleAmount; i++) {
            int index1 = scanner.nextInt();
            int index2 = scanner.nextInt();
            results[i] = Task203Solution.p203Fix(inputs, index1, index2);
        }

        for (int resultPiece :
                results) {
            System.out.println(resultPiece);
        }
    }
}

class Task203Solution {
    static int p203Fix(int numbers[], int index1, int index2) {
        int sum = 0;
        for (int i = index1 - 1; i < index2; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
