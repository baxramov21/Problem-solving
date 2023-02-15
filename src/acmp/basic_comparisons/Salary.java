package acmp.basic_comparisons;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(SalaryFix.salaryContrast(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }
}

/**
 * Требуется написать программу, определяющую, является ли четырехзначное натуральное
 * число N палиндромом, т.е. числом, которое одинаково читается слева направо и справа налево.
 */

class SalaryFix {
    static int salaryContrast(int worker1, int worker2, int worker3) {
         int greater = Math.max(Math.max(worker1, worker2), worker3);
         int min = Math.min(Math.min(worker1, worker2),worker3);
         return greater - min;
    }
}
