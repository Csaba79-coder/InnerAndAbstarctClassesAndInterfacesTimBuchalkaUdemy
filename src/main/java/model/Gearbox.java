package model;

public class Gearbox {

    private boolean clutchIsIn;

    public Gearbox() {
    }

    public Gearbox(boolean clutchIsIn) {
        this.clutchIsIn = clutchIsIn;
    }

    public void operateClutch(boolean inOrOut) {
        this.clutchIsIn = inOrOut;
    }

    public boolean isClutchIsIn() {
        return clutchIsIn;
    }

    public void setClutchIsIn(boolean clutchIsIn) {
        this.clutchIsIn = clutchIsIn;
    }
}
