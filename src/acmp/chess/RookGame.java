package acmp.chess;

import java.util.Scanner;

public class RookGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player = RookGameSolution.taskSolution(scanner.nextInt(), scanner.nextInt());
        System.out.println(player);
    }
}

class RookGameSolution {
    static int taskSolution(int X, int Y) {
        if (X == 1 && Y == 1) {
            return 0;
        }
        if (X == 1 || Y == 1 || (X + Y) % 2 == 1 || X == Y) {
            return 1;
        } else {
            return 2;
        }
    }
}
