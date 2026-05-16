package kyu5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MeanSquareErrorTest {
    @Test @DisplayName("Should return 9.0 for arr1 = {1, 2, 3}, arr2 = {4, 5, 6}")
    public void test1() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};
        assertThat(MeanSquareError.solution(a1, a2)).isEqualTo(9.0);
        assertThat(MeanSquareError.solution1(a1, a2)).isEqualTo(9.0);
    }

    @Test @DisplayName("Should return 6.5 for arr1 = {10, 20, 10, 2}, arr2 = {10, 25, 5, -2}")
    public void test2() {
        int[] b1 = {10, 20, 10, 2};
        int[] b2 = {10, 25, 5, -2};
        assertThat(MeanSquareError.solution(b1, b2)).isEqualTo(16.5);
        assertThat(MeanSquareError.solution1(b1, b2)).isEqualTo(16.5);
    }

    @Test @DisplayName("Should return 1.0 for arr1 = {0, -1}, arr2 = {-1, 0}")
    public void test3() {
        int[] c1 = {0, -1};
        int[] c2 = {-1, 0};

        assertThat(MeanSquareError.solution(c1, c2)).isEqualTo(1.0);
        assertThat(MeanSquareError.solution1(c1, c2)).isEqualTo(1.0);
    }

    @Test @DisplayName("Should return 0.0 for arr1 = {10, 10}, arr2 = {10, 10}")
    public void test4() {
        int[] d1 = {10, 10};
        int[] d2 = {10, 10};
        assertThat(MeanSquareError.solution(d1, d2)).isEqualTo(0.0);
        assertThat(MeanSquareError.solution1(d1, d2)).isEqualTo(0.0);
    }
}