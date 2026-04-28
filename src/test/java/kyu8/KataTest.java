package kyu8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KataTest {

    @Test
    void Test1() {
        assertThat("dlrow").isEqualTo(Kata.solution("world"));
    }

    @Test
    void Test2() {
        assertThat("drow").isEqualTo(Kata.solution("word"));
    }
}