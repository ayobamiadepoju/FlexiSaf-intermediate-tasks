import exceptions.InsufficientBalanceException;
import exceptions.InvalidAmountException;

public class Main {
    public static void main(String[] args) throws InvalidAmountException {

        System.out.println("BANKING SYSTEM\n");

        BankAccount user1 = new BankAccount("ACC001", "Osayi John", 20000.00);
        BankAccount user2 = new BankAccount("ACC0002", "Tinuke Jade", 50000.00);
        BankAccount user3 = new BankAccount("ACC003", "Favour Jite", 0.00);

        System.out.println();

        user1.getAccountBalance();
        System.out.println();

        user1.deposit(5000.00);
        user1.withdraw(100_000.00);
        user1.displayAccountInfo();
        System.out.println();

        user1.transfer(user2, 5000.00);
        user2.withdraw(2000.00);
        user2.transfer(user1, 100000.00);
        System.out.println();
        user2.displayAccountInfo();
    }
}