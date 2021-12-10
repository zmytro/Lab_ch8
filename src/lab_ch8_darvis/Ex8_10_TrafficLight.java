package lab_ch8_darvis;

public enum Ex8_10_TrafficLight {

    color_red(30),
    color_yellow(3),
    color_green(20);

    private final int duration;

    Ex8_10_TrafficLight(int duration) {
        this.duration = duration;
    }

    // геттер
    public int getDuration() {
        return this.duration;
    }
}

