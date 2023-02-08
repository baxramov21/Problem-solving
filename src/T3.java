class T3 {
    static int solution(int input) {
        if (input > 6) {
            int index = input % 6;
            if (index == 0) {
                return 1;
            }
            return index;
        } else {
            return input;
        }
    }
}