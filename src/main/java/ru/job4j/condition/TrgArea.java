package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double per = a + b + c;
        double rsl = Math.sqrt(per * (per - a) * (per - b) * (per - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);

    }

}
