package ru.job4j.array;

import java.util.Arrays;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
