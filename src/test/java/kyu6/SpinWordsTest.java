package kyu6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SpinWordsTest {
    @Test
    public void test() {
        SpinWords s = new SpinWords();
        assertThat(s.spinWords("Welcome")).isEqualTo("emocleW");
        assertThat(s.spinWords("Hey fellow warriors")).isEqualTo("Hey wollef sroirraw");

        assertThat(s.solution1("Welcome")).isEqualTo("emocleW");
        assertThat(s.solution1("Hey fellow warriors")).isEqualTo("Hey wollef sroirraw");

        assertThat(s.solution2("Welcome")).isEqualTo("emocleW");
        assertThat(s.solution2("Hey fellow warriors")).isEqualTo("Hey wollef sroirraw");
    }
}