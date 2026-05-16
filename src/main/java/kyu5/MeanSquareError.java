package kyu5;

import java.util.stream.IntStream;

public class MeanSquareError {
    public static double solution(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            temp[i] = absSquare(arr1[i], arr2[i]);
        }
        return average(temp);
    }

    public static int absSquare(int input1, int input2) {
        int temp = Math.abs(input1 - input2);
        return square(temp);
    }

    public static int square(int input) {
        return (int)Math.pow(input, 2);
    }

    public static double average(int[] input) {
        int temp = 0;
        for (int num : input) {
            temp += num;
        }
        return (double)temp / input.length;
    }

    public static double solution1(int[] arr1, int[] arr2) {
        return IntStream.range(0, arr1.length)
                .map(index -> arr1[index] - arr2[index])
                .map(diff -> diff * diff)
                .average().orElse(0);
    }
}
