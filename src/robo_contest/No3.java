package robo_contest;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mealsAmount = scanner.nextInt();
        int cancelMealPosition = scanner.nextInt();
        int[] mealsPrices = new int[mealsAmount];
        for (int i = 0; i < mealsPrices.length; i++) {
            mealsPrices[i] = scanner.nextInt();
        }
        int deposit = scanner.nextInt();
        int[] mealsAmountWithoutCanceledMeal = new int[mealsAmount - 1];
        int position = 0;
        int newPosition = 0;
        for (int i = 0; i < mealsAmountWithoutCanceledMeal.length; i++) {
            if (i == cancelMealPosition) {
                position = i + 1;
                newPosition = position;
            } else {
                if (newPosition != 0) {
                    position = newPosition + 1;
                } else {
                    position = i;
                }
            }
            mealsAmountWithoutCanceledMeal[i] = mealsPrices[position];
        }

        int overAll = 0;
        for (int i :
                mealsAmountWithoutCanceledMeal) {
            overAll += i;
        }
        int paymentCost = overAll / 2;
        int cashLeft = deposit - paymentCost;
        System.out.println(cashLeft);
    }
}
