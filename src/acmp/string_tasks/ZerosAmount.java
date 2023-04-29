package acmp.string_tasks;

import java.util.Scanner;

public class ZerosAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ZerosAmountSolution.invoke(scanner.next()));
    }
}

class ZerosAmountSolution {
    static int invoke(String number) {
        int result = 0;
        int max = 0;
        for (char ch :
                number.toCharArray()) {
            if (ch == '0') {
                result++;
                if (result > max) {
                    max = result;
                }
            } else  {
                result = 0;
            }
        }

        return max;
    }
}
