package acmp.string_tasks;

import java.util.Scanner;

public class Rounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(RoundSolution.invoke(scanner.next()));
    }
}

class RoundSolution {
    static int invoke(String number) {
        int result = 0;
        char zero = '0';
        char six = '6';
        char eight = '8';
        char nine = '9';

        int countOfZero = countChars(number, zero);
        int countOfSix = countChars(number,six);
        int countOfNine = countChars(number,nine);
        int countOfEight = countChars(number,eight) * 2;  // Because 8 has two rounds
        result =  countOfZero + countOfSix + countOfEight + countOfNine;
        return result;
    }

    static int countChars(String wholeText, char character) {
        int count = 0;

        for (int i = 0; i < wholeText.length(); i++) {
            if (wholeText.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}
