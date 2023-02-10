package acmp;

import java.util.Scanner;

public class GCDMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Oranges.divideOranges(scanner.nextInt(), scanner.nextInt()));
    }

}

/*
Даны два натуральных числа A и B. Требуется найти их наибольший общий делитель (НОД).
 */

class GCD {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

/*
Требуется написать программу, определяющую наименьшее общее кратное (НОК) чисел a и b.
 */
class GCM {
    static int gcm(int a, int b) {
        return (a * b) / GCD.gcd(a, b);
    }
}

    /*
   Катя решила пригласить к себе в гости n друзей. Так как ее друзья очень любят фрукты, то в качестве угощения для них
   она купила m одинаковых апельсинов.

Она хочет разрезать каждый апельсин на одинаковое число равных долек так, чтобы их можно было распределить
между гостями (сама Катя апельсины есть не будет), и всем гостям досталось поровну долек.

Напишите программу, которая вычисляет минимальное количество долек, на которое необходимо разрезать каждый апельсин,
 чтобы были выполнены указанные выше условия.
     */

class Oranges {
    static int divideOranges(int guestAmount, int orangeAmount) {
        return guestAmount / GCD.gcd(guestAmount, orangeAmount);
    }
}