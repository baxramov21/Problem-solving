package acmp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean value = HappyTicket.solution(scanner.nextInt());
        if (value) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
    /*
  Вы пользуетесь общественным транспортом? Вероятно, вы расплачивались за проезд и получали билет с номером.
  Счастливым билетом называют такой билет с шестизначным номером, где сумма первых трех цифр равна сумме последних трех.
  Т.е. билет с номером 385916 – счастливый, т.к. 3+8+5=9+1+6.
  Вам требуется написать программу, которая проверяет счастливость билета.
  Test: 385916 -> YES, 123456 -> NO
     */

class HappyTicket {
    static boolean solution(int number) {
        String numToStr = String.valueOf(number);
        char[] numbersToChars = numToStr.toCharArray();
        boolean result = false;
        if (numbersToChars.length == 6) {
            int firstTrio = 0;
            int secondTrio = 0;
            for (int i = 0; i < numbersToChars.length; i++) {
                if (i <= 2) {
                    firstTrio += Character.getNumericValue(numbersToChars[i]);
                }

                if (i > 2) {
                    secondTrio += Character.getNumericValue(numbersToChars[i]);
                }
            }
            if (firstTrio == secondTrio) {
                result = true;
            }
        } else {
            return false;
        }
        return result;
    }
}


