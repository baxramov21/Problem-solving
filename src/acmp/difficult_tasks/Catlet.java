package acmp.difficult_tasks;

import java.util.Scanner;

public class Catlet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = CutletsSolution.invoke(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(result);
    }
}

/**
 * На сковородке одновременно можно положить k котлет. Каждую котлету нужно с каждой стороны обжаривать m минут непрерывно.
 * За какое наименьшее время удастся поджарить с обеих сторон n котлет?
 * <p>
 * Входные данные
 * В единственной строке входного файла INPUT.TXT записано три натуральных числа: k, m, n, не превышающих 30000.
 * <p>
 * Выходные данные
 * В единственную строку выходного файла OUTPUT.TXT нужно вывести единственное число – минимальное время,
 * за которое можно поджарить все котлеты.
 */

class CutletsSolution {
    static int invoke(int capacity, int timePerCutlet, int cutletsAmount) {
//        int result = 0;
//        if (capacity >= cutletsAmount) {
//            result = timePerCutlet * 2;
//        } else {
//            int cutletsLeft = cutletsAmount - capacity;
//            int firstFryTime = cutletsAmount * timePerCutlet;
//            int leftCutletsTime = cutletsLeft * timePerCutlet;
//            result = firstFryTime + leftCutletsTime;
//        }

        return Math.max(2, (cutletsAmount * 2 + capacity-1) / capacity) * timePerCutlet;
    }
}
