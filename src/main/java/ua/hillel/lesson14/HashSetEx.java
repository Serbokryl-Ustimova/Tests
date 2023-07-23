package ua.hillel.lesson14;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(25);
        set.add(31);
        set.add(12);
        System.out.println(set);
        System.out.println(set.hashCode());

        Set<String> setString = new java.util.HashSet<>();
        setString.add("str1");
        setString.add("str2");
        setString.add("str1");
        setString.add("str3");
        System.out.println(setString);
        System.out.println(setString.hashCode());


    }
}
