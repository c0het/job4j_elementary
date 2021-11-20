package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void when0com1com4com9comm16() {
        int bound = 5;
        int[] rsl = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        Assert.assertArrayEquals(expected, rsl);
    }
}