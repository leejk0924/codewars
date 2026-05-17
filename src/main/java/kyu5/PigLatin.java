package kyu5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {
    public static String pigIt(String str) {
        return Arrays.stream(str.split(" ", -1)).map(s -> {
            if (Character.isLetter(s.charAt(0))) {
                return s.substring(1) + s.charAt(0) + "ay";
            }
            return s;
        }).collect(Collectors.joining(" "));
    }

    public static String solution1(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }

    public static String solution2(String str) {
        return Arrays.stream(str.trim().split(" "))
                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
                .collect(Collectors.joining(" "));
    }
}
