package acmp.maths;

import java.util.Scanner;

public class SegmentLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                FindSegmentLength
                        .invoke(
                                scanner.nextDouble(), scanner.nextDouble(),
                                scanner.nextDouble(), scanner.nextDouble())
        );
    }
}

/**
 * Отрезок задан координатами своих концевых точек. Требуется вычислить длину этого отрезка.
 *
 * Входные данные
 * Первая строка входного файла INPUT.TXT содержит координаты концов отрезка в формате X1 Y1 X2 Y2 .
 * Все координаты – целые числа, не превышающие 1000 по абсолютной величине.
 */

class FindSegmentLength {
    static double invoke(double x1, double y1, double x2, double y2) {
        double x = (x2 - x1) * (x2 - x1);
        double y = (y2 - y1) * (y2 - y1);
        return Math.sqrt(x + y);
    }
}
