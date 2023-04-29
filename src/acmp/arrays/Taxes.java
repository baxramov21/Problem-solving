package acmp.arrays;

import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int companyAmount = scanner.nextInt();
        int[] companyProfits = new int[companyAmount];
        int[] taxPercentages = new int[companyAmount];

        for (int i = 0; i < companyAmount; i++) {
            companyProfits[i] = scanner.nextInt();
        }

        for (int i = 0; i < companyAmount; i++) {
            taxPercentages[i] = scanner.nextInt();
        }

        double max = 0;
        int index = 0;

        for (int i = 0; i < companyAmount; i++) {
            double value = (companyProfits[i] * 1.0 / 100) * 1.0 * taxPercentages[i];
            if (value > max) {
                max = value;
                index = i + 1;
            }
        }

        if (index != 0)
            System.out.println(index);
        else
            System.out.println(1);
    }
}
