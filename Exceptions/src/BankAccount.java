import exceptions.AccountNotFoundException;
import exceptions.InsufficientBalanceException;
import exceptions.InvalidAmountException;

public class BankAccount {

    private final String accountNumber;
    private final String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;

        try{
            if(initialBalance <= 0){
                throw new InvalidAmountException("Initial balance cannot be negative");
            }
            this.balance = initialBalance;
            System.out.println("Account created for " + accountHolder + " with balance: ₦" + balance);
        }
        catch (InvalidAmountException e){
            System.out.println("Account creation failed: " + e.getMessage());
            this.balance = 0;
        }
    }

    public void getAccountBalance() {
        System.out.println("Current balance for " + accountHolder + ": ₦" + balance);
    }

    public void deposit(double amount) {
        try {
            if (amount <= 0) {
                throw new InvalidAmountException("Deposit amount must be positive");
            }
            balance += amount;
            System.out.println("Deposited: ₦" + amount);
            System.out.println("New balance: ₦" + balance);
        } catch (InvalidAmountException e) {
            System.out.println("Deposit failed: " + e.getMessage());
        }
    }
    public void withdraw(double amount) {
        try{
            if (amount <= 0) {
                throw new InvalidAmountException("Withdrawal amount must be positive! You tried: " + amount);
            }
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance! You have ₦" + balance + " but tried to withdraw ₦" + amount);
            }
            balance -= amount;
            System.out.println("Withdrew: ₦" + amount + " | Remaining Balance: ₦" + balance);

        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
    }

    public void transfer(BankAccount recipient, double amount) {
        try {
            if (amount <= 0) {
                throw new InvalidAmountException("Transfer amount must be positive");
            }
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance");
            }
            balance -= amount;
            recipient.balance += amount;
            System.out.println("Transferred ₦" + amount + " to " + recipient.accountHolder);
            System.out.println("Your new balance: ₦" + balance);
            } catch (InsufficientBalanceException | InvalidAmountException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }
    }

    public void displayAccountInfo(){
        System.out.println("\nAccount Information"
                + "\nAccount Number:  " + accountNumber
                + "\nAccount Holder: " + accountHolder
                + "\nCurrent Balance: ₦" + balance);
    }
}