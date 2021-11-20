package ru.job4j.array;

import java.util.Arrays;

public class Turn {
    public static int[] back(int[] array) {
        int resrv;
        for (int i = 0; i < array.length / 2; i++) {
            resrv = array[ i ];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = resrv;
        }
        return array;
    }
}
