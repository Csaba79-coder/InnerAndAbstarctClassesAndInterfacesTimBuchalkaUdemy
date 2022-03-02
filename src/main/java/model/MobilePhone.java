package model;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone() {
    }

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone is powered up!");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now is ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Mobile phone is switched off!");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            System.out.println("Melody ring");
            isRinging = true;
        } else {
            System.out.println("Mobile phone is switched off!");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
