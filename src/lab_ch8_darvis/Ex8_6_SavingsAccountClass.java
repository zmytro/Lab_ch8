package lab_ch8_darvis;

public class Ex8_6_SavingsAccountClass {
    private static double annualInterestRate = 0.0f;
    private double savingsBalance = 0.0f;

    //конструктор
    public Ex8_6_SavingsAccountClass(double savingsBalance){
        setSavingsBalance(savingsBalance);
    }
    //сеттеры
    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    //геттеры
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public static void modifyInterestRate(double newInterestRate){
        if(newInterestRate >= 0.0f)
            annualInterestRate = newInterestRate;
        else
            System.err.println("Ошибка процентной ставки");
    }

    public void calculateMonthlyInterest(){
        double interest = (savingsBalance * annualInterestRate);
        savingsBalance += interest / 12;
    }

    public String toString(){
        return String.format("%.2f", getSavingsBalance());
    }
}
