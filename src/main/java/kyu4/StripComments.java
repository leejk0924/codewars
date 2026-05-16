package kyu4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        return Arrays.stream(text.split("\n", -1)).map(s -> {
            int minIndex = s.length();
            for (String comment : commentSymbols) {
                int index = s.indexOf(comment);
                if (index != -1 && index < minIndex) {
                    minIndex = index;
                }
            }
            String stripped = s.substring(0, minIndex);

            return stripped.replaceAll("\\s+$", "");
        }).collect(Collectors.joining("\n"));
    }

    public static String solution1(String text, String[] commentSymbols) {
        return text.replaceAll(" *([" + String.join("", commentSymbols) + "].*)?(\n|$)", "$2");
    }
}