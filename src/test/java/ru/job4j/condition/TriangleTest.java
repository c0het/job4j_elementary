package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void exist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean rsl = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(rsl);
    }

    @Test
    public void unrealTriangl() {
        double ab = 2.0;
        double ac = 10.0;
        double bc = 2.0;
        boolean rsl = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(rsl);
    }
}