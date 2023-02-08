package day1;

public class T2 {

    static int solution(int first, int second) {
        if (first >= 1 && first <= 10
                && second >= 1 && second <= 100) {
            if (first > second) {
                return first - second;
            } else if (second > first) {
                return second - first;
            } else {
                return 0;
            }
        } else {
            throw new IllegalArgumentException("Notogri parametrlar kiritilgan");
        }
    }
}
