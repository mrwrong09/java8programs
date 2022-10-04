package com.mw.example;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumberUsingStream {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);

        //more examples comes here


    }
}
