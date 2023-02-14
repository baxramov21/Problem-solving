package acmp.chess;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "NO";
        boolean canGo = ElephantTask.elephantFix(scanner.nextInt(),scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        if (canGo) {
            result = "YES";
        }
        System.out.println(result);
    }
}

/*
Напомним, что в шахматах используется клеточная доска размером 8х8, где располагаются шахматные фигуры,
которые могут перемещаться по определенным правилам. В частности, слон может перемещаться на любое
расстояние по диагонали.
Требуется определить: может ли слон выполнить ход из клетки с координатами (X1,Y1) в клетку с координатами
(X2,Y2) на стандартной шахматной доске?
 */

class ElephantTask {
    static boolean elephantFix(int x1, int y1, int x2, int y2) {
        int x = x1 - x2;
        int y = y1 - y2;
        return x - y == 0 ||
                x + y == 0;
    }
}
