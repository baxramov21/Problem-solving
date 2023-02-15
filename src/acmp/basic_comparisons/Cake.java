package acmp.basic_comparisons;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(CakeSolution.divideCake(scanner.nextInt()));
    }
}

/**
 * На свой день рождения Петя купил красивый и вкусный торт, который имел идеально круглую форму.
 * Петя не знал, сколько гостей придет на его день рождения, поэтому вынужден был разработать алгоритм,
 * согласно которому он сможет быстро разрезать торт на N равных частей. Следует учесть, что разрезы торта
 * можно производить как по радиусу, так и по диаметру.
 */

class CakeSolution {
    static int divideCake(int guestsNumber) {
        if (guestsNumber != 1) {
            if (guestsNumber % 2 == 0) {
                return guestsNumber / 2;
            } else return guestsNumber;
        }
        return 0;
    }
}
