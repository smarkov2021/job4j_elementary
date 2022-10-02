package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        Max firstTest = new Max();
        int result = firstTest.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        Max secondTest = new Max();
        int result = secondTest.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To2To7Then7() {
        int first = 1;
        int second = 2;
        int third = 2;
        int fourth = 7;
        Max secondTest = new Max();
        int result = secondTest.max(first, second, third, fourth);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }
}