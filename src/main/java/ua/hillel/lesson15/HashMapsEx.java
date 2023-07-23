package ua.hillel.lesson15;

import java.util.HashMap;
import java.util.Map;

public class HashMapsEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("example", 1);
        map.put("example1", 2);
        map.put("example", 3);
        System.out.println(map);

    }
}
