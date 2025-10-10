import java.util.HashMap;

public class Bank {

    private String name;
    private HashMap<Integer, Account> accounts = new HashMap<>();

    public Bank(String name) {
        this.name = name;
    }

    public void openAccount(String owner, String currency) {
        int randomid = 0;
        while (randomid == 0 || this.accounts.containsKey(randomid)) {
            randomid = (int)(Math.random() * 1000000);
        }
        Account newlyAccount = new Account(owner, currency, randomid);
        accounts.put(randomid, newlyAccount);
    }


    public class Account {
        String ownerName;
        String currency;
        int accountNumber;
        double balance = 0.0;

        private Account(String name, String currency, int accnumber) {
            this.ownerName = name;
            this.currency = currency;
            this.accountNumber = accnumber;
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit amount must be positive");
            }
            this.balance += amount;
            System.out.println("You've deposited " + amount + this.currency + ". You have now " + this.balance + this.currency + " in your account.");
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive");
            } else if (amount > this.balance) {
                throw new IllegalArgumentException("You can't withdrawal more than you own. We don't issue credits yet.");
            }
            this.balance -= amount;
            System.out.println("You've withdrawn " + amount + this.currency + ". You now have " + this.balance + this.currency + " in your account.");
        }    
    }

}
