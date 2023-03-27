package acmp.maths;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] rawResult = QuadraticEquationSolution.invoke(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        for (int i = 0; i < rawResult.length; i++) {
            if (rawResult[0] != 0) {
                if (i == 0) {
                    int element = (int) rawResult[i];
                    System.out.println(element);
                }
                if (rawResult[2] == 0) {
                    if(i < 2 && i != 0) {
                        String value = String.format(Locale.ROOT,"%.6f",rawResult[i]);
                        System.out.println(value);
                    }
                } else {
                    if (i != 0) {
                        String value = String.format(Locale.ROOT, "%.6f", rawResult[i]);
                        System.out.println(value);
                    }
                }
            }
        }

//        if (rawResult[0] == 0 || rawResult[0] < 0) {
////            String value = String.format(Locale.ROOT,"%.6f",rawResult[0]);
//            int element = (int) rawResult[0];
//            System.out.println(element);
//        }
    }
}

/**
 * Сложно найти человека, который любит решать однообразные задачки по математике. В последнее время школьникам стало
 * легче, ведь с появлением компьютеров почти в каждой квартире стало существенно проще проверять себя.
 * <p>
 * Но программы, в которых решение уравнений является стандартной функцией, установлены не везде. Напишите программу,
 * которая сможет решить уравнение
 * <p>
 * ax2 + bx + c = 0
 * <p>
 * при заданных коэффициентах a, b и c.
 * Входные данные
 * Единственная строка входного файла INPUT.TXT содержит три целых числа a, b и c, каждое из которых не превосходит
 * по модулю 30000. Числа разделяются пробелами.
 * <p>
 * Выходные данные
 * На первой строке выходного файла OUTPUT.TXT выведите число различных действительных корней заданного уравнения.
 * Затем выведите сами корни по одному на строке с ошибкой, не превосходящей 10-4. Если для заданных коэффициентов
 * корней бесконечно много, на единственной строке выходного файла выведите -1.
 * <p>
 * Алгоритм решения квадратного уравнения ax2 + bx + c = 0:
 * вычислить его значение дискриминанта по формуле D = b2−4ac;
 * если дискриминант отрицательный, зафиксировать, что действительных корней нет;
 * если дискриминант равен нулю, вычислить единственный корень уравнения по формуле х = −b/2a;
 * <p>
 * x1 = (-b + Sqrt(D)) / 2a
 * x2 = (-b - Sqrt(D)) / 2a
 */

class QuadraticEquationSolution {
    static double[] invoke(double a, double b, double c) {
        double[] result = new double[3];

        if (a == 0 && b == 0 && c == 0) {
            result[0] = -1;
        }
        if (a == 0) {
            if (b == 0) {
                result[0] = 0;
            } else {
                double x = -c / b;
                result[0] = 1;
                result[1] = x;
            }
        } else {
            double D = (b * b) - (4 * a * c);
            if (D < 0) {
                result[0] = 0;
            } else if (D == 0) {
                result[0] = 1;
                double y = -b / (2 * a);
                result[1] = y;
            } else if (D > 0) {
                double x1 = ((-b - Math.sqrt(D)) / (2 * a));
                double x2 = ((-b + Math.sqrt(D)) / (2 * a));
                result[1] = x1;
                result[0] = 2;
                result[2] = x2;
            }
        }
        return result;

    }
}
