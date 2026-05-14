package kyu5;

import java.util.stream.Collectors;

public class Rot13 {
    public static String rot13(String str) {
        return str.chars().mapToObj(c -> {
            if ((c >= 65 && c <= 77) || (c >= 97 && c <= 109)) return String.valueOf((char) (c + 13));
            if ((c >= 78 && c <= 90) || (c >= 110 && c <= 122)) return String.valueOf((char) (c - 13));
            return String.valueOf((char) c);
        }).collect(Collectors.joining());
    }

    public static String solution1(String str) {
        return str.chars()
                .mapToObj(c -> {
                    if (c >= 'a' && c <= 'z') return Character.toString((c + 13) > 'z' ? c - 13 : c + 13);
                    if (c >= 'A' && c <= 'Z') return Character.toString((c + 13) > 'Z' ? c - 13 : c + 13);
                    return Character.toString(c);
                })
                .collect(Collectors.joining());
    }

    public static String solution2(String str) {
        return str.chars().map(c -> 'A' <= c && c <= 'Z' ? (c - 'A' + 13) % 26 + 'A' :
                        'a' <= c && c <= 'z' ? (c - 'a' + 13) % 26 + 'a' : c)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }


    public static String solution3(String str) {
        String r = "abcdefghijklmnopqrstuvwxyzabcdefghijklmABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLM";

        return str.chars().mapToObj(c -> {
            int i = r.indexOf(c);
            return i < 0 ? Character.toString(c) : r.substring(i + 13, i + 14);
        }).collect(Collectors.joining());
    }

    public static String solution4(String str) {
        StringBuilder newStr = new StringBuilder();
        for (char c : str.toCharArray()){
            newStr.append((c >= 'a' && c <= 'z') ? (char) ((c - 'a' + 13) % 26 + 'a') : (c >= 'A' && c <= 'Z') ? (char) ((c - 'A' + 13) % 26 + 'A') : c);
        }
        return newStr.toString();
    }
}