package Opgave3;

public class Main {

    public static void main () {
        BankAccount account = new BankAccount("Jakob", 500);

        account.deposit(200);
        account.withdraw(500);
        account.deposit(400);
        account.deposit(100);
        account.withdraw(200);

        account.printTransactionHistory();

        System.out.println(account.getBalance());
    }
}
