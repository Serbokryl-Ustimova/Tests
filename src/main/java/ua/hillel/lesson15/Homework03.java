package ua.hillel.lesson15;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Homework03 {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        List<Integer> unitedList2 = new LinkedList<>();
        List<Integer> unitedList3 = new LinkedList<>();
        List<Integer> unitedList4 = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            int intHash = getRandomValue();
            integerList.add(intHash);

            /** variant 1

             Iterator<Integer> iterator = integerList.iterator();
             while (iterator.hasNext()) {
             int n= iterator.next();
             if (n % 2 == 0 && n % 3 == 0) {
             unitedList2.add(n);
             } else if (n % 3 == 0) {
             unitedList3.add(n);
             } else if (n % 2 == 0 ) {
             unitedList4.add(n);
             } else {}
             System.out.println("unitedList2: " + unitedList2);
             System.out.println("unitedList3: " + unitedList3);
             System.out.println("unitedList4: " + unitedList4);
             }
             */

            /**
             * variant 2
             */

            if (intHash % 2 == 0 && intHash % 3 == 0) {
                unitedList2.add(intHash);
            } else if (intHash % 3 == 0) {
                unitedList3.add(intHash);
            } else if (intHash % 2 == 0) {
                unitedList4.add(intHash);
            } else {
            }
        }
        System.out.println("integerList" + integerList);
        System.out.println("unitedList2" + unitedList2);
        System.out.println("unitedList3" + unitedList3);
        System.out.println("unitedList4" + unitedList4);
    }

    private static int getRandomValue() {
        Random random = new Random();
        return random.nextInt(500);
    }
}
