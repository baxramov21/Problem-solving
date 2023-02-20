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

/**
 * А Вы знаете, как работает светофор? Пожалуй, что каждый школьник знаком с этим устройством,
 * но не каждый точно может описать алгоритм его работы. Если сомневаетесь,
 * то спросите себя: «Сколько раз мигает зеленый сигнал светофора?».
 * <p>
 * Рассмотрим самый обычный вертикальный автомобильный светофор, состоящий из трех секций для
 * индикации (сверху вниз) красного, желтого и зеленого сигналов. Напомним его функционал.
 * Каждая секция может отражать два цвета: соответствующий ей цвет во включенном состоянии и черный
 * цвет в выключенном состоянии. Когда светофор исправен, то ему доступно 6 возможных состояний.
 * В обычном рабочем режиме мы имеем следующий алгоритм работы:
 * <p>
 * горит только зеленый сигнал;
 * зеленый сигнал мигает;
 * гаснет зеленый, загорается желтый;
 * гаснет желтый, загорается красный;
 * загорается желтый и горит вместе с красным;
 * гаснут желтый и красный и все повторяется с пункта 1.
 * Еще следует не забывать о том, что светофор может работать в режиме нерегулируемого перекрестка,
 * когда присутствует только желтый мигающий сигнал.
 * <p>
 * По текущей индикации сигналов светофора следует определить его следующее состояние, в которое он должен
 * перейти, либо определить, что светофор неисправен.
 */

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
