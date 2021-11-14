package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2thenS2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K4thenS256() {
        double p = 8;
        double k = 4;
        double expected = 2.56;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K5thenS347() {
        double p = 10;
        double k = 5;
        double expected = 3.47;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}