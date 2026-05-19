class BankApp {
    private String accountHolder;
    private double balance;

    public void setAccountHolder(String name) {
        accountHolder = name;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(accountHolder + " deposit " + amount);
            System.out.println("Total balance: " + balance);
        } else {
            System.out.println("Invalid deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println(accountHolder + " withdraw " + amount);
            System.out.println("Total balance: " + balance);
        } else {
            System.out.println("Invalid deposit");
        }
    }
}

public class encapsulation3 {
    public static void main(String[] args) {
        BankApp b = new BankApp();
        b.setAccountHolder("radhika");
        b.deposit(50000);
        b.withdraw(2000);

    }
}
