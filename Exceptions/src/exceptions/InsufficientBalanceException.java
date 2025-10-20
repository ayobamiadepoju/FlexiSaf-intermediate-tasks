package exceptions;

public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(String message){
        super("Insufficient funds");
    }
}