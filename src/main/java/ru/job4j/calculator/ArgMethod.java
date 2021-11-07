package ru.job4j.calculator;

public class ArgMethod {

    public static void helloo(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        ArgMethod.helloo(name, age);
        ArgMethod.helloo(name, age);
        ArgMethod.helloo(name, age);
        ArgMethod.helloo(name, age);
    }
}
