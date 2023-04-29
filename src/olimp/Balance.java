package olimp;

import java.util.Scanner;

public class Balance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int result = 0;

        for (int element : array) {
            result += element;
        }
        System.out.println(result);
    }
}
