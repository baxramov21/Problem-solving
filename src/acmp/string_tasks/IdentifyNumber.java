package acmp.string_tasks;

import java.util.Scanner;

public class IdentifyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condition = NumberSolution.invoke(scanner.next().charAt(0));
        String value = "No";
        if (condition) {
            value = "Yes";
        }
        System.out.println(value);
    }
}

/*
 * Задан символ. Требуется определить: является ли он цифрой?
 */

class NumberSolution {
    static boolean invoke(char character) {
        return Character.isDigit(character);
    }
}
