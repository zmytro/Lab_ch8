package lab_ch8_darvis;

public class Ex8_7_Time2EnhancedTest {
    public static void main(String[] args){
        Ex8_7_Time2Enhanced time1 = new Ex8_7_Time2Enhanced();
        Ex8_7_Time2Enhanced time2 = new Ex8_7_Time2Enhanced(4);
        Ex8_7_Time2Enhanced time3 = new Ex8_7_Time2Enhanced(17, 8);
        Ex8_7_Time2Enhanced time4 = new Ex8_7_Time2Enhanced(11, 35, 18);
        Ex8_7_Time2Enhanced time5 = new Ex8_7_Time2Enhanced(22, 59, 59);

        System.out.println("TIME1");
        System.out.printf("     %s\n", time1.toUniversalString());
        System.out.printf("     %s\n", time1.toString());

        System.out.println("TIME2");
        System.out.printf("     %s\n", time2.toUniversalString());
        System.out.printf("     %s\n", time2.toString());

        System.out.println("TIME3");
        System.out.printf("     %s\n", time3.toUniversalString());
        System.out.printf("     %s\n", time3.toString());

        System.out.println("TIME4");
        System.out.printf("     %s\n", time4.toUniversalString());
        System.out.printf("     %s\n", time4.toString());

        System.out.println("TIME5");
        System.out.printf("     %s\n", time5.toUniversalString());
        System.out.printf("     %s\n", time5.toString());

        }
    }

