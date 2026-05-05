package kyu8;

import java.util.stream.Collectors;

public class DoubleChar {
    public static String doubleChar(String s) {
        StringBuilder sb = new StringBuilder();

        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            sb.append(c).append(c);
        }
        return sb.toString();
    }

    public static String solution1(String s) {
        return s.replaceAll(".", "$0$0");
    }

    public static String solution2(String s) {
        return s.chars()
                .mapToObj(i -> String.valueOf((char) i).repeat(2))
                .collect(Collectors.joining());
    }
}
