import exceptions.InsufficientBalanceException;
import exceptions.InvalidAmountException;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) throws InvalidAmountException {
        if(initialBalance <= 0){
            throw new InvalidAmountException("Initial balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive! You tried: " + amount);
        }
        balance += amount;
        System.out.println("Deposited: ₦" + amount + " | New Balance: ₦" + balance);
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive! You tried: " + amount);
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance! You have ₦" + balance + " but tried to withdraw ₦" + amount
            );
        }

        balance -= amount;
        System.out.println("Withdrew: ₦" + amount + " | Remaining Balance: ₦" + balance);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void displayAccountInfo(){
        System.out.println("\nAccount Information"
                + "\nAccount Number:  " + accountNumber
                + "/nAccount Holder: " + accountHolder
                + "\nCurrent Balance: ₦" + balance);
    }
}