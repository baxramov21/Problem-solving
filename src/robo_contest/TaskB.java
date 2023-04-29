package robo_contest;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("The next number for the number " +  a + " is " +  (a + 1) + ".");
        System.out.println("The previous number for the number " +  a + " is " +  (a - 1) + ".");
    }
}
