package ua.hillel.lesson15;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Homework01 {
    public static void main(String[] args) {

        List<Integer> integerList1 = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            int intHash = getRandomValue();
            integerList1.add(intHash);
        }
        System.out.println(integerList1);

        List<Integer> unitedlist = new LinkedList<>();
        unitedlist.addAll(integerList1);
        for (int x = 0; x < unitedlist.size(); x++) {
            for (int y = 0; y < unitedlist.size(); y++) {
                if (unitedlist.get(x) == unitedlist.get(y)) {
                    unitedlist.remove(y);
                }
            }
        }
        System.out.println(unitedlist);
    }

    private static int getRandomValue() {
        Random random = new Random();
        return random.nextInt(20);
    }
}

