package acmp.string_tasks;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(UpperCaseSolution.invoke(scanner.next().charAt(0)));
    }
}

/*
 *Задан символ. Если он является строчной буквой английского алфавита, то его нужно перевести в верхний регистр.
 * В противном случае символ следует оставить без изменений.
 * Входные данные
 * Входной файл INPUT.TXT содержит единственный символ (ASCII-код от 33 до 127).
 * Выходные данные
 * В выходной файл OUTPUT.TXT выведите один символ – исходный символ в верхнем регистре.
 */

class UpperCaseSolution {
    static char invoke(char character) {
        if (Character.isUpperCase(character))
            return Character.toLowerCase(character);
        else
            return Character.toUpperCase(character);
    }
}
