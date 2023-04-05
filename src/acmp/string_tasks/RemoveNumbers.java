package acmp.string_tasks;

import java.util.Scanner;

public class RemoveNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        for (char ch : value.toCharArray()) {
            String i = String.valueOf(ch);
            if ( i.equals("4") || i.equals("7")) {
                System.out.print("");
            } else {
                System.out.print(ch);
            }
        }
    }
}
