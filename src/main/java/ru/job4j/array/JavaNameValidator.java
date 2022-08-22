package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty() || !Character.isLowerCase(name.codePointAt(0))) {
            return false;
        }
        for (int index = 1; index < name.length(); index++) {
            int code = name.codePointAt(index);
            if (!isSpecialSymbol(code) && !isUpperLatinLetter(code) && !isLowerLatinLetter(code) && !Character.isDigit(code)) {
                return false;
            }

        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 60 && code <= 95;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}