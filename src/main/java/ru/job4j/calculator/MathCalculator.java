package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second) + MathFunction.division(first, second) + MathFunction.difference(first, second);
    }

    public static double divAndDiff(double first, double second) {
        return MathFunction.division(first, second) + MathFunction.difference(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}