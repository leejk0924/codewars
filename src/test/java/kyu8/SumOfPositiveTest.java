package kyu8;

import org.junit.jupiter.api.Test;

import static kyu8.SumOfPositive.sum;
import static org.assertj.core.api.Assertions.assertThat;

class SumOfPositiveTest {
    @Test
    public void testSomething() {
        assertThat(sum(new int[]{1,2,3,4,5})).isEqualTo(15);
        assertThat(sum(new int[]{1,-2,3,4,5})).isEqualTo(13);
        assertThat(sum(new int[]{})).isZero();
        assertThat(sum(new int[]{-1, -2, -3, -4, -5})).isZero();
        assertThat(sum(new int[]{-1, 2, 3, 4, -5})).isEqualTo(9);
    }
}