package exceptions;

public class AccountNotFoundException extends Exception{

    public AccountNotFoundException(String accountNumber) {
        super("Account Not Found: " + accountNumber);
    }
}