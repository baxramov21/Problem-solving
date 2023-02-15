package acmp.basic_comparisons;

import java.util.Scanner;

public class ThreeFatties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(FindFattest.findHeaviest(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }
}

/**
 * Три толстяка решили поспорить: кто из них самый тяжелый. После взвешивания оказалось,
 * что их масса соответственно M1, M2 и M3 килограмм. Считается, что масса толстяка должна
 * быть не менее 94 и не более 727 килограмм.
 *
 * Помогите определить массу самого тяжелого из них, либо выяснить, что была допущена ошибка при взвешивании.
 *
 * Входные данные
 * Входной файл INPUT.TXT содержит три целых числа M1, M2 и M3, разделенные пробелом.
 * Все числа целые и не превосходят 10 000 по абсолютной величине.
 *
 * Выходные данные
 * В выходной файл OUTPUT.TXT выведите массу самого тяжелого толстяка в случае корректного взвешивания,
 * либо слово «Error» в противном случае.
 */
class FindFattest {
    static String findHeaviest(int f1, int f2, int f3) {
        int heaviest = Math.max(Math.max(f1, f2), f3);
        int lightest = Math.min(Math.min(f1, f2),f3);

        if (heaviest > 727 || lightest < 94) {
            return "Error";
        }
        return String.valueOf(heaviest);
    }
}
