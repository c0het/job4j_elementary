package ru.job4j.ru.job4j.convert;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 35;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        expected = 4;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 4. Test result : " + passed);

    }
}
