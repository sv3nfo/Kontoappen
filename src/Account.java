public class Account {
    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Computer says no!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Computer says no! Beloppet måste vara större än 0.");
        } else if (amount > balance) {
            System.out.println("Computer says no! Pengarna räcker inte.");
        } else {
            balance -= amount;
        }
    }
}