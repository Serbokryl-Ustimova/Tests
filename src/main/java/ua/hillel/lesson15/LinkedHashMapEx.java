package ua.hillel.lesson15;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("example", 1);
        map.put("example1", 2);
        map.put("example", 3);

//        map.values(); //получаем колекцию значений
//        for(int values : map.values()) {
//            System.out.println(values);
//        }

//        map.keySet();//получаем колекцию ключей
//        for (String key : map.keySet()) {
//            System.out.println(key);
//        }

//        for (String key : map.keySet()) {
//            if (key.contains("3")) {
//                continue;
//            }
//            System.out.println(key);
//        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.printf("key: %s contains value %d%n", entry.getKey(), entry.getValue());

        }

//        System.out.println(map);
//        System.out.println(map.get("example"));
//        System.out.println(map.getOrDefault("exaple", 10));
//        System.out.println(map.get("exaple")); //если указываем несуществующее значение, получаем null
    }
}
