package kyu5;

public class GreedIsGood {
    public static int greedy(int[] dice) {
        int score = 0;
        int[] table = {0,0,0,0,0,0,0};
        for (int num : dice) {
            table[num]++;
        }

        for (int i = 1; i < table.length; i++) {
            while (true) {
                if (table[i] / 3 > 0) {
                    if (i == 1) {
                        score += 1000;
                    } else {
                        score += i * 100;
                    }
                    table[i] -= 3;
                } else {
                    break;
                }
            }
        }

        score += table[1] * 100;
        score += table[5] * 10 * 5;
        return score;
    }

    public static int solution1(int[] dice) {
        int[] n = new int[7];
        for (int d : dice) {
            n[d]++;
        }
        return n[1] / 3 * 1000 + n[1] % 3 * 100 + n[2] / 3 * 200 + n[3] / 3 * 300 + n[4] / 3 * 400 + n[5] / 3 * 500 + n[5] % 3 * 50 + n[6] / 3 * 600;
    }
}
