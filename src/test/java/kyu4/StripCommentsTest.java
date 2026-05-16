package kyu4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StripCommentsTest {
    @Test
    void stripComments() {
        assertThat(StripComments.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"})).isEqualTo("apples, pears\ngrapes\nbananas");
        assertThat(StripComments.stripComments("a #b\nc\nd $e f g", new String[]{"#", "$"})).isEqualTo("a\nc\nd");

        assertThat(StripComments.solution1("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"})).isEqualTo("apples, pears\ngrapes\nbananas");
        assertThat(StripComments.solution1("a #b\nc\nd $e f g", new String[]{"#", "$"})).isEqualTo("a\nc\nd");
    }
}