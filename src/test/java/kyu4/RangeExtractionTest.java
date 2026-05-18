package kyu4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RangeExtractionTest {
    @Test
    public void test_BasicTests() {
        assertThat(RangeExtraction.rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})).isEqualTo("-6,-3-1,3-5,7-11,14,15,17-20");
        assertThat(RangeExtraction.rangeExtraction(new int[]{-3, -2, -1, 2, 10, 15, 16, 18, 19, 20})).isEqualTo("-3--1,2,10,15,16,18-20");

        assertThat(RangeExtraction.solution1(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})).isEqualTo("-6,-3-1,3-5,7-11,14,15,17-20");
        assertThat(RangeExtraction.solution1(new int[]{-3, -2, -1, 2, 10, 15, 16, 18, 19, 20})).isEqualTo("-3--1,2,10,15,16,18-20");
    }
}