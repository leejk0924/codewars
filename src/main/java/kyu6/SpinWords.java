package kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public String spinWords(String sentence) {
        String[] split = sentence.split(" ");
        return Arrays.stream(split).map(s -> {
            if (s.length() >= 5) {
                char[] charArray = s.toCharArray();
                char temp;
                int l = charArray.length;
                for (int i = 0; i < l / 2; i++) {
                    temp = charArray[i];
                    charArray[i] = charArray[l - i - 1];
                    charArray[l - i - 1] = temp;
                }
                return String.valueOf(charArray);
            }
            return s;
        }).collect(Collectors.joining(" "));
    }

    public String solution1(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }

    public String solution2(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(i -> i.length() >= 5 ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining());
    }
}
