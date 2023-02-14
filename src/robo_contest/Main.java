package robo_contest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double p = (a + b + c) / 2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("%.3f",result);
    }
}

/*
Вам дан треугольник с разными сторонами a, b и c. Создайте калькулятор, чтобы найти сторону треугольника.
 */

class TriangleFace {
    static float findTriangleFace(double a, double b, double c) {
        double p = (a + b + c) / 2;
        float result = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }
}
