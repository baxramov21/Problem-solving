package acmp.chess;

import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean canGo = RookSolution.fix(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        String result = "NO";
        if (canGo) {
            result = "YES";
        }
        System.out.println(result);
    }
}

/**
 * Напомним, что в шахматах используется клеточная доска размером 8х8, где располагаются шахматные фигуры, которые
 * могут перемещаться по определенным правилам. В частности, ладья может перемещаться на любое расстояние,
 * как по вертикали, так и по горизонтали.
 * Требуется определить: может ли ладья выполнить ход из клетки с координатами (X1,Y1) в клетку с координатами
 * (X2,Y2) на стандартной шахматной доске?
 */

class RookSolution {
    static boolean fix(int x1, int y1, int x2, int y2) {
        return x1 == x2 || y1 == y2;
    }
}
