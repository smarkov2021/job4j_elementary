package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            int lastIndex = array.length - 1;
            int currentIndex = lastIndex - index;
            result[currentIndex] = array[index];
        }
        return result;
    }
}