package com.udemy.lesson8;

public class Lesson8 {
    public static double p= 3.14;

    public void plochadKruga(double radius){
        double plochad= radius*p*radius;
        System.out.println("площадь круга: "+ plochad);
    }

    public static void dlina(double radius){
        double dlina= 2*radius*p;
        System.out.println("длина круга: "+dlina);
    }

    public void infoRadius(double radius){
        System.out.println("радиус: "+ radius);
        dlina(radius);
        plochadKruga(radius);

    }


    public static int multiply(int v, int f, int d){
        System.out.println("результат умножения: "+ (v*f*d));
        return v*f*d;
    }

    public static void delenie(double var1, double va2){
        double result= var1/va2;
        System.out.println("целое число: "+ result+ "остаток от деления" + var1%va2);
    }
}
