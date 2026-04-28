package kyu8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// Reversed Strings
public class Kata {

    public static String solution(String str) {
        int length = str.length();
        char[] chars = str.toCharArray();
        char temp;
        for (int i = 0; i < length/2 ; i++) {
            temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }
        return new String(chars);
    }

    public static String solution_1(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static String solution_2(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    public static String solution_3(String str) {
        return Stream.of(str).map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining());
    }

    public static String solution_4(String str) {
        char[] arr = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(arr);
    }
}
