package AbstractionPractice;
abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    // Concrete method: Common functionality for all accounts
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of: " + amount);
        }
    }

    // Abstract method: Different implementations for each account type
    public abstract void calculateInterest();
}

// Subclass: Savings Account
class SavingsAccount extends BankAccount {
    private final double interestRate = 0.05; // 5% annual interest

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Savings Interest Added: " + interest + " | New Balance: " + balance);
    }
}

// Subclass: Current Account
class CurrentAccount extends BankAccount {
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void calculateInterest() {
        // Current accounts typically do not earn interest
        System.out.println("Current Account: No interest applied.");
    }
}

// Main class to demonstrate Runtime Polymorphism
public class Solution03 {
    public static void main(String[] args) {
        // Runtime Polymorphism: Reference is of type BankAccount
        BankAccount mySavings = new SavingsAccount(1000);
        BankAccount myCurrent = new CurrentAccount(1000);

        System.out.println("--- Savings Account Actions ---");
        mySavings.deposit(500);
        mySavings.calculateInterest(); // Calls SavingsAccount's method

        System.out.println("\n--- Current Account Actions ---");
        myCurrent.withdraw(200);
        myCurrent.calculateInterest(); // Calls CurrentAccount's method
    }
}
