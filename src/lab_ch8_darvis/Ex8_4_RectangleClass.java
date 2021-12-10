package lab_ch8_darvis;

public class Ex8_4_RectangleClass {
    private double length;
    private double width;

    //дефолт
    public Ex8_4_RectangleClass() {
        this(1, 1);
    }

    public Ex8_4_RectangleClass(double l, double w) {
        this.setLength(l);
        this.setWidth(w);
    }

    //расчет площади и периметра
    public double area() {
        return getWidth() * getLength();
    }

    public double perimeter() {
        return 2 * (getWidth() + getLength());
    }

    //геттеры
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //сеттеры
    public void setLength(double length) {
        if (length >= 0.0 && length <= 20.0) {
            this.length = length;
        }else System.err.println("Вы ввели неправильную длину");
    }

    public void setWidth(double width) {
        if (width >= 0.0 && width <= 20.0) {
            this.width = width;
        }else System.err.println("Вы ввели неправильную ширину");
    }

    //вывод на экран
    public String printResult() {
        String st = null;
        return st.format("Площадь прямоугольника:\t%.2f \nПериметр прямоугольника:\t%.2f", area(), perimeter());
    }

    public String toString() {
        return String.format("Дан прямоугольник: \nШирина:\t%.2f\nДлина:\t%.2f\n", getWidth(), getLength());
    }
}
