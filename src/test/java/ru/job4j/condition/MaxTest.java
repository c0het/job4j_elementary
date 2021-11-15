package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax4to6Then6() {
        int left = 4;
        int right = 6;
        int rsl = Max.max(left, right);
        int expected = 6;
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void whenMaxToMaxThenMax() {
        int left = 7;
        int right = 7;
        int rsl = Max.max(left, right);
        int expected = rsl;
        Assert.assertEquals(rsl, expected);
    }
}