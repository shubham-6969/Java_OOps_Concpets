/* Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, 
and CurrentAccount. The bank should have a list of accounts and methods for adding them. 
Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances.
 SavingsAccount and CurrentAccount should implement the 
 Account interface and have their own unique methods. */

 import java.util.ArrayList;
 import java.util.List;
 
 interface Account {
     void deposit(double amount);
     void withdraw(double amount);
     double getBalance(); 
 }
 
 class SavingsAccount implements Account {
     private double balance;
     private double interestRate;
 
     public SavingsAccount(double initialDeposit, double interestRate) {
         this.balance = initialDeposit;
         this.interestRate = interestRate;
     }
 
     @Override
     public void deposit(double amount) {
         balance += amount;
     }
 
     @Override
     public void withdraw(double amount) {
         balance -= amount;
     }
 
     @Override
     public double getBalance() {
         return balance;
     }
 
     public void applyInterest() {
         balance += balance * interestRate / 100;
     }
 }
 
 class CurrentAccount implements Account {
     private double balance;
     private double overdraftLimit;
 
     public CurrentAccount(double initialDeposit, double overdraftLimit) {
         this.balance = initialDeposit;
         this.overdraftLimit = overdraftLimit;
     }
 
     @Override
     public void deposit(double amount) {
         balance += amount;
     }
 
     @Override
     public void withdraw(double amount) {
         if (balance + overdraftLimit >= amount) {
             balance -= amount;
         } else {
             System.out.println("Insufficient funds including overdraft limit.");
         }
     }
 
     @Override
     public double getBalance() {
         return balance;
     }
 
     public void setOverdraftLimit(double overdraftLimit) {
         this.overdraftLimit = overdraftLimit;
     }
 }
 
 class Bank {
     private List<Account> accounts;
 
     public Bank() {
         accounts = new ArrayList<>();
     }
 
     public void addAccount(Account account) {
         accounts.add(account);
     }
 
     public void removeAccount(Account account) {
         accounts.remove(account);
     }
 
     public void deposit(Account account, double amount) {
         account.deposit(amount);
     }
 
     public void withdraw(Account account, double amount) {
         account.withdraw(amount);
     }
 
     public void printAccountBalances() {
         for (Account account : accounts) {
             System.out.println("Account Balance: $" + account.getBalance());
         }
     }
 }
 
 public class BankSystem {
     public static void main(String[] args) {
         Bank bank = new Bank();
 
         SavingsAccount savingsAccount = new SavingsAccount(1000.0, 1.25);
         System.out.println("Savings Account:\nInitial Deposit: $1000.00\nInterest rate: 1.25%");
         
         // Create a CurrentAccount with an initial deposit and overdraft limit
         CurrentAccount currentAccount = new CurrentAccount(5000.0, 1000.0);
         System.out.println("\nCurrent Account:\nInitial Deposit: $5000.00\nOverdraft Limit: $1000.00");
         
         // Add the SavingsAccount and CurrentAccount to the bank
         bank.addAccount(savingsAccount);
         bank.addAccount(currentAccount);
         
         System.out.println("\nNow deposit $100 to Savings Account.");
         // Deposit $100 into the SavingsAccount
         bank.deposit(savingsAccount, 100.0);
         
         System.out.println("Now deposit $500 to Current Account.");
         // Deposit $500 into the CurrentAccount
         bank.deposit(currentAccount, 500.0);
         
         System.out.println("Withdraw $150 from Savings Account.\n");
         // Withdraw $150 from the SavingsAccount
         bank.withdraw(savingsAccount, 150.0);
         
         System.out.println("\nSavings A/c and Current A/c.:");
         // Print the balances of all accounts in the bank
         bank.printAccountBalances();
         
         // Apply interest to the SavingsAccount
         savingsAccount.applyInterest();
         
         System.out.println("\nAfter applying interest on Savings A/c for 1 year:");
         System.out.println("Savings A/c and Current A/c.:");
         
         // Print the balances of all accounts in the bank after applying interest
         bank.printAccountBalances();
     }
 }
 