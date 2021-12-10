package lab_ch8_darvis;

public class Ex8_8_DateClassEnhanced {
    private final int m_y = 12;
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

//конструкторы
    public Ex8_8_DateClassEnhanced(int month, int day, int year){
        setMonth(month);
        setDay(day);
        setYear(year);
    }
    //геттеры
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }

    //сеттеры
    public void setDay(int day){
        this.day = checkDay(day);
    }
    public void setMonth(int month){
        this.month = checkMonth(month);
    }
    public void setYear(int year){
        this.year = checkYear(year);
    }

    private int checkMonth(int testMonth){
        if(testMonth > 0 && testMonth <= m_y)
            return testMonth;
        else
            throw new IllegalArgumentException("Ошибка");
    }

    private int checkDay(int testDay){

        if(testDay > 0 && testDay <= daysPerMonth[this.month])
            return testDay;

        if(this.month == 2 && testDay == 29 &&
                (this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0)))
            return testDay;

        throw new IllegalArgumentException("Ошибка");
    }

    private int checkYear(int testYear){
        if(testYear > 0 && testYear <= 9999)
            return testYear;
        else
            throw new IllegalArgumentException("Ошибка");
    }

    public void nextDay(){
        if(getDay() + 1 <= daysPerMonth[getMonth()])
            setDay(getDay() + 1);
        else{
            setDay(1);
            nextMonth();
        }
    }
    public void nextMonth(){
        if(getMonth() + 1 <= m_y)
            setMonth(getMonth() + 1);
        else{
            setMonth(1);
            setYear(getYear() + 1);
        }
    }
    public String toString(){
        return String.format("%02d/%02d/%4d", month, day, year);
    }
}
