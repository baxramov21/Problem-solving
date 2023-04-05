package acmp.string_tasks;

import java.util.Scanner;

public class DecipherLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(LettersTaskSolution.invoke(scanner.next()));
    }
}

class LettersTaskSolution {
    static String invoke(String text) {
        char[] array = {
                'a',
                'b',
                'c',
                'd',
                'e',
                'f',
                'g',
                'h',
                'i',
                'j',
                'k',
                'l',
                'm',
                'n',
                'o',
                'p',
                'q',
                'r',
                's',
                't',
                'u',
                'v',
                'w',
                'x',
                'y',
                'z'

        };

        StringBuilder result = new StringBuilder();
        for (char ch :
                text.toCharArray()) {
            int index = 0;
            String value = new String(array);
            if (ch == 'z')
                ch = 'a';
            else {
                index = value.indexOf(ch);
                ch = value.charAt(index + 1);
            }
            result.append(ch);
        }
        return result.toString();
    }
}
