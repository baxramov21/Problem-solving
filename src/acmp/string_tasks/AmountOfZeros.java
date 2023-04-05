package acmp.string_tasks;

import java.util.Scanner;

public class AmountOfZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(AmountOfZerosSolution.invoke(scanner.next()));
    }
}

class AmountOfZerosSolution {
    static int invoke(String number) {
        int result = 0;
        for (char ch : number.toCharArray()) {
            if (Character.getNumericValue(ch) == 0) {
                result++;
            }
        }
        return result;
    }
}
