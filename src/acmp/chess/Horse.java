package acmp.chess;

import java.util.Scanner;

public class Horse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "NO";
        boolean canGo = HorseSolution.horseFix(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        if (canGo) {
            result = "YES";
        }
        System.out.println(result);
    }
}

class HorseSolution {
    static boolean horseFix(int x1, int y1, int x2, int y2) {
        if (x1 - 1 == x2 && y1 - 2 == y2 || (x1 + 1 == x2 && y1 + 2 == y2)) {
            return true;
        } else if (y1 - 1 == y2 && x1 - 2 == x2 || (y1 + 1 == y2 && x1 + 2 == x2)) {
            return true;
        } else if (y1 - 2 == y2 && x1 + 1 == x2 || (y1 + 2 == y2 && x1 - 1 == x2)) {
            return true;
        } else if (x1 - 2 == x2 && y1 + 1 == y2 || (x1 + 2 == x2 && y1 - 1 == y2)) {
            return true;
        }
        return false;
    }
}
