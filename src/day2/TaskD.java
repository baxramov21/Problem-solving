package day2;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        char[] letters = {
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


        for (int i = 0; i < length; i++) {
            if (i >= 25) {
                i = 0;
                length = length - 25;
            }
            System.out.print(letters[i]);
        }
    }
}
