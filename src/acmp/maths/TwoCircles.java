package acmp.maths;

import java.util.Scanner;

public class TwoCircles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean areTheyEqual =
                TwoCirclesSolution
                        .invoke(scanner.nextDouble(),
                                scanner.nextDouble(),
                                scanner.nextDouble(),
                                scanner.nextDouble(),
                                scanner.nextDouble(),
                                scanner.nextDouble());
        String value = "NO";
        if (areTheyEqual) {
            value = "YES";
        }
        System.out.println(value);
    }
}

/**
 * На плоскости даны две окружности. Требуется проверить, имеют ли они хотя бы одну общую точку.
 *
 * Входные данные
 * Входной файл INPUT.TXT состоит из двух строк. На каждой строке записана информация об одной окружности – координаты
 * ее центра x и y (целые числа, по модулю не превосходящие 5000) и радиус (целое число 1 ≤ r ≤ 1000).
 *
 * В выходной файл OUTPUT.TXT выведите «YES», если окружности имеют хотя бы одну общую точку, и «NO» в противном случае.
 */
class TwoCirclesSolution {
    static boolean invoke(double x1, double y1, double r1, double x2, double y2, double r2) {
        double segmentLength = findSegmentLength(x1, y1, x2, y2);
        if (segmentLength <= r1 + r2 && Math.abs(r1 - r2) <= segmentLength) {
            return true;
        }
        return false;
    }

    static double findSegmentLength(double x1, double y1, double x2, double y2) {
        double x = (x1 - x2) * (x1 - x2);
        double y = (y1 - y2) * (y1 - y2);
        return Math.sqrt(x + y);
    }
}
