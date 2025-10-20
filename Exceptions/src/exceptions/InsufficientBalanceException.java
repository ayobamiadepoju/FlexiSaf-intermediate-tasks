package exceptions;

public class InsufficientBalanceException extends Exception{

    private double amount;

    public InsufficientBalanceException(String message){
        super(message);
    }

    public InsufficientBalanceException(double amount){
        super("Insufficient balance. Attempted to withdraw: ₦" + amount);
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
}