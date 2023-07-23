package ua.hillel.lesson15;

import java.util.HashMap;
import java.util.Map;

public class Homework02 {
    public static void main(String[] args) {
        Map<String, Integer> shoppingMap1 = new HashMap<>();
        int sum = 0;

        shoppingMap1.put("apple", 3);
        shoppingMap1.put("pineapple", 4);
        shoppingMap1.put("banana", 5);
        shoppingMap1.put("banana", 6);


        for (int values : shoppingMap1.values()) {
            sum += values;
            System.out.println("sum of values is: " + sum);
        }
    }
}
