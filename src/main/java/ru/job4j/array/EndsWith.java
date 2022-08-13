package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            int currentIndexForWord = word.length - index - 1;
            int currentIndexForPost = post.length - index - 1;
            if (post[currentIndexForPost] != word[currentIndexForWord]) {
                result = false;
                break;
                }
            }
        return result;
        }
    }