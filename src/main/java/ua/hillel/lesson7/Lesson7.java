package ua.hillel.lesson7;

public class Lesson7 {
    public static void main(String[] args) {
//        Dog dog1 = new Dog();
//        dog1.name= "Jack";
//        dog1.age= 5;
//        dog1.colour= "black";
//        System.out.println(dog1.name);
//        dog1.bark();
//
//        Dog dog2 = dog1;
//        dog2.name= "Spike";
//        dog2.age= 3;
//        dog2.colour= "grey";
//        System.out.println(dog1.name);
//        dog2.bark();
//
//        Dog dog3 = new Dog();
//        dog3.name= "Bike";
//        dog3.age= 3;
//        dog3.colour= "grey";
//        System.out.println(dog3.name);
//        dog3.bark();

        Mobile phone = new Android();
        phone.readSms();
        phone.playMusic();
        phone.makeClip();
        phone.makePhoto("resolution");
        phone.receiveCall("1256789");

        Mobile phoneIphone = new iphone();
        phoneIphone.readSms();
        phoneIphone.playMusic();
        phoneIphone.makeClip();
        phoneIphone.makePhoto("resolution");
        phoneIphone.receiveCall("56790");


    }

}
