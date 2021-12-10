package lab_ch8_darvis;

public class Ex8_8_DateClassEnhancedTest {
    public static void main(String[] args) {

        Ex8_8_DateClassEnhanced date = new Ex8_8_DateClassEnhanced(11, 29, 2015);

        do {
            try {
                date.nextDay();
            } catch (IllegalArgumentException e) {
                System.err.printf("Ошибка %s\n", e.getMessage());

            } finally {
                System.out.println("OK");

            }
            System.out.printf("%s\n", date.toString());
        } while (date.getYear() != 2500);
    }
}
