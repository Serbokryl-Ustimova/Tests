package ua.hillel.lesson7;

public class Android extends Mobile implements Filming, Listening {
    @Override
    public void readSms() {
        System.out.println("read Sms from Android");
    }

    @Override
    public void sendSms(String number, String text) {
        System.out.println("send Sms" + text + "to num " + number);
    }

    @Override
    public void makePhoto(String resolution) {
        initCamera();

    }

    @Override
    public void makeClip() {
        initCamera();

    }

    private void initCamera() {
        System.out.println("start Android Camera");
    }
}
