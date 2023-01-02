package com.generic;

public class Utils{
    public static <T extends Comparable> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? second: first;
        // return (first > second) ? first : second;
    }

    public static <T> void print(T User) {
        System.out.println(User);
    }
}
