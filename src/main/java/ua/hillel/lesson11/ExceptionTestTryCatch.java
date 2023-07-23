package ua.hillel.lesson11;

import ua.hillel.lesson10_1.Patient;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

public class ExceptionTestTryCatch {
    public static void main(String[] args) {
        try {
            new Exceptions().division(7, 0);
        } catch (ArithmeticException e) {
            System.out.println("Found Arithmetic Exception. Division on '0'.");
        } finally {
            System.out.println("Final code Arithmetic Exception");
        }


        try {
            int index = new Random().nextInt(1000);
            new Exceptions().getValue(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Found ArrayIndexOutOfBoundsException Exception");
        } finally {
            System.out.println("Final code ArrayIndexOutOfBoundsException Exception");
        }

        try {
            new Patient().setPatientStatus(123);
        } catch (IllegalArgumentException e) {
            System.out.println("Found IllegalArgumentException Exception");
        } finally {
            System.out.println("Final code IllegalArgumentException Exception");
        }

        try {
            FileReader reader = new FileReader(new File(""));
        } catch (FileNotFoundException e) {
            System.out.println("Found FileNotFoundException Exception");
        } finally {
            System.out.println("Final code FileNotFoundException Exception");
        }
    }
}
