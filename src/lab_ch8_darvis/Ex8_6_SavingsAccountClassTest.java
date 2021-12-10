package lab_ch8_darvis;

public class Ex8_6_SavingsAccountClassTest {
    public static void main(String[] args){
        Ex8_6_SavingsAccountClass saver1 = new Ex8_6_SavingsAccountClass(2000.00);
        Ex8_6_SavingsAccountClass saver2 = new Ex8_6_SavingsAccountClass(3000.00);

        Ex8_6_SavingsAccountClass.modifyInterestRate(0.04f);

        System.out.printf("Баланс Дмитрия: %s\n", saver1.toString()+"$");
        System.out.printf("Баланс Леонида: %s\n", saver2.toString()+"$");
        System.out.println();

        for(int i=0; i<12; i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        System.out.printf("Месячный Баланс Дмитрия + 4%%: %s\n", saver1.toString()+"$");
        System.out.printf("Месячный Баланс Леонида + 4%%: %s\n", saver2.toString()+"$");

        Ex8_6_SavingsAccountClass.modifyInterestRate(0.05f);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("Месячный Баланс Дмитрия + 5%%: %s\n", saver1.toString()+"$");
        System.out.printf("Месячный Баланс Леонида + 5%%: %s\n", saver2.toString()+"$");


    }
}
