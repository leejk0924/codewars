package kyu6;

import java.util.stream.IntStream;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }

    public static String solution(int[] numbers) {
        Object[] array = IntStream.of(numbers).boxed().toArray();
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", array);
    }

    public static String solution1(int[] numbers) {
        String phoneNumber = new String("(xxx) xxx-xxxx");
        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", String.valueOf(i));
        }
        return phoneNumber;
    }
}
