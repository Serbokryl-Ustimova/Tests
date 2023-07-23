package ua.hillel.lesson14;

import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>();
        list.add(34);
        list.add(15);
        list.add(22);
        list.add(34);
        list.get(3);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int el : list) {
            System.out.println(el);
        }

        List<String> stringList = new java.util.ArrayList<>();
        stringList.add("str1");
        stringList.add("srt2");
        stringList.add("str1");
//        System.out.println(stringList);
        stringList.removeAll(stringList);
//        System.out.println(stringList);
    }
}
