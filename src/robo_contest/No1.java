package robo_contest;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        int number = scanner.nextInt();

        String result = "";

        if (number == 0) {
            if (letter.equals("q")) {
                letter = "sharq";
            } else if (letter.equals("s")) {
                letter = "shimol";
            } else if (letter.equals("j")) {
                letter = "janub";
            } else {
                letter = "g'arb";
            }
            System.out.println(letter);
        }

        if (number == 1) {
            switch (letter) {
                case "q":
                    result = "shimol";
                    break;
                case "s":
                    result = "g'arb";
                    break;
                case "g":
                    result = "janub";
                    break;
                default:
                    result = "sharq";
                    break;
            }
        } else if (number == 2) {
            switch (letter) {
                case "q":
                    result = "janub";
                    break;
                case "s":
                    result = "sharq";
                    break;
                case "g":
                    result = "shimol";
                    break;
                default:
                    result = "g'arb";
                    break;
            }
        } else if (number == 3) {
            switch (letter) {
                case "q":
                    result = "g'arb";
                    break;
                case "s":
                    result = "janub";
                    break;
                case "g":
                    result = "sharq";
                    break;
                default:
                    result = "shimol";
                    break;
            }

        }
        System.out.println(result);
    }
}
