package ua.hillel.lesson14;

import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new java.util.LinkedHashSet<>();
        set.add(12);
        set.add(10);
        set.add(25);
        set.add(31);
        set.add(12);
        System.out.println(set);
        System.out.println(set.hashCode());

    }
}
