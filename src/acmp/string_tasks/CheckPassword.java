package acmp.string_tasks;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean expression = CheckPasswordSolution.invoke(scanner.next());
        String result = "No";
        if (expression) {
            result = "Yes";
        }
        System.out.println(result);
    }
}

class CheckPasswordSolution {
    static boolean invoke(String password) {
        boolean hasDigit = false;
        boolean hasUpperCaseLetter = false;
        boolean hasAnyLetter = false;

        char[] array = password.toCharArray();
        if (array.length < 12) {
            return false;
        }
        for (char ch :
                array) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            if (Character.isUpperCase(ch)) {
                hasUpperCaseLetter = true;
            }
            if (Character.isLowerCase(ch)) {
                hasAnyLetter = true;
            }
        }
        return hasDigit && hasAnyLetter && hasUpperCaseLetter;
    }
}
