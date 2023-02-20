package acmp.maths;

import java.util.Scanner;

public class Symmetry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] result = SymmetrySolution.invoke(
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt(), scanner.nextInt(),
                scanner.nextInt(), scanner.nextInt());

        for (int element :
                result) {
            System.out.println(element + " ");
        }
    }
}

/**
 * Многие из вас, вероятно, знакомы с понятием симметрии относительно прямой.
 * Пусть на плоскости расположена прямая L и точка A. Точка B называется симметричной
 * точке A относительно прямой L, если отрезок АВ перпендикулярен прямой L и делится
 * пополам точкой пересечения с ней. В частности, если точка А лежит на прямой L, то точка B совпадает с точкой А.
 *
 * Задана прямая L, параллельная одной из осей координат, и точка А. Найдите точку В, симметричную А относительно L.
 *
 * Входные данные
 * Первая строка входного файла INPUT.TXT содержит 4 числа: x1, y1, x2, y2 – координаты двух различных точек,
 * через которые проходит прямая L. Вторая строка входного файла содержит 2 числа xA и yA – координаты точки А.
 * Все числа во входном файле целые и не превосходят 108 по модулю.
 *
 * Выходные данные
 * В выходной файл OUTPUT.TXT выведите числа xB и yB – координаты точки B.
 */

class SymmetrySolution {
    static int[] invoke(int x1, int y1, int x2, int y2, int x, int y) {
        int[] result = new int[2];
        if (x1 == x2) {
            result[0] = x1 - (x - x1);
            result[1] = y;
        } else if (y1 == y2) {
            result[0] = x;
            result[1] = y1 - (y - y1);
        }

        return result;
    }
}
