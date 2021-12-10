package lab_ch8_darvis;

public class Ex8_5_Time2Modified {

    private final int s_per_min = 60; //секунд в минуте
    private final int s_h = 3600; // секунд в одном часу
    private final int m_h = 60; //минут в одном часу


    private int time;

    public Ex8_5_Time2Modified() {
        this(0, 0, 0);
    }

    public Ex8_5_Time2Modified(int h) {
        this(h, 0, 0);
    }

    public Ex8_5_Time2Modified(int h, int m) {
        this(h, m, 0);
    }

    public Ex8_5_Time2Modified(int h, int m, int s) {
        setTime(h, m, s);
    }

    public Ex8_5_Time2Modified(Ex8_5_Time2Modified time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    //геттеры
    public int getHour() {
        return time / s_h;
    }

    public int getMinute() {
        return (time % s_h) / m_h;
    }

    public int getSecond() {
        return time % s_per_min;
    }

    //сеттеры
    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int h) {
        if (h >= 0 && h < 24) {
            time += h * s_h;
        } else System.err.println("Часы: от 0 до 23");
    }

    public void setMinute(int m) {
        if (m >= 0 && m < 60)
            time += m * s_per_min;
        else
            System.err.println("Минуты: от 0 до 59");
    }

    public void setSecond(int s) {
        if (s >= 0 && s < 60)
            time += s;
        else
            System.err.println("Секунды: от 0 до 59");
    }


    public String toUniversalString() {
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
