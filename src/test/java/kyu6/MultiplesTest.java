package kyu6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MultiplesTest {

    @Test
    public void test10() {
        assertThat(Multiples.solution(10)).isEqualTo(23);
        assertThat(Multiples.solution1(10)).isEqualTo(23);
        assertThat(Multiples.solution2(10)).isEqualTo(23);
    }

    @Test
    public void test20() {
        assertThat(Multiples.solution(20)).isEqualTo(78);
        assertThat(Multiples.solution1(20)).isEqualTo(78);
        assertThat(Multiples.solution2(20)).isEqualTo(78);
    }

    @Test
    public void test200() {
        assertThat(Multiples.solution(200)).isEqualTo(9168);
        assertThat(Multiples.solution1(200)).isEqualTo(9168);
        assertThat(Multiples.solution2(200)).isEqualTo(9168);
    }

    @Test
    public void test0() {
        assertThat(Multiples.solution(0)).isEqualTo(0);
        assertThat(Multiples.solution1(0)).isEqualTo(0);
        assertThat(Multiples.solution2(0)).isEqualTo(0);
    }

}