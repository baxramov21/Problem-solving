package acmp;

import java.util.Scanner;

public class Task202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersLength = scanner.nextInt();
        int[] numbers = new int[numbersLength];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int fixingAmount = scanner.nextInt();
        for (int i = 0; i < fixingAmount; i++) {
            int firstIndex = scanner.nextInt();
            int secondIndex = scanner.nextInt();
            int divisor = scanner.nextInt();
            System.out.println(Task202Solution.p202Fix(numbers, divisor, firstIndex, secondIndex));
        }
    }
}

/*/
Дан массив одномерных целых чисел. Количество элементов массива равно n. Напишите программу,
 отвечающую на следующий вопрос: Два элемента массива
  Учитывая индексы L и R и целое число p. Ваша задача — создать массив [L..R]
  нахождение остатка при делении произведения элементов в индексах на p.
  Таких запросов может быть много, индексы массива нумеруются, начиная с единицы.

  5
  4 5 6 3 9
  1 2
  900
 */

class Task202Solution {
    static long p202Fix(int numbers[], int divisor, int index1, int index2) {
        long multiplier = 1;
        for (int i = index1-1; i < index2; i++) {
            multiplier*=numbers[i];
            multiplier%=divisor;
        }
        return multiplier % divisor;
    }
}