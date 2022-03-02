package model;

public class GearboxUntidyMode {

    private boolean clutchIsIn;

    public GearboxUntidyMode() {
    }

    public GearboxUntidyMode(boolean clutchIsIn) {
        this.clutchIsIn = clutchIsIn;
    }

    public void operateClutch(String inOrOut) {
        this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
    }

    public boolean isClutchIsIn() {
        return clutchIsIn;
    }

    public void setClutchIsIn(boolean clutchIsIn) {
        this.clutchIsIn = clutchIsIn;
    }
}
