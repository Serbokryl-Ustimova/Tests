package ua.hillel.lesson9_1;

public class Homework8 {
    public static void main(String[] args) {

        Mobile iphone = new Mobile("Iphone", 200, 20.04, 3);
        Mobile android = new Mobile("Samsung", 240, 20.07, 4);
        Mobile nokia = new Mobile("Nokia", 250, 20.08, 1);
        iphone.brand = "Iphone";
        iphone.price = 200;
        iphone.width = 20.01;
        iphone.amountOfCameras = 4;

        android.brand = "Samsung";
        android.price = 230;
        android.width = 22.02;
        android.amountOfCameras = 3;

        nokia.brand = "Nokia";
        nokia.price = 210;
        nokia.width = 21.01;
        nokia.amountOfCameras = 1;

        System.out.println("First mobile is " + iphone.brand + ", its price is " + iphone.price + "$, its width is " + iphone.width + " inches and it has " + iphone.amountOfCameras + " cameras.");
        System.out.println("Second mobile is " + android.brand + ", its price is " + android.price + "$, its width is " + android.width + " inches and it has " + android.amountOfCameras + " cameras.");
        System.out.println("Third mobile is " + nokia.brand + ", its price is " + nokia.price + "$, its width is " + nokia.width + " inches and it has " + nokia.amountOfCameras + " cameras.");

    }
}
