package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{7}, {6, 6}, {7, 7, 9}, {12, 27, 93, 77}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }
}