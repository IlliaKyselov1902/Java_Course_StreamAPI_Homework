package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new TreeMap<>();
        myMap.put("Redirecting", 100);
        myMap.put("Red", 23);
        myMap.put("Direct", 44);
        myMap.put("Java", 112);
        myMap.put("Club", 132);
        myMap.put("Hometasks", 100);
        myMap.put("Performance", 100);
        myMap.put("IDEA", 100);
        myMap.put("Tassk", 100);
        myMap.put("Gegemony", 100);
        myMap.put("Operating", 100);
        myMap.put("Zoom", 100);
        myMap.put("Softskills", 100);
        myMap.put("Adobe", 100);
        myMap.put("Processing", 100);
        myMap.put("English", 100);
        myMap.put("Fine", 100);
        myMap.put("China", 100);
        myMap.put("Amount", 100);
        myMap.put("Freak", 100);

        System.out.println(myMap.entrySet().stream().filter(v -> v.getKey().length() > 7).mapToInt(x -> x.getValue()).reduce(0,(x, y) -> x + y));
    }
}
