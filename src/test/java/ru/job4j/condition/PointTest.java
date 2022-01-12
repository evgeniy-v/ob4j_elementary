package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10and10to23and0then16point40() {
        double expected = 16.40;
        int x1 = 10;
        int y1 = 10;
        int x2 = 23;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus10and0toMinus2and3then8point54() {
        double expected = 8.54;
        int x1 = -10;
        int y1 = 0;
        int x2 = -2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when0and9to2and10000then9991() {
        double expected = 9991;
        int x1 = 0;
        int y1 = 9;
        int x2 = 2;
        int y2 = 10000;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}