package DailyJavaTraining;

import java.util.ArrayList;



public class Customer {
    String name;
    String email;
    ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addAccount(BankAccount account) {
        bankAccounts.add(account);
        account.owner = this;
    }

    public boolean withdrawFromAccount(int accountNumber, int amount) {
        for (BankAccount account : bankAccounts) {
            if (account.account_number == accountNumber) {
                return account.withdraw(amount);
            }
        }
        return false;
    }
}

