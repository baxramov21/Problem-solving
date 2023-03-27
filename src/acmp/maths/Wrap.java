package acmp.maths;

import java.util.Scanner;

public class Wrap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean areTheyEqual = WrapSolution
                .invoke(
                        scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
                        scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
                        scanner.nextInt(), scanner.nextInt()
                );
        String value = "NO";
        if (areTheyEqual) {
            value = "YES";
        }
        System.out.println(value);
    }
}


/**
 * В одну транспортную компанию поступил заказ на перевозку двух ящиков из одного города в другой.
 * Для перевозки ящики решено было упаковать в специальный контейнер.
 * <p>
 * Ящики и контейнер имеют вид прямоугольных параллелепипедов. Длина, ширина и высота первого ящика – l1, w1 и h1,
 * соответствующие размеры второго ящика – l2, w2 и h2. Контейнер имеет длину, ширину и высоту lc, wc и hc.
 * <p>
 * Поскольку ящики содержат хрупкое оборудование, после упаковки в контейнер каждый из них должен остаться в строго
 * вертикальном положении. Таким образом, ящики можно разместить рядом или один на другом. Для надежного закрепления в
 * контейнере стороны ящиков должны быть параллельны его сторонам. Иначе говоря, если исходно ящики были расположены так,
 * что все их стороны параллельны соответствующим сторонам контейнера, то каждый из них разрешается перемещать и
 * поворачивать относительно вертикальной оси на угол, кратный 90 градусам.
 * <p>
 * Разумеется, после упаковки оба ящика должны полностью находиться внутри контейнера и не должны пересекаться.
 * <p>
 * Выясните, можно ли поместить ящики в контейнер, с выполнением указанных условий.
 * <p>
 * Входные данные
 * Первая строка входного файла INPUT.TXT содержит l1, w1 и h1, вторая – l2, w2 и h2, третья – lc, wc и hc.
 * Все размеры – целые положительные числа, не превышающие 1000. Числа в строках разделены пробелами.
 * <p>
 * Выходные данные
 * В выходной файл OUTPUT.TXT выведите YES, если ящики можно упаковать в контейнер и NO в противном случае.
 */

class WrapSolution {
    static boolean invoke(int l1, int w1, int h1, int l2, int w2, int h2, int lc, int wc, int hc) {
//        if (h1 + h2 == hc) {
//            return true;
//        }
//
//        if ((l1 <= lc && w1 <= wc && h1 <= hc) && (l2 <= lc && w2 <= wc && h2 <= hc)) {
//            return true;
//        }

//        if (h1 <= hc && h2 <= hc) {
//            if ((Math.max(l1, l2) <= lc && w1 + w2 <= wc ||
//                    Math.max(l1, w1) <= lc && w2 + l2 <= wc ||
//                    Math.max(l2, w1) <= lc && w1 + l2 <= wc ||
//                    Math.max(l1, w2) <= lc && w2 + l1 <= wc ||
//                    Math.max(l2, w2) <= lc && w1 + l1 <= wc ||
//                    Math.max(w1,w2)<=lc && l1+l2<=wc) ||
//                    (Math.max(l1, l2) <= wc && w1 + w2 <= lc ||
//                    Math.max(l1, w1) <= wc && w2 + l2 <= lc ||
//                    Math.max(l2, w1) <= wc && w1 + l2 <= lc ||
//                    Math.max(l1, w2) <= wc && w2 + l1 <= lc ||
//                    Math.max(l2, w2) <= wc && w1 + l1 <= lc) ||
//                    Math.max(w1,w2)<=wc && l1+l2<=lc)    {
//                return true;
//            }
//        }
//        return false;
//    }

        if (h1 + h2 <= hc) {
            if (((l1 <= lc && w1 <= wc) || (l1 <= wc && w1 <= lc)) && ((l2 <= lc && w2 <= wc) || (l2 <= wc && w2 <= lc))) {
                return true;
            }
        } else if ((Math.max(l1, l2) <= lc && w1 + w2 <= wc) ||
                (Math.max(l1, w2) <= lc && w1 + l2 <= wc) ||
                (Math.max(w1, l2) <= lc && l1 + w2 <= wc) ||
                (Math.max(w1, w2) <= lc && l1 + l2 <= wc) ||
                (Math.max(l1, l2) <= wc && w1 + w2 <= lc) ||
                (Math.max(l1, w2) <= wc && w1 + l2 <= lc) ||
                (Math.max(w1, l2) <= wc && l1 + w2 <= lc) ||
                (Math.max(w1, w2) <= wc && l1 + l2 <= lc)) {
            return true;
        } else if (Math.max(h1, h2) > hc) {
            return false;
        }
        return false;
    }
}
