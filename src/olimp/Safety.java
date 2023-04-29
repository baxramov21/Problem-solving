package olimp;

import java.util.Scanner;

public class Safety {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();
        long result = 60 * 60 * 24 * 365 * years;
        System.out.println(result / 1000);
    }
}
