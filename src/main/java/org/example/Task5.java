package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        List<Person> myList = new ArrayList<>();

        myList.add(new Person("Ilya", "Kyseliov", 18));
        myList.add(new Person("Liliya", "Kulabukhova", 19));
        myList.add(new Person("Kateryna", "Reznichenko", 18));
        myList.add(new Person("Lionel", "Messi", 35));
        myList.add(new Person("Cristiano", "Ronaldo", 37));
        myList.add(new Person("Ilya", "Safonov", 32));
        myList.add(new Person("Kristopher", "Porzingis", 31));
        myList.add(new Person("Mathew", "Fedorovskiy", 41));
        myList.add(new Person("Ray", "MC Allen", 24));
        myList.add(new Person("Ivan", "Makarov", 31));
        myList.add(new Person("Vishvanathan", "Anand", 52));

        System.out.println(myList.stream().filter(x -> x.getFullName().length() <= 15).max(Person::compareTo).get().getFullName());
    }
}
class Person{
    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(Object o) {
        return Integer.compare(age, ((Person)o).age);
    }
}