package kyu8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DoubleCharTest {
    @Test
    void sampleTest() {
        assertThat(DoubleChar.doubleChar("String")).isEqualTo("SSttrriinngg");
        assertThat(DoubleChar.doubleChar("Hello World")).isEqualTo("HHeelllloo  WWoorrlldd");
        assertThat(DoubleChar.doubleChar("1234!_ ")).isEqualTo("11223344!!__  ");
    }
}