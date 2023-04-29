package olimp;

import java.util.Scanner;

public class Baloons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long result = (n * ((n + 1))) / 2;
        System.out.println(result);
    }
}
