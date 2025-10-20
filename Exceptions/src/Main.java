import exceptions.InsufficientBalanceException;
import exceptions.InvalidAmountException;

public class Main {
    public static void main(String[] args) throws InvalidAmountException, InsufficientBalanceException {

        System.out.println("BANKING SYSTEM DEMO\n");

        BankAccount user1 = new BankAccount("ACC001", "Osayi John", 20000.00);

        System.out.println();

        user1.getAccountHolder();
        user1.getAccountNumber();
        user1.getBalance();
        user1.deposit(5000.00);
        user1.withdraw(1000.00);
        user1.displayAccountInfo();
    }
}