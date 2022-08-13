package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas7ThenMinus1() {
        int[] data = new int[]{5, 10, 3};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

        @Test
        public void whenDiapasonHas2Then3() {
            int[] data = new int[] {5, 2, 10, 2, 4};
            int el = 2;
            int start = 2;
            int finish = 4;
            int result = FindLoop.indexInRange(data, el, start, finish);
            int expected = 3;
            assertThat(result).isEqualTo(expected);
        }

         @Test
         public void whenDiapasonHasNot4ThenMinus1() {
             int[] data = new int[] {5, 2, 10, 2, 4};
             int el = 4;
             int start = 2;
             int finish = 3;
             int result = FindLoop.indexInRange(data, el, start, finish);
             int expected = -1;
             assertThat(result).isEqualTo(expected);
        }

        @Test
        public void whenDiapasonHasNot5ThenMinus1() {
            int[] data = new int[] {5, 2, 10, 2, 4};
            int el = 5;
            int start = 1;
            int finish = 4;
            int result = FindLoop.indexInRange(data, el, start, finish);
            int expected = -1;
            assertThat(result).isEqualTo(expected);
    }

        @Test
        public void whenDiapasonHas10Then2() {
            int[] data = new int[] {5, 2, 10, 2, 4};
            int el = 10;
            int start = 1;
            int finish = 3;
            int result = FindLoop.indexInRange(data, el, start, finish);
            int expected = 2;
            assertThat(result).isEqualTo(expected);
    }
}
