package robo_contest;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberInStr = scanner.next();
        int number = 0;

        for (char ch :
                numberInStr.toCharArray()) {
            if (Character.getNumericValue(ch) == 1) {
                number++;
            }
        }

        if (number % 2 != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
