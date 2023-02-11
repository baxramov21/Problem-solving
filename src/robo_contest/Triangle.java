package robo_contest;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(TriangleFace.findTriangleFace(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
    }
}

class TriangleFace {
    static float findTriangleFace(double a, double b, double c) {
        double p = (a + b + c) / 2;
        float result = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }
}
