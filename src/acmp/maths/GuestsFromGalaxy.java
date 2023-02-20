package acmp.maths;

import java.util.Scanner;

public class GuestsFromGalaxy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean areTheyEqual = GalaxyGuestsSolution.invoke(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        String value = "NO";
        if (areTheyEqual) {
            value = "YES";
        }
        System.out.println(value);
    }
}

/**
 * Недавно на поле фермера Джона были обнаружены следы приземления летающих тарелок. Об этом даже
 * писала газета Mew Yorc Courier.
 *
 * Поле фермера Джона имеет форму круга радиусом r1. По сообщениям журналистов были обнаружены два следа
 * от летающих тарелок, имевшие форму кругов. Один из них имел радиус r2, второй - радиус r3. Также
 * сообщается, что они находились внутри поля фермера Джона и не пересекались, ни один из них не лежал
 * внутри другого. При этом, они, возможно, касались друг друга и/или границы поля.
 *
 * Поскольку журналисты часто склонны преувеличивать масштабы событий, необходимо написать программу,
 * которая будет проверять, могли ли иметь место события, описанные в газете.
 */

class GalaxyGuestsSolution {
    static boolean invoke(int r1, int r2, int r3) {
        return r2 + r3 <= r1;
    }
}
