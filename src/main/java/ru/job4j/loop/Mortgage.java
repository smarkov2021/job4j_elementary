package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year =  0;
        while (amount > 0) {
            amount = amount * (1 + percent / 100) - salary;
            year++;
        }

        return year;
    }
}