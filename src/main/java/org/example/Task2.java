package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Allied logistics in the Southern France campaign",
                "freedom",
                "love or lust",
                "railways and laid pipelines. The Seventh Army continued",
                "A deadly fire in Ürümqi escalates ongoing protests across China in response to the government's zero-COVID policy.",
                "ian Moynahan that, although disguised as an English professor at ",
                "Operation Dragoon",
                "feminist messages in cross-stitch that cover scaffolding at construction sites?",
                "rt and government of French emperor Napoleon III",
                "love or lust",
                "wife Eurydice when she is abducted by Pluto, the god of the",
                "Hanna Montana",
                "hihihihihihihihiihihihihih",
                "Hello, world!",
                "Imagination",
                " Operation Dragoon"));
        System.out.println("Кількість унікальних рядків, довжина яких більша за 8: " + list.stream().filter(v -> v.length() > 8).distinct().count());
    }
}
