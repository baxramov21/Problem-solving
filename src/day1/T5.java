package day1;

public class T5 {
    static int solution(String time) {
        char[] chars = time.toCharArray();

        char firstHour = chars[0];
        char secondHour = chars[1];

        char firstMin = chars[3];
        char secondMin = chars[4];

        int first = checkTags(Character.getNumericValue(firstHour));
        int second = checkTags(Character.getNumericValue(secondHour));
        int third = checkTags(Character.getNumericValue(firstMin));
        int fourth = checkTags(Character.getNumericValue(secondMin));

        int result = first + second + third + fourth;
        return result;
    }

    private static int checkTags(int number) {
        int amount = 0;
        switch (number) {
            case 0:
            case 6:
            case 9:
                amount = 6;
                break;
            case 1:
                amount = 2;
                break;
            case 2:
            case 3:
            case 5:
                amount = 5;
                break;

            case 4:
                amount = 4;
                break;

            case 7:
                amount = 3;
                break;

            case 8:
                amount = 7;
                break;
        }
        return amount;
    }
}
