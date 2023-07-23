package ua.hillel.Files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class ParseAlarms {
    public static void main(String[] args) throws IOException {
        File alarmsFile = new File("alarms.csv");

        List<String> alarmLines = Files.readAllLines(alarmsFile.toPath());
        List<String> headers = Arrays.asList(alarmLines.get(0).split(","));

        List<Map<String, String>> alarmLinesValues =new ArrayList<>();
        for (int g=1; g<alarmLines.size(); g++) {
            List<String> values =Arrays.asList(alarmLines.get(g).split(","));

            Map<String, String> map = new HashMap<>();
            for (int d=0; d<values.size(); d++) {
                map.put(headers.get(d),values.get(d));
            }
            alarmLinesValues.add(map);
        }
        alarmLinesValues.get(1).get("price");
        System.out.println(alarmLinesValues);
    }
}
