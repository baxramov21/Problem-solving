package acmp.maths;

import java.util.Scanner;

public class SchoolMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(SchoolMathsSolution.invoke(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }
}

/**
 * Трёхчлен a + bx + сy от двух переменных x и y однозначно определяется коэффициентами a, b и c.
 * Написать программу, которая по заданным a, b и c выводит соответствующий трёхчлен, записанный с использованием
 * алгебраических соглашений:
 *
 * коэффициент при члене, содержащем переменную, опускается, если его модуль равен единице;
 * член, коэффициент при котором равен нулю, опускается (кроме случая, когда все коэффициенты равны нулю,
 * тогда трехчлен состоит из одной цифры 0);
 * знак "+" опускается, если он предшествует отрицательному коэффициенту;
 * знак "+" опускается, если он стоит в начале выражения (так называемый унарный плюс);
 * знак умножения между коэффициентом и переменной опускается.
 * При этом запрещено менять местами члены.
 *
 * Входные данные
 * Во входном файле INPUT.TXT через пробел записаны целые коэффициенты a, b и с, каждое из которых не
 * превосходит 30000 по абсолютной величине.
 */

class SchoolMathsSolution {
    static String invoke(int a, int b, int c) {
        String value = "";
        boolean valueExists = false;
        if (a != 0) {
            value = "" + a;
            valueExists = true;
        }

        if (b != 0) {
            if (b < 0 && valueExists) {
                value += "-";
                b *= -1;
            } else if (b > 0 && valueExists) {
                value += "+";
            }
            if (b != 1) {
                value += "" + b;

            }
            value += "x";
            valueExists = true;
        }

        if (c != 0) {
            if (c < 0 && valueExists) {
                value += "-";
                c *= -1;
            } else if (c > 0 && valueExists) {
                value += "+";
            }
            if (c != 1) {
                value += "" + c;

            }
            value += "y";
            valueExists = true;
        }
        return value;
    }
}
