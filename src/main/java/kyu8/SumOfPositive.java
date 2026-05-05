package kyu8;

import java.util.stream.IntStream;

public class SumOfPositive {
    public static int sum(int[] arr) {
        return IntStream.of(arr).filter(i -> i > 0).sum();
    }
}
