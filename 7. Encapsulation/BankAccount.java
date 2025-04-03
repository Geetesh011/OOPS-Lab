
// Encapsulation Example 2: Encapsulation with Constructor
class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = (balance >= 0) ? balance : 0.0;
        if (balance < 0) { System.out.println("Initial balance cannot be negative. Setting balance to $0.0"); }
    }

    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) { balance += amount; }
        else { System.out.println("Deposit amount must be positive"); }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) { balance -= amount; }
        else { System.out.println("Invalid withdrawal amount"); }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1000.0);
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: $" + account.getBalance());

        account.deposit(500.0);
        System.out.println("Balance after deposit: $" + account.getBalance());

        account.withdraw(300.0);
        System.out.println("Balance after withdrawal: $" + account.getBalance());
    }
}
