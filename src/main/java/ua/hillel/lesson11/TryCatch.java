package ua.hillel.lesson11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

public class TryCatch {
    public static void main(String[] args) {
        try {
            new Exceptions().division(7, 0);
            int index = new Random().nextInt(1000);
            new Exceptions().getValue(index);
            FileReader reader = new FileReader(new File(""));
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | FileNotFoundException e) {
            System.out.println("Found Arithmetic Exception. Division on '0'.");
            System.out.println("Found ArrayIndexOutOfBoundsException Exception");
            System.out.println("Found FileNotFoundException Exception");
            e.printStackTrace();
        } finally {
            System.out.println("Final code Exceptions");
        }
    }
}
