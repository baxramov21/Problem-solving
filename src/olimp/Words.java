package olimp;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] array = text.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " " + array[i].length());
        }
    }
}
