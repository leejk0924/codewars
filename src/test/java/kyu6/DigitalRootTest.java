package kyu6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class DigitalRootTest {

    @Test
    public void Test1() {
        assertThat(DigitalRoot.digital_root(16)).isEqualTo(7);
        assertThat(DigitalRoot.solution1(16)).isEqualTo(7);
        assertThat(DigitalRoot.solution2(16)).isEqualTo(7);
    }

    @Test
    public void Test2() {
        assertThat(DigitalRoot.digital_root(456)).isEqualTo(6);
        assertThat(DigitalRoot.solution1(456)).isEqualTo(6);
        assertThat(DigitalRoot.solution2(456)).isEqualTo(6);
        assertThat(DigitalRoot.solution3(456)).isEqualTo(6);
    }

    @Test
    public void Test3() {
        assertThat(DigitalRoot.digital_root(132189)).isEqualTo(6);
        assertThat(DigitalRoot.solution1(132189)).isEqualTo(6);
        assertThat(DigitalRoot.solution2(132189)).isEqualTo(6);
        assertThat(DigitalRoot.solution3(132189)).isEqualTo(6);
    }
    @Test
    public void Test4() {
        assertThat(DigitalRoot.digital_root(493193)).isEqualTo(2);
        assertThat(DigitalRoot.solution1(493193)).isEqualTo(2);
        assertThat(DigitalRoot.solution2(493193)).isEqualTo(2);
        assertThat(DigitalRoot.solution3(493193)).isEqualTo(2);
    }
}