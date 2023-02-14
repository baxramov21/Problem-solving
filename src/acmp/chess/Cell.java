package acmp.chess;

import java.util.Scanner;

public class Cell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "WHITE";
        boolean canGo = CellFix.fix(scanner.next());
        if (canGo) {
            result = "BLACK";
        }
        System.out.println(result);
    }
}

class CellFix {
    static boolean fix(String position) {
        char letter = position.charAt(0);
        int number = Character.getNumericValue(position.charAt(1));
        boolean oddL = false;
        switch (letter) {
            case 'A':
            case 'C':
            case 'E':
            case 'G':
                oddL = true;
                break;
            default:
                oddL = false;
        }

        if (oddL && number % 2 == 1) {
            return true;
        } else if (!oddL && number % 2 == 0) {
            return true;
        }

        return false;
    }
}
