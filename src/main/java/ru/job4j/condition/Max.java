package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean comp = left > right;
        int result = comp ? left : right;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(6, 6));
    }
}
