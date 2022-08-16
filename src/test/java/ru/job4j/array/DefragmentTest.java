package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DefragmentTest {
    @Test
    public void singleFirstNull() {
        String[] input = {null, "I"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", null};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void notAllNull() {
        String[] input = {null, null, null};
        String[] result = Defragment.compress(input);
        String[] expected = {null, null, null};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void notAllAtFirstNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] result = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(result).containsExactly(expected);
    }
}