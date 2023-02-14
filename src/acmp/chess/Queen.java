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
