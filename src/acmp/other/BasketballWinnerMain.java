package acmp.other;

import java.util.Scanner;

public class BasketballWinnerMain {
    public static void main(String[] args) {
        Scanner scannerFirstTerm = new Scanner(System.in);
        BasketballMatchWinner.solution(scannerFirstTerm);
    }
}

/*
Известны результаты каждой из 4х четвертей баскетбольной встречи. Нужно определить победителя матча.
Побеждает команда, набравшая больше очков в течение всего матча.

Входные данные
Входной файл INPUT.TXT содержит 4 строки, в каждой строке находится два целых числа a и b – итоговый
счет в соответствующей четверти. а – количество набранных очков за четверть первой командой, b – количество очков,
 набранных за четверть второй командой. (0 ≤ a,b ≤ 100).

Выходные данные
В выходной файл OUTPUT.TXT выведите номер выигравшей команды, в случае ничьей следует вывести «DRAW».
 */

class BasketballMatchWinner {
    static void solution(Scanner scannerFirstTerm) {
        int firstTeamPoints = 0;
        int secondTeamPoints = 0;
        for (int i = 0; i < 4; i++) {
            firstTeamPoints += scannerFirstTerm.nextInt();
            secondTeamPoints += scannerFirstTerm.nextInt();
        }
        if (firstTeamPoints > secondTeamPoints) {
            System.out.println("1");
        } else if (firstTeamPoints == secondTeamPoints) {
            System.out.println("DRAW");
        } else {
            System.out.println("2");
        }
    }
}
