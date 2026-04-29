package kyu8;

import org.junit.jupiter.api.Test;

import java.util.function.BiPredicate;

import static org.assertj.core.api.Assertions.assertThat;

class Kata1Test {

    @Test
    void basBcTests() {
        BiPredicate<int[], Integer> betterThanAverage = Kata1::betterThanAverage;

        assertThat(betterThanAverage.test(new int[]{2, 3}, 5)).isTrue();
        assertThat(betterThanAverage.test(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75)).isTrue();
        assertThat(betterThanAverage.test(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69)).isTrue();
        assertThat(betterThanAverage.test(new int[]{100, 90}, 11)).isFalse();
        assertThat(betterThanAverage.test(new int[]{50,50,50}, 50)).isFalse();
    }
}