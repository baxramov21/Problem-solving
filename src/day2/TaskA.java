package day2;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        char[] chars = word.toCharArray();
        boolean statement = true;

        for (char ch :
                chars) {
            if (Character.isUpperCase(ch)) {
                statement = false;
            }
        }

        if (statement) {
            System.out.println(word);
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(chars[i]);
        }

        chars[0] = Character.toUpperCase(chars[0]);

        for (char c :
                chars) {
            System.out.print(c);
        }
    }
}
