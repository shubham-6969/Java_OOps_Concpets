/* 3. Write a Java program to create an abstract class BankAccount
 with abstract methods deposit() and withdraw(). 
Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class 
and implement the respective methods to handle deposits and withdrawals for each account type.
 * 
 */

 abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
   
    // Creating getter and setter

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
}

public class HDFC {
    public static void main(String[] args) {
        double ibal, damt, wamt;

        ibal = 235000.00;
        SavingsAccount savingsAccount = new SavingsAccount("SA002", ibal);
        System.out.println("Savings A/c: Initial Balance: $" + ibal);

        damt = 43000.78;
        savingsAccount.deposit(damt);

        wamt = 23000.65;
        savingsAccount.withdraw(wamt);

        System.out.println("\nTry to withdraw: $" + wamt);
        savingsAccount.withdraw(wamt);

        System.out.println();

        ibal = 1240000.65;
        CurrentAccount currentAccount = new CurrentAccount("CA20032", ibal);

        damt = 54300.54;
        currentAccount.deposit(damt);

        wamt = 13000.40;
        currentAccount.withdraw(wamt);

        System.out.println("\nTry to withdraw: $" + wamt);
        currentAccount.withdraw(wamt);
    }
}
