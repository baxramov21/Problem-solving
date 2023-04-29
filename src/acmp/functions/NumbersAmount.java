package acmp.functions;

import java.util.Scanner;

public class NumbersAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = 3;
        int result = 0;
        String text = scanner.nextLine();
        char[] array = text.toCharArray();
        for (char ch :
                array) {
            if (Character.isDigit(ch)) {
                result++;
            }
        }
        System.out.println(result);
    }
}
