package robo_contest;

/*
Description
Game
Ali likes numbers ending in 0.
Ali wants to convert the given number N to the nearest number that Ali likes and is not less than N number.
Ali is having a little trouble doing it, so help him.
 */

public class TaskC {
    static int solution(int number) {
        if (number > 0) {
            String numberToStr = String.valueOf(number);
            char[] numberInCharArray = numberToStr.toCharArray();
            int lastNumber = 0;
            for (int i = 0; i < numberInCharArray.length; i++) {
                if (i == numberInCharArray.length - 1) {
                    if (Character.getNumericValue(numberInCharArray[i]) > 0) {
                        lastNumber = Character.getNumericValue(numberInCharArray[i]);
                    } else {
                        return number;
                    }
                }
            }
            int result = 10 - lastNumber;
            return number + result;
        }  else {
            return 0;
        }
    }
}
