

import pkg.Account;
import pkg.Transaction;

public class BankExample {
    public static void main(String[] args) {
        Account acc1 = new Account("1001", 1000.0);
        Account acc2 = new Account("1002", 500.0);
        Transaction trans = new Transaction();
        
        System.out.println("Before: Acc1: " + acc1.getBalance() + ", Acc2: " + acc2.getBalance());
        trans.transfer(acc1, acc2, 300.0);
        System.out.println("After: Acc1: " + acc1.getBalance() + ", Acc2: " + acc2.getBalance());
    }
}
