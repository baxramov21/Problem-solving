package acmp;

import java.util.Scanner;

public class HelpToTheBusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = 437;
        int bridgeAmount = scanner.nextInt();
        int[] bridgeHeights = new int[bridgeAmount];
        for (int i = 0; i < bridgeAmount; i++) {
            bridgeHeights[i] = scanner.nextInt();
        }

        int value = HelpToTheBus.solution(busHeight, bridgeHeights);
        String finalResult = "";
        if (value > 0) {
            finalResult = String.format("Crash %d ", value);
        } else {
            finalResult = "No crash";
        }

        System.out.println(finalResult);
    }
}

/*
Оргкомитет Московской городской олимпиады решил организовать обзорную экскурсию по Москве для участников олимпиады.
 Для этого был заказан двухэтажный автобус (участников олимпиады достаточно много и в обычный они не умещаются)
  высотой 437 сантиметров. На экскурсионном маршруте встречаются N мостов. Жюри и оргкомитет олимпиады очень
  обеспокоены тем, что высокий двухэтажный автобус может не проехать под одним из них. Им удалось выяснить
   точную высоту каждого из мостов. Автобус может проехать под мостом тогда и только тогда, когда высота
    моста превосходит высоту автобуса.

Помогите организаторам узнать, закончится ли экскурсия благополучно, а если нет, то установить, где произойдет авария.

Входные данные
Первая строка входного файла INPUT.TXT содержит число N (1 ≤ N ≤ 1000).
Вторая строка содержит N натуральных чисел, не превосходящих 10000,
через пробел - высоты мостов в сантиметрах в том порядке, в котором они встречаются на пути автобуса.

Выходные данные
В единственную строку выходного файла OUTPUT.TXT нужно вывести фразу "No crash",
 если экскурсия закончится благополучно. Если же произойдет авария,
 то нужно вывести сообщение "Crash k", где k - номер моста, где произойдет авария.
  Фразы выводить без кавычек ровно с одним пробелом внутри.
 */

class HelpToTheBus {
    static int solution(int busHeight, int[] bridge) {
        for (int i = 0; i < bridge.length; i++) {
            int position = i + 1;
            if (busHeight >= bridge[i]) {
                return position;
            }
        }
        return 0;
    }
}
