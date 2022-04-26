package command;

public class Stereo {
    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        System.out.println("Stereo CD set");
    }

    public void setDvd() {
        System.out.println("Stereo DVD set");
    }

    public void setRadio() {
        System.out.println("Stereo Radio set");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo Volume set: "  + volume);
    }
}
