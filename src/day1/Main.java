package day1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        t5Check();
    }

    static void t1Check() {
        ArrayList<Integer> inputs = input();
        int firstSide = inputs.get(0);
        int secondSide = inputs.get(1);
        int result = T1.solution(firstSide, secondSide);
        System.out.println("Tortburchak perimetri = " + result);
    }

    static void t2Check() {
        ArrayList<Integer> inputs = input();
        int firstSide = inputs.get(0);
        int secondSide = inputs.get(1);
        int result = T2.solution(firstSide, secondSide);
        System.out.println(result);
    }

    static void t3Check() {
        System.out.println("Sonni kiriting");
        int number = singleInput();
        System.out.println(T3.solution(number));
    }

    static void t4Check() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shu ketma ketlikda kiriting: " +
                "1- Shokolad soni, 2 - 1 ta Shokolad narxi, 3 - 2 talik shokolad narxi");
        System.out.println(T4.solution(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }

    static void t5Check() {
        System.out.println("Vaqtni kiriting: ");
        String time = new Scanner(System.in).next();

        System.out.println("Tayoqchalar: " + T5.solution(time));
    }

    static void t6Check() {
        int input = singleInput();
        System.out.println(T6.solution(input));
    }

    static int singleInput() {
        Scanner reader = new Scanner(System.in);
        return reader.nextInt();
    }

    static ArrayList<Integer> input() {
        ArrayList<Integer> result = new ArrayList<>();

        Scanner reader = new Scanner(System.in);

        System.out.println("Birinchi tomonini kiriting: ");
        int firstSide = reader.nextInt();
        result.add(firstSide);

        System.out.println("Ikkinchi tomonini kiriting: ");
        int secondSide = reader.nextInt();
        result.add(secondSide);

        return result;
    }
}
