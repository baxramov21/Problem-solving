package acmp.chess;

import java.util.ArrayList;
import java.util.Scanner;

public class ChessFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> figures = ChessFiguresFix.identifyFigures(scanner.next(), scanner.next());
        if (figures.size() <= 0) {
            System.out.println("Nobody");
            return;
        }
        for (String figure :
                figures) {
            System.out.println(figure);
        }

    }
}

/**
 * По заданным координатам двух клеток шахматной доски необходимо определить список шахматных фигур, которые могут
 * перемещаться при игре за «белых» по правилам шахмат из первой координаты во вторую без взятия фигуры соперника.
 * Напомним, что для игры в шахматы используется доска размером 8х8. При этом горизонтальная координата нумеруется
 * английскими буквами от «A» до «H», а вертикальная – цифрами от 1 до 8 снизу вверх. Таким образом, координата
 * клетки состоит из буквы и цифры. Например, «H1» и «A8» – правый нижний и левый верхний углы соответственно.
 * Всего существует 6 шахматных фигур: ладья, слон, конь, ферзь, король и пешка. Опишем правила выполнения хода
 * без взятия на свободной доске:
 * король ходит на расстояние 1 по вертикали, горизонтали или диагонали;
 * ферзь ходит на любое расстояние по вертикали, горизонтали или диагонали;
 * ладья ходит на любое расстояние по вертикали или горизонтали;
 * слон ходит на любое расстояние по диагонали;
 * конь ходит буквой «Г», т.е. на поле, находящееся на расстоянии 2 по вертикали и 1 по горизонтали
 * или 1 по вертикали и 2 по горизонтали;
 * пешка ходит на 1 поле вперед по вертикали, начиная свое движение со второй линии, при первом
 * ходе пешка может перемещаться на 2 поля вперед по вертикали.
 */

class ChessFiguresFix {
    static ArrayList<String> identifyFigures(String p1, String p2) {

        ArrayList<String> figures = new ArrayList<>();
        int x1 = identifyY(p1.charAt(0));
        int y1 = Character.getNumericValue(p1.charAt(1));

        int x2 = identifyY(p2.charAt(0));
        int y2 = Character.getNumericValue(p2.charAt(1));

        if (RookSolution.fix(x1, y1, x2, y2)) {
            figures.add("Rook");
        }

        if (QueenSolution.fix(x1, y1, x2, y2)) {
            figures.add("Queen");
        }

        if (KnightSolution.horseFix(x1, y1, x2, y2)) {
            figures.add("Knight");
        }


        if (BishopTask.elephantFix(x1, y1, x2, y2)) {
            figures.add("Bishop");
        }

        if (PawnTask.fix(x1, y1, x2, y2)) {
            figures.add("Pawn");
        }

        if (KnightSolution.horseFix(x1, y1, x2, y2)) {
            figures.add("King");
        }

        return figures;
    }

    private static int identifyY(char y1Char) {
        int y1;
        switch (y1Char) {
            case 'A':
                y1 = 1;
                break;

            case 'B':
                y1 = 2;
                break;

            case 'C':
                y1 = 3;
                break;

            case 'D':
                y1 = 4;
                break;

            case 'E':
                y1 = 5;
                break;

            case 'F':
                y1 = 6;
                break;

            case 'G':
                y1 = 7;
                break;

            case 'H':
                y1 = 8;
                break;

            default:
                y1 = 0;
        }

        return y1;
    }
}
