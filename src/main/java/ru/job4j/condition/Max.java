package ru.job4j.condition;

public class Max {
    public int max(int first, int second) {
        return  first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        return  third > max(first, second) ? third : max(first, second);
    }

    public int max(int first, int second, int third, int fourth) {
        return  fourth > max(first, second, third) ? fourth : max(first, second, third);
    }
}
