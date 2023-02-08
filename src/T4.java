public class T4 {
    static int solution(int amount, int price1, int price2) {
        if (price1 >= 1 && price1 <= 100
                && price2 >= 1 && price2 <= 100
                && amount >= 1 && amount <= 100) {
            int price1Amount = amount % 2;
            int price2Amount = (amount - price1Amount) / 2;
            return ((price1Amount * price1) + price2Amount * price2);
        } else {
            return 0;
        }
    }
}
