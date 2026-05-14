package kyu5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Rot13Test {

    @Test
    void testRot13() {
        assertThat(Rot13.rot13("test")).as("Input: \"test\"").isEqualTo("grfg");
        assertThat(Rot13.rot13("Test")).as("Input: \"Test\"").isEqualTo("Grfg");

        assertThat(Rot13.solution1("test")).as("Input: \"test\"").isEqualTo("grfg");
        assertThat(Rot13.solution1("Test")).as("Input: \"Test\"").isEqualTo("Grfg");

        assertThat(Rot13.solution2("test")).as("Input: \"test\"").isEqualTo("grfg");
        assertThat(Rot13.solution2("Test")).as("Input: \"Test\"").isEqualTo("Grfg");

        assertThat(Rot13.solution3("test")).as("Input: \"test\"").isEqualTo("grfg");
        assertThat(Rot13.solution3("Test")).as("Input: \"Test\"").isEqualTo("Grfg");

        assertThat(Rot13.solution4("test")).as("Input: \"test\"").isEqualTo("grfg");
        assertThat(Rot13.solution4("Test")).as("Input: \"Test\"").isEqualTo("Grfg");
    }

    @Test
    void testRot13_Symbol() {
        assertThat(Rot13.rot13("Ruby is cool!")).as("Input: \"Ruby is cool!\"").isEqualTo("Ehol vf pbby!");
        assertThat(Rot13.rot13(",RcC")).as("Input: \",RcC\"").isEqualTo(",EpP");

        assertThat(Rot13.solution1("Ruby is cool!")).as("Input: \"Ruby is cool!\"").isEqualTo("Ehol vf pbby!");
        assertThat(Rot13.solution1(",RcC")).as("Input: \",RcC\"").isEqualTo(",EpP");

        assertThat(Rot13.solution2("Ruby is cool!")).as("Input: \"Ruby is cool!\"").isEqualTo("Ehol vf pbby!");
        assertThat(Rot13.solution2(",RcC")).as("Input: \",RcC\"").isEqualTo(",EpP");

        assertThat(Rot13.solution3("Ruby is cool!")).as("Input: \"Ruby is cool!\"").isEqualTo("Ehol vf pbby!");
        assertThat(Rot13.solution3(",RcC")).as("Input: \",RcC\"").isEqualTo(",EpP");

        assertThat(Rot13.solution4("Ruby is cool!")).as("Input: \"Ruby is cool!\"").isEqualTo("Ehol vf pbby!");
        assertThat(Rot13.solution4(",RcC")).as("Input: \",RcC\"").isEqualTo(",EpP");
    }
}