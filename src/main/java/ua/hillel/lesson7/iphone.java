package ua.hillel.lesson7;

public class iphone extends Mobile {
    @Override
    public void readSms() {
        System.out.println("read Sms from Iphone");

    }

    @Override
    public void sendSms(String number, String text) {
        System.out.println("send Sms from Iphone" + text + "to num " + number);

    }

    @Override
    public void makePhoto(String resolution) {
        initCamera();

    }

    @Override
    public void makeClip() {
        initCamera();

    }

    @Override
    public void playMusic() {
        System.out.println("play music on Iphone");

    }

    private void initCamera() {
        System.out.println("start Iphone Camera");
    }
}
