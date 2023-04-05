package acmp.difficult_tasks;

import java.util.Scanner;

public class Tourist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean result = TouristSolution.invoke(
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt()
        );

        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

/**
 * Гена собирается на туристический слет учеников своей школы. В своем классе он был назначен ответственным за палатки.
 * У себя дома он нашел 3 палатки: первая из них весит a1 килограмм и вмещает b1 человек, вторая весит a2 килограмм и
 * вмещает b2 человек, третья весит a3 килограмм и вмещает b3 человек.
 * <p>
 * В классе Гены K человек. Выясните, может ли он выбрать палатки так, чтобы в них все могли поместиться.
 * При этом учитывайте, что выбранные палатки должны суммарно весить не более W килограмм.
 * <p>
 * Входные данные
 * Первая строка входного файла INPUT.TXT содержит два целых числа: K и W (1 ≤ K ≤ 15, 1 ≤ W ≤ 30).
 * Вторая строка содержит шесть целых чисел: a1, b1, a2, b2, a3, b3 (1 ≤ a1, a2, a3 ≤ 10, 1 ≤ b1, b2, b3 ≤ 15).
 * <p>
 * Выходные данные
 * В выходной файл OUTPUT.TXT выведите YES, если палатки указанным образом выбрать можно, и NO в противном случае.
 */

class TouristSolution {
    static boolean invoke(int K, int W, int a1, int b1, int a2, int b2, int a3, int b3) {
        if ((a1 <= W && b1 >= K) || (a2 <= W && b2 >= K) || (a3 <= W && b3 >= K)) {
            return true;
        } else if (a1 + a2 <= W && b1 + b2 >= K) {
            return true;
        } else if (a1 + a3 <= W && b1 + b3 >= K) {
            return true;
        } else if (a2 + a3 <= W && b2 + b3 >= K) {
            return true;
        } else if (a1 + a2 + a3 <= W && b1 + b2 + b3 >= K) {
            return true;
        }

        return false;
    }
}
