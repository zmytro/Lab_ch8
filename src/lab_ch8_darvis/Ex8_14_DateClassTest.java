package lab_ch8_darvis;

public class Ex8_14_DateClassTest {
    public static void main(String[] args){
        Ex8_14_DateClass date1 = new Ex8_14_DateClass();
        Ex8_14_DateClass date2 = new Ex8_14_DateClass(12, 31, 2021);
        Ex8_14_DateClass date3 = new Ex8_14_DateClass("Май", 25, 2000);
        Ex8_14_DateClass date4 = new Ex8_14_DateClass(365, 2021);

        System.out.println("\nПервый формат");
        System.out.println(date1.toString());
        System.out.println(date2.toString());
        System.out.println(date3.toString());
        System.out.println(date4.toString());

        System.out.println("\nВторой формат");
        System.out.println(date1.toLong());
        System.out.println(date2.toLong());
        System.out.println(date3.toLong());
        System.out.println(date4.toLong());

        System.out.println("\nТретий формат");
        System.out.println(date1.toDay());
        System.out.println(date2.toDay());
        System.out.println(date3.toDay());
        System.out.println(date4.toDay());
    }
}
