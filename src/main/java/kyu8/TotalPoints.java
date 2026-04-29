package kyu8;

import java.util.Arrays;

public class TotalPoints {
    public static int points(String[] games) {
        return Arrays.stream(games).mapToInt(game -> {
            String[] split = game.split(":");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[1]);

            if (x > y) {
                return 3;
            } else if (x == y) {
                return 1;
            } else {
                return 0;
            }
        }).sum();
    }

    public static int solution_1(String[] games) {
        return Arrays.stream(games)
                .mapToInt(score -> score.charAt(0) - score.charAt(2))
                .map(match -> match > 0 ? 3 : match == 0 ? 1 : 0)
                .sum();
    }
}
