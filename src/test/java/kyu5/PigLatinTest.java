package kyu5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PigLatinTest {
    @Test
    public void FixedTests() {
        assertThat(PigLatin.pigIt("Pig latin is cool")).isEqualTo("igPay atinlay siay oolcay");
        assertThat(PigLatin.pigIt("This is my string")).isEqualTo("hisTay siay ymay tringsay");

        assertThat(PigLatin.solution1("Pig latin is cool")).isEqualTo("igPay atinlay siay oolcay");
        assertThat(PigLatin.solution1("This is my string")).isEqualTo("hisTay siay ymay tringsay");

        assertThat(PigLatin.solution2("Pig latin is cool")).isEqualTo("igPay atinlay siay oolcay");
        assertThat(PigLatin.solution2("This is my string")).isEqualTo("hisTay siay ymay tringsay");
    }
}