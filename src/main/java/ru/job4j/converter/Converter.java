package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2.333333333f;
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        boolean passed = expected == dollar;
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar. Test result : " + passed);
    }
}
