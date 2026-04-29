package kyu8;

import java.util.stream.IntStream;

// How good are you really
public class Kata1 {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return yourPoints > IntStream.of(classPoints).average().orElse(0.0);
    }

    public static boolean solution1(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int vals : classPoints) {
            sum += vals;
        }
        return yourPoints > (sum / classPoints.length);
    }
}
