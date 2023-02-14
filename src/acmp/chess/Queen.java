package acmp.chess;

import java.util.Scanner;

public class Queen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "NO";
        boolean canGo = QueenSolution.fix(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        if (canGo) {
            result = "YES";
        }
        System.out.println(result);
    }
}

/*
Напомним, что в шахматах используется клеточная доска размером 8х8, где располагаются шахматные фигуры,
которые могут перемещаться по определенным правилам. В частности, ферзь может перемещаться на любое
 расстояние по вертикали, горизонтали и диагонали (может ходить как ладья и слон).

Требуется определить: может ли ферзь выполнить ход из клетки с координатами (X1,Y1) в клетку с координатами (X2,Y2)
 на стандартной шахматной доске?
 */

class QueenSolution {
    static boolean fix(int x1, int y1, int x2, int y2) {
        int x = x1 - x2;
        int y = y1 - y2;
        if (x - y == 0 || x + y == 0) {
            return true;
        } else if (x1 == x2 || y1 == y2) {
            return true;
        }
        return false;
    }
}
