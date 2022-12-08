package org.example;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            myList.add(Math.abs(rand.nextInt() % 100));
        }
        IntSummaryStatistics i = myList.stream().mapToInt(v -> v).filter(n -> n % 5 == 0).filter(n -> n % 2 == 0).summaryStatistics();
        System.out.println("Сума: " + i.getSum());
        System.out.println("Кількість: " + i.getCount());
        System.out.println("Середнє: " + i.getAverage());
    }
}
