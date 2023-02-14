package acmp.chess;

import java.util.Scanner;

public class ChessField {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean canGo = ChessFieldSolution.solution(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        String result = "NO";
        if (canGo) {
            result = "YES";
        }
        System.out.println(result);
    }
}

/**
 * На стандартной шахматной доске 8х8 заданы координаты двух клеток.
 * Требуется определить: имеют ли данные клетки одинаковый цвет?
 */

class ChessFieldSolution {
    static boolean solution(int x1, int y1, int x2, int y2) {
        if ((x1 + y1) % 2 == (x2 + y2) % 2) {
            return true;
        }
        return false;
    }
}
