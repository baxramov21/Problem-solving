package acmp.other;

import java.util.Scanner;

public class WarmDaysMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysAmount = scanner.nextInt();
        int[] celsius = new int[daysAmount];
        for (int i = 0; i < daysAmount; i++) {
            celsius[i] = scanner.nextInt();
        }
        System.out.println(WarmDays.solution(celsius));
    }
}

/*/
Уставшие от необычно теплой зимы, жители решили узнать, действительно ли это самая длинная оттепель за
всю историю наблюдений за погодой. Они обратились к синоптикам, а те, в свою очередь, занялись исследованиями
статистики за прошлые годы. Их интересует, сколько дней длилась самая длинная оттепель.

Оттепелью они называют период, в который среднесуточная температура ежедневно превышала 0 градусов Цельсия.
Напишите программу, помогающую синоптикам в работе.

Входные данные
Во входном файле INPUT.TXT сначала записано число N – общее количество рассматриваемых дней (1 ≤ N ≤ 100).
 В следующей строке через пробел располагается N целых чисел, разделенных пробелами. Каждое число – среднесуточная
  температура в соответствующий день. Температуры – целые числа и лежат в диапазоне от –50 до 50.

Выходные данные
В выходной файл OUTPUT.TXT требуется вывести одно число – длину самой продолжительной оттепели,
то есть наибольшее количество последовательных дней, на протяжении которых среднесуточная температура
 превышала 0 градусов. Если температура в каждый из дней была неположительной, выведите 0.
 */

class WarmDays {
    static int solution(int[] days) {
        int daysAmount = 0, maxx = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > 0) {
                daysAmount++;
            } else {
                if (maxx < daysAmount) {
                    maxx = daysAmount;
                    daysAmount = 0;
                }
            }
        }
        if (maxx < daysAmount) {
            maxx = daysAmount;
            daysAmount = 0;
        }
        return maxx;
    }
}