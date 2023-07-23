package ua.hillel.lesson10;

public class StaticFinal {
    public final String s = "s";
//    public final String s1;

//    public StaticFinal(String value) {
//        s1 = value;
//    }

    public static String sStatic = "sStatic";
    public String nonStatic;

    public StaticFinal(String value) {
        nonStatic = value;
    }
}
