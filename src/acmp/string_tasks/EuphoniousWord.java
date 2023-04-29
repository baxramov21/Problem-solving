package acmp.string_tasks;

import java.util.Scanner;

public class EuphoniousWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordSolution.invoke(scanner.next());
    }
}

class WordSolution {
    static void invoke(String text) {
        int consonant = 0;
        int vowel = 0;
        int count = 0;

        char[] array = text.toCharArray();


        for (char element :
                array) {
            if (isVowel(element)) {
                vowel++;
                consonant = 0;
            } else {
                consonant++;
                vowel = 0;
            }

            if (vowel == 3) {
                vowel = 1;
                count++;
            }

            if (consonant == 3) {
                consonant = 1;
                count++;
            }

        }

        System.out.println(count);
    }

    static boolean isVowel(char letter) {
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
