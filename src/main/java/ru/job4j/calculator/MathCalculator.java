package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double diffAndDiv(double first, double second) {
        return diff(first, second) + division(first, second);
    }

    public static double sumThemAll(double first, double second) {
        return sum(first, second) + multiply(first, second) + diff(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета diffAndDiv равен: " + diffAndDiv(10, 20));
        System.out.println("Результат расчета sumThemAll равен: " + sumThemAll(10, 20));
    }
}
