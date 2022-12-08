package org.example;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            myList.add(Math.abs(rand.nextInt() % 10));
        }

        myList.stream().forEach(s -> System.out.print(s));
    }
}
