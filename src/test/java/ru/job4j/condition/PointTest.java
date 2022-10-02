package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to00then0() {
        double expected = 0;
        Point first = new Point(0, 0);
        Point second = new Point(0, 0);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to01then1dot414() {
        double expected = 1.414;
        int x1 = 1;
        int y1 = 0;
        int x2 = 0;
        int y2 = 1;
        Point first = new Point(1, 0);
        Point second = new Point(0, 1);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to01then2dot236() {
        double expected = 2.236;
        Point first = new Point(2, 0);
        Point second = new Point(0, 1);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to11then1() {
        double expected = 1;
        Point first = new Point(1, 0);
        Point second = new Point(1, 1);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}