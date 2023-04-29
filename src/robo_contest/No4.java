package robo_contest;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = 0;

        if ((n + 1) % 4 != 0) {
           result = -1;
        } else {
            result = Math.round(((0.5)*(Math.sqrt(2*n+1)-1))/2);
        }
        System.out.println(result);
    }
}
