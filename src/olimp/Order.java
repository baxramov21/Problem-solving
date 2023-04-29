package olimp;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n==0) {
            System.out.println(1);
            return;
        }
        int[] array = new int[n + 1];
            array[0] = 1;
            array[1] = 1;
            for (int i = 2; i <= n ; i++) {
                array[i] = (array[i - 1] + array[i - 2]) % 1000000007;
            }
        System.out.println(array[n]);
    }
}
