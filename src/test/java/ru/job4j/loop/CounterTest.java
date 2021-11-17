package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sum() {
        int start = 1;
        int finish = 10;
        int rsl = Counter.sum(start, finish);
        int expected = 55;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
            int start = 1;
            int finish = 10;
            int result = Counter.sumByEven(start, finish);
            int expected = 30;
            Assert.assertEquals(expected, result);
        }

    @Test
    public void whenSumEvenNumbersFromTenToTwentyThenTNinty() {
        int start = 10;
        int finish = 20;
        int result = Counter.sumByEven(start, finish);
        int expected = 90;
        Assert.assertEquals(expected, result);
    }
}

