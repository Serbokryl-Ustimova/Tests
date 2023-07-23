package ua.hillel.lesson11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {

    public int division(int a, int b) throws ArithmeticException {
        int div = a / b;
        return div;
    }

    public static int getValue(int index) throws ArrayIndexOutOfBoundsException {
        int[] intArray = new int[10];
        return intArray[index];
    }

    public void setPatientStatus(String status) {

    }

    public static String getFile(String file) throws FileNotFoundException {
        File fileToRead = new File("tryToRead.txt");
        FileReader reader = new FileReader(fileToRead) {
        };
        return "";
    }
}
