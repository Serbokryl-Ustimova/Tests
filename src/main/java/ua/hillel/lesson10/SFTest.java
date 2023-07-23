package ua.hillel.lesson10;

public class SFTest {
    public static void main(String[] args) {
        StaticFinal staticFinal = new StaticFinal("v3");
        System.out.println(staticFinal.s);
//        System.out.println(staticFinal.s1);
        System.out.println(staticFinal.nonStatic);
        System.out.println(StaticFinal.sStatic);

    }
}
