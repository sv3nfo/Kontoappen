public class Account {
    // Ägare och saldo är privata - läses via getters, saldot ändras via metoder
    private String owner;
    private double balance;

    // Konstruktorn ger det nya kontot en ägare och ett startsaldo
    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Getters returnerar kontots uppgifter utan att ändra dem
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    // Positivt belopp = sätts in, annars nekas insättningen
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Computer says no!");
        }
    }

    // Uttag kräver ett positivt belopp som inte är större än saldot
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