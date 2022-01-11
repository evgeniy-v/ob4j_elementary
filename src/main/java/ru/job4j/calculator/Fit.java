package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = 1.15 * (height - 100);
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = 1.15 * (height - 110);
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);

        height = 177;
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 177 is " + woman);
    }
}
