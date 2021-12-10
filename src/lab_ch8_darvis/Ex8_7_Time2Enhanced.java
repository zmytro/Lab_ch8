package lab_ch8_darvis;

public class Ex8_7_Time2Enhanced {
    private final int s_per_min = 60; //секунд в минуте
    private final int s_h = 3600; // секунд в одном часу
    private final int m_h = 60; //минут в одном часу
    private final int h_d = 24; //часов в сутках


    private int time;

    // Time2Enhanced no argument constructor:
    // Initialises each instance variable to zero
    public Ex8_7_Time2Enhanced(){
        this(0, 0, 0);  // invoke Time2Enhanced constructor with three arguments
    }
    // Time2Enhanced constructor: hour supplied, minute and second defaulted to 0
    public Ex8_7_Time2Enhanced(int h){
        this(h, 0, 0);
    }
    // Time2Enhanced constructor: hour and minute supplied, second defaulted to 0
    public Ex8_7_Time2Enhanced(int h, int m){
        this(h, m, 0);
    }
    // Time2Enhanced constructor: hour, minute and second supplied
    public Ex8_7_Time2Enhanced(int h, int m, int s){
        setTime(h, m, s);
    }
    // Time2Enhanced constructor: another Time2Enhanced object supplied
    public Ex8_7_Time2Enhanced(Ex8_7_Time2Enhanced time){
        // invoke Time2Enhanced three-argument constructor
        this(time.getHour(), time.getMinute(), time.getSecond());
    }
    // SETTERS
    // set a new time value using universal time
    // validate the data
    public void setTime(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public void setHour(int h){
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
    public void setSecond(int s){
        if (s >= 0 && s < 60)
            time += s;
        else
            System.err.println("Секунды: от 0 до 59");
    }
    // increment minute
    public void incrementMinute(){
        // ensure minute isn't at hours limit
        if(getMinute() < m_h - 1)
            time += s_per_min;
            // if so reset minutes to zero and increment hour
        else{
            time -= (m_h - 1) * s_per_min;
            incrementHour();
        }
    }
    // increment hour
    public void incrementHour(){
        // ensure hours isn't at day's limit
        if(getHour() < h_d - 1)
            time += s_h;
            // if so reset hours to zero
        else
            time -= (h_d - 1) * s_h;
    }
    // GETTERS
    // get hour
    public int getHour(){
        return time / s_h;
    }
    // get minute
    public int getMinute(){
        return (time % s_h) / m_h;
    }
    // get second
    public int getSecond(){
        return time % s_per_min;
    }

    // convert to String in universal time format (HH:MM:SS)
    public String toUniversalString(){
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    // convert to String in standard time format (H:MM:MM AM/PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
