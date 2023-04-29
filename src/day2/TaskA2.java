package day2;

import java.util.*;

class TaskA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (Character.isLowerCase(s.charAt(0))) {
            int t = 0;
            for (int i = 1; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    t++;
                }
            }
            if (s.length() - 1 == t) {
                System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase());
            } else {
                System.out.println(s);
            }
        } else {
            int t = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    t++;
                }
            }
            if (t == s.length()) {
                System.out.println(s.toLowerCase());
            } else {
                System.out.println(s);
            }
        }
    }
}
