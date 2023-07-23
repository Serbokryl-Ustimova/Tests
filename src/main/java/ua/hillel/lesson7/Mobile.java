package ua.hillel.lesson7;

public abstract class Mobile implements Filming, Listening {
    public void makeCall(String number) {
        System.out.println("calling " + number);
    }

    public void receiveCall(String number) {
        System.out.println("incoming call from " + number);
    }

    public abstract void readSms();

    public abstract void sendSms(String number, String text);

    @Override
    public void makePhoto(String resolution) {

    }

    @Override
    public void makeClip() {

    }

    @Override
    public void playMusic() {
        System.out.println("play music on Android");

    }
}
