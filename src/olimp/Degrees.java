package olimp;

import java.util.Scanner;

public class Degrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double aT = (Math.acos((degree(b) + degree(c) - degree(a)) / (2 * b * c)) * (180 / Math.PI));
        double bT = (Math.acos((degree(a) + degree(c) - degree(b)) / (2 * a * c)) * (180 / Math.PI));
        double cT = (Math.acos((degree(a) + degree(b) - degree(c)) / ((2 * a * b)))) * (180 / Math.PI);

        System.out.printf("%.3f", aT);
        System.out.print(" ");
        System.out.printf("%.3f", bT);
        System.out.print(" ");
        System.out.printf("%.3f", cT);
    }

    static double degree(int a) {
        return a * a * 1.0;
    }
}
