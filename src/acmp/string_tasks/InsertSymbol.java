package acmp.string_tasks;

import java.util.Scanner;

public class InsertSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(InsertSymbolSolution.invoke(scanner.next()));
    }
}

class InsertSymbolSolution {
    static String invoke(String text) {
        String result = "";
        char[] originalArray = text.toCharArray();
        StringBuilder builder = new StringBuilder(text);
        for (int i = 0; i < originalArray.length; i++) {
             if (i != 0 && (originalArray[i] != '#' && originalArray[i - 1] != '#')) {
                result = builder.insert(i, "#").toString();
                originalArray = result.toCharArray();
            } else if (originalArray.length == 1) {
                 return text;
             }
        }
        return result;
    }
}
