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

/**
 * Напомним, что в шахматах используется клеточная доска размером 8х8, где располагаются шахматные фигуры,
 * которые могут перемещаться по определенным правилам. В частности, пешка ходит на 1 поле вперед по вертикали,
 * начиная в начале игры свое движение со второй линии, при первом ходе пешка может перемещаться на 2 поля вперед
 * по вертикали. Будем рассматривать только свободный ход пешки, т.е. тот случай, когда пешка перемещается в пустое поле.
 * <p>
 * Требуется определить: может ли пешка выполнить ход из клетки с координатами (X1,Y1) в клетку
 * с координатами (X2,Y2) на стандартной шахматной доске?
 */

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
