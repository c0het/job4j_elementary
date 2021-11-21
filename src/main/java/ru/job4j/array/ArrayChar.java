package ru.job4j.array;

import java.util.Arrays;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        if (word.length >= pref.length) {
            for (int i = 0; i < pref.length; i++) {
                if (word[i] != pref[i]) {
                    result = false;
                    break;
                }
            }
        } else {
            for (int i = 0; i < word.length; i++) {
                if (word[i] != pref[i]) {
                    result = false;
                    break;
                }
            }
        }
        return result;

    }
}

