package acmp.basic_comparisons;

import java.util.Locale;
import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rawResult = new String[3];
        for (int i = 0; i < 3; i++) {
            rawResult[i] = scanner.next();
        }

        String[] mainResult = TrafficLightSolution.fixTrafficLight(rawResult);
        for (String color : mainResult) {
            if (color.equals("error")) {
                System.out.println(color);
                break;
            }
            System.out.println(color);
        }
    }
}

class TrafficLightSolution {
    static String[] fixTrafficLight(String[] colors) {

        String[] result = new String[3];
        result[0] = "error";

        String black = "black";
        String yellow = "yellow";
        String red = "red";
        String green = "green";

        String YELLOW = yellow.toUpperCase(Locale.ROOT);
        String RED = red.toUpperCase(Locale.ROOT);
        String GREEN = green.toUpperCase(Locale.ROOT);

        String color1 = colors[0];
        String color2 = colors[1];
        String color3 = colors[2];

        if (color1.equals(black) && color2.equals(black) && color3.equals(green)) {
            color3 = GREEN;
        } else if (color1.equals(black) && color2.equals(black) && color3.equals(GREEN)) {
            color2 = yellow;
            color3 = black;
        } else if (color1.equals(black) && color2.equals(yellow) && color3.equals(black)) {
            color1 = red;
            color2 = black;
        } else if (color1.equals(red) && color2.equals(black) && color3.equals(black)) {
            color2 = yellow;
        } else if (color1.equals(red) && color2.equals(yellow) && color3.equals(black)) {
            color2 = black;
            color1 = black;
            color3 = green;
        } else if (color1.equals(black) && color2.equals(YELLOW) && color3.equals(black)) {
            color3 = black;
        } else {
            return result;
        }

        result[0] = color1;
        result[1] = color2;
        result[2] = color3;
        return result;
    }
}
