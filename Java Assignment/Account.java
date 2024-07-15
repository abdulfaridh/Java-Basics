import java.util.Scanner;
public class Account {
    private double balance;

    
    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
        }
    }

    
    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
        }
    }

    
    public double getBalance() {
        return balance;
    }

 
    public static void main(String[] args) {
        
        Account myAccount = new Account(100.0); 
        Scanner sc = new Scanner(System.in);
        double withdraw;
        System.out.println("Initial balance: " + myAccount.getBalance());
        System.out.println("enter the amount to be withdraw:");
        withdraw = sc.nextDouble();
        myAccount.debit(withdraw);
        System.out.println("Balance after debit of "+withdraw +":"+ myAccount.getBalance());

    }
}
