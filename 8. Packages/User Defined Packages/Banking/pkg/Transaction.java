package pkg;

public class Transaction {
    public void transfer(Account from, Account to, double amount) {
        if (from.getBalance() >= amount) {
            from.deposit(-amount);
            to.deposit(amount);
        }
    }
}
