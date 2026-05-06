package kyu6;

import java.util.HashSet;
import java.util.stream.IntStream;

public class Multiples {
    public static int solution(int number) {
        var target = new HashSet<Integer>();
        for (int i = 3; i < number; i += 3) {
            target.add(i);
        }
        for (int i = 5; i < number; i += 5) {
            target.add(i);
        }
        return target.stream().mapToInt(i -> i).sum();
    }

    public static int solution1(int number) {
        return IntStream.range(3, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
    }

    public static int solution2(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i%3 == 0 || i%5 == 0) sum += i;
        }
        return sum;
    }
}
