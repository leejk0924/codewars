package kyu7;

import java.util.Map;
import java.util.stream.Collectors;

public class Dna {
    public static String makeComplement(String dna) {
        return dna.chars()
                .mapToObj(c -> (char) c)
                .map(c -> String.valueOf(switch (c) {
                    case 'A' -> 'T';
                    case 'T' -> 'A';
                    case 'C' -> 'G';
                    case 'G' -> 'C';
                    default -> throw new IllegalStateException("Unexpected value: " + c);
                }))
                .collect(Collectors.joining());
    }

    private static Map<Character, String> DNAMap = Map.of(
            'A', "T",
            'T', "A",
            'C', "G",
            'G', "C"
    );

    public static String solution1(String dna) {
        return dna.chars()
                .mapToObj(c -> DNAMap.get(c))
                .collect(Collectors.joining());
    }
}
