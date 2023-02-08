package day1;

public class T1 {

    public static int solution(int firstSide, int secondSide) {
        if (firstSide >= 1 && firstSide <= 10
                && secondSide >= 1 && secondSide <= 10) {
            return (firstSide + secondSide) * 2;
        }
        return 0;
    }
}
