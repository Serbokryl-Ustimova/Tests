package ua.hillel.lesson11;

import java.io.FileNotFoundException;
import java.util.Random;

public class ExceptionsTest {
    public static void main(String[] args) throws FileNotFoundException, ArithmeticException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        new Exceptions().division(7, 0);
        int index = new Random().nextInt(30);
        new Exceptions().getValue(index);
//        new Exceptions().setPatientStatus(123);
        Exceptions.getFile("tryToRead.txt");
    }

}
