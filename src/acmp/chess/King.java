package acmp.chess;

import java.util.Scanner;

public class King {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "NO";
        boolean canGo = KingSolution.kingFix(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        if (canGo) {
            result = "YES";
        }
        System.out.println(result);
    }
}

/*
Напомним, что в шахматах используется клеточная доска размером 8х8, где располагаются шахматные фигуры,
 которые могут перемещаться по определенным правилам. В частности, король может перемещаться на соседнюю
  клетку по вертикали, горизонтали и диагонали.
Требуется определить: может ли король выполнить ход из клетки с координатами (X1,Y1) в клетку
с координатами (X2,Y2) на стандартной шахматной доске?
 */

class KingSolution {
    static boolean kingFix(int x1, int y1, int x2, int y2) {
        int xM = x1 - x2;
        int yM = y1 - y2;
        int xP = x1 + x2;
        int yP = y1 + y2;

        if (xM == 1 || xP == 1 || xM == -1 || xP == -1 || xM == 0 || xP == 0) {
            if (yM == 1 || yP == 1 ||  yM == -1 ||  yP == -1 || yM == 0 || yP == 0) {
                return true;
            }
        }
        return false;
    }
}
