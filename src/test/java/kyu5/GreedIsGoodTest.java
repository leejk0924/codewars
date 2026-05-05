package kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreedIsGoodTest {
    @Test
    public void shouldBeWorthless() {
        assertEquals(0, GreedIsGood.greedy(new int[]{2, 3, 4, 6, 2}));
        assertEquals(0, GreedIsGood.solution1(new int[]{2, 3, 4, 6, 2}));
    }

    @Test
    public void shouldValueTriplets() {
        assertEquals(400, GreedIsGood.greedy(new int[]{4, 4, 4, 3, 3}));
        assertEquals(400, GreedIsGood.solution1(new int[]{4, 4, 4, 3, 3}));
    }

    @Test
    public void shouldValueMixedSets() {
        assertEquals(450, GreedIsGood.greedy(new int[]{2, 4, 4, 5, 4}));
        assertEquals(450, GreedIsGood.solution1(new int[]{2, 4, 4, 5, 4}));
    }

    @Test
    public void tripleDice() {
        assertEquals(1000, GreedIsGood.greedy(new int[]{1,1,1,3,3}));
        assertEquals(1000, GreedIsGood.solution1(new int[]{1,1,1,3,3}));
    }
}