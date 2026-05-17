package algoMaster.binarysearch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindFirstAndLastPositionOfElementInSortedArrayTest {
    private final FindFirstAndLastPositionOfElementInSortedArray solution =
        new FindFirstAndLastPositionOfElementInSortedArray();

    @Test
    public void 일반적인_경우_타겟이_여러개_존재() {
        // [5,7,7,8,8,10], target = 8 → [3,4]
        int[] result1 = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        assertThat(result1).isEqualTo(new int[]{3, 4});

        // [5,7,7,8,8,10], target = 5 → [0,0]
        int[] result2 = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
        assertThat(result2).isEqualTo(new int[]{-1, -1});

        // [5,7,7,8,8,10], target = 10 → [5,5]
        int[] result3 = solution.searchRange(new int[]{1, 3, 5, 7, 9}, 5);
        assertThat(result3).isEqualTo(new int[]{2, 2});
    }
}
