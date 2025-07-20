package DailyJavaTraining;

public class BankAccount {
    int account_number;
    int balance;
    Customer owner;

    public BankAccount(int account_number) {
        this.account_number = account_number;
        this.balance = 0;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

