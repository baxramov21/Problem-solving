package acmp.difficult_tasks;

import java.util.HashMap;
import java.util.Scanner;

public class FoxAliseAndCatBasilio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        HashMap<Integer, Integer> result = TaskSolution.invoke(sum);
        System.out.println(result.get(5));
        System.out.print(result.get(3));
    }
}
/**
 * Лиса Алиса и кот Базилио вырастили денежное дерево. И выросли на нем трехрублевые и пятирублевые золотые монеты.
 * Лиса Алиса себе взяла трехрублевые монеты, а коту Базилио отдала пятирублевые монеты. Посетовав на свою скромность,
 * она предложила впредь рассчитываться за покупки вместе, деньги давать без сдачи и минимальным числом монет. Известно,
 * что они сделали покупку стоимостью N рублей, при этом они рассчитались без сдачи.
 * <p>
 * Вам следует написать программу, которая определяет: сколько монет внес кот Базилио, и сколько монет внесла лиса Алиса.
 * <p>
 * Входные данные
 * Во входном файле INPUT.TXT записано одно натуральное число N – стоимость покупки в рублях (7 < N < 1000).
 * <p>
 * Выходные данные
 * В выходной OUTPUT.TXT выведите два целых числа через пробел: число монет, которые отдал кот Базилио и число монет,
 * которые отдала лиса Алиса.
 */

class TaskSolution {
    static int firstN = 5;
    static int secondN = 3;
    static int noCoins = 0;

    static HashMap<Integer, Integer> invoke(int sum) {
        int fiveCoinsAmount = sum / 5 * 5;
        int threeCoinsAmount = sum - fiveCoinsAmount;

        while(fiveCoinsAmount % 5 !=0 || threeCoinsAmount % 3 !=0){
            fiveCoinsAmount-=5;
            threeCoinsAmount+=5;
        }

        HashMap<Integer, Integer> result = new HashMap<>();
        result.put(firstN,fiveCoinsAmount / 5);
        result.put(secondN, threeCoinsAmount / 3);
        return result;
    }
}