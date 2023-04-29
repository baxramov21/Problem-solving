package olimp;

import java.math.BigInteger;
import java.util.Scanner;

public class Level {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long m = scanner.nextLong();
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= m; i++) {
            result=result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result.mod(BigInteger.valueOf(10)));
    }
}
