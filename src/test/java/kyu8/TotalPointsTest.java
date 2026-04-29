package kyu8;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

class TotalPointsTest {

    @Test
    public void basicTests() {
        Function<String[], Integer> totalPoint = TotalPoints::points;

        assertThat(30).isEqualTo(totalPoint.apply(new String[]{"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"}));

        assertThat(0).isEqualTo(totalPoint.apply(new String[]{"0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4"}));

        assertThat(12).isEqualTo(totalPoint.apply(new String[]{"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"}));
    }
}