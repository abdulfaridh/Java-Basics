public class Savingsaccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public Savingsaccount(double balance) {
        this.savingsBalance = balance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        
        Savingsaccount saver1 = new Savingsaccount(2000.00);
        Savingsaccount saver2 = new Savingsaccount(3000.00);

        
        Savingsaccount.modifyInterestRate(0.04);

      
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver1 balance after 1 month with 4% interest: $" + saver1.getSavingsBalance());
        System.out.println("Saver2 balance after 1 month with 4% interest: $" + saver2.getSavingsBalance());

        Savingsaccount.modifyInterestRate(0.05);

        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver1 balance after 1 month with 5% interest: $" + saver1.getSavingsBalance());
        System.out.println("Saver2 balance after 1 month with 5% interest: $" + saver2.getSavingsBalance());
    }
}
