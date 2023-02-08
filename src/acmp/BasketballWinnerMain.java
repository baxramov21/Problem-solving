package acmp;

import java.util.Scanner;

public class BasketballWinnerMain {
    public static void main(String[] args) {
        Scanner scannerFirstTerm = new Scanner(System.in);
        BasketballMatchWinner.solution(scannerFirstTerm);
    }
}

class BasketballMatchWinner {
    static void solution(Scanner scannerFirstTerm) {
        int firstTeamPoints = 0;
        int secondTeamPoints = 0;
        for (int i = 0; i < 4; i++) {
            firstTeamPoints += scannerFirstTerm.nextInt();
            secondTeamPoints += scannerFirstTerm.nextInt();
        }
        if (firstTeamPoints > secondTeamPoints) {
            System.out.println("1");
        } else if (firstTeamPoints == secondTeamPoints) {
            System.out.println("DRAW");
        } else {
            System.out.println("2");
        }
    }
}
