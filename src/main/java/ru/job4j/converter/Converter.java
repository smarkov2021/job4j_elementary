package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = Math.round(value * 100.0f / 68.0f) / 100.0f;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        expected =  2.06F;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2.06. Test result : " + passed);
    }
}