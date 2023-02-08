package robo_contest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = TaskC.solution(scanner.nextInt());
        System.out.println(result);
    }
}
