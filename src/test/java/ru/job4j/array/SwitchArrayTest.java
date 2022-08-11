package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap4to5() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22};
        int source = 4;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 6, 5, 7, 8, 9, 10, 22};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap7to7() {
        int[] input = {1, 2, 33, 4, 5, 7, 18, 9, 10, 22};
        int source = 7;
        int dest = 7;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 33, 4, 5, 7, 18, 9, 10, 22};
        assertThat(result).containsExactly(expected);
    }
}