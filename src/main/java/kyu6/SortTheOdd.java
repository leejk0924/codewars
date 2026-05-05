package kyu6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.IntStream;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        List<Integer> odd = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd.add(array[i]);
            }
        }
        odd.sort(Integer::compareTo);
        Queue<Integer> q = new LinkedList<>(odd);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = q.poll();
            }
        }
        return array;
    }

    public static int[] solution1(int[] array) {
        int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

        for (int j = 0, s = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
        }
        return array;
    }

    public static int[] solution2(int[] array) {
        var iterator = IntStream.of(array).filter(i -> i % 2 == 1).sorted().iterator();
        return IntStream.of(array)
                .map(i -> i % 2 == 0 ? i : iterator.next())
                .toArray();
    }
}
