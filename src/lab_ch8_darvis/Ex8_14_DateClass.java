package lab_ch8_darvis;

public class Ex8_14_DateClass {
    private static final int m_y = 12;

    private final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static final String[] strMonths =
            {"", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август",
                    "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

    private static final String[] strDays =
            {"", "Понедельник", "Вторник", "Среда", "Четверг", "Friday", "Суббота", "Воскресенье"};

    private int[] date = new int[3];

    //конструкторы
    public Ex8_14_DateClass() {
        date[0] = 1;
        date[1] = 1;
        date[2] = 1900;
    }

    public Ex8_14_DateClass(int month, int day, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public Ex8_14_DateClass(String month, int day, int year) {
        setYear(year);
        setStringMonth(month);
        setDay(day);
    }

    public Ex8_14_DateClass(int dayOfYear, int year) {
        setYear(year);
        setLongFormDay(dayOfYear);
    }


    //геттеры
    public int getMonth() {
        return date[0];
    }

    public int getDay() {
        return date[1];
    }

    public int getYear() {
        return date[2];
    }

    private int getDayOfYear() {
        int tmp = 0;

        for (int i = 1; i < date[0]; i++) {
            tmp += daysPerMonth[i];
        }
        return tmp + date[1];
    }

    //сеттеры
    public void setMonth(int month) {
        date[0] = checkMonth(month);
    }

    public void setStringMonth(String month) {
        date[0] = checkStringMonth(month);
    }

    public void setDay(int day) {
        date[1] = checkDay(day);
    }

    public void setLongFormDay(int dayOfYear) {
        int month = 1;
        while (dayOfYear > daysPerMonth[month]) {
            dayOfYear -= daysPerMonth[month];
            month++;
        }

        setMonth(month);
        setDay(dayOfYear);
    }

    public void setYear(int year) {
        date[2] = checkYear(year);
    }

    private int checkStringMonth(String month) {
        if (month.length() > 1)
            month = month.substring(0, 1).toUpperCase() + month.substring(1);

        for (int i = 1; i < strMonths.length; i++) {
            if (strMonths[i].equals(month))
                return i;
        }

        throw new IllegalArgumentException("Ошибка");
    }

    private int checkDay(int testDay) {
        if (testDay < 0 && testDay >= daysPerMonth[getMonth()]) {
            System.err.println("Ошибка");
        }
        return testDay;
    }

    private int checkMonth(int testMonth) {
        if (testMonth < 0 && testMonth >= m_y) {
            System.err.println("Ошибка");
        }
        return testMonth;
    }


    private int checkYear(int testYear) {
        if (testYear >= 0 && testYear <= 9999)
            return testYear;
        else
            throw new IllegalArgumentException("Ошибка");
    }


    public String toString() {
        return String.format("%02d/%02d/%04d", date[0], date[1], date[2]);
    }

    public String toLong() {
        return String.format("%s %02d %04d", strMonths[date[0]], date[1], date[2]);
    }

    public String toDay() {
        return String.format("%03d %04d", getDayOfYear(), date[2]);
    }
}
