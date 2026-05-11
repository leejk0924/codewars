package kyu6;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Diamond {
    public static String print(int n) {
        if (n % 2 == 1) {
            var sb = new StringBuilder();
            for (int i = 1; i <= n / 2; i++) {
                for (int j = 1; j <= n / 2 - i + 1; j++) {
                    sb.append(" ");
                }
                for (int j = 0; j < 2 * i - 1; j++) {
                    sb.append("*");
                }
                sb.append("\n");
            }

            for (int i = 0; i < n; i++) {
                sb.append("*");
            }
            sb.append("\n");

            for (int i = n/2; i >0; i--) {
                for (int j = 1; j <= n/2 -i +1; j++) {
                    sb.append(" ");
                }
                for (int j = 0; j < 2 * i - 1; j++) {
                    sb.append("*");
                }
                sb.append("\n");
            }

            return sb.toString();
        }
        return null;
    }

    public static String solution1(int n) {
        if (n < 0 || n % 2 == 0) {
            return null;
        }
        return IntStream.range(0, n*2)
                .filter(i -> i%2 >0)
                .map(i -> i>n ? n- (i-n) : i)
                .mapToObj(i-> " ".repeat((n-i) / 2) + "*".repeat(i) + "\n")
                .collect(Collectors.joining());
    }
}
