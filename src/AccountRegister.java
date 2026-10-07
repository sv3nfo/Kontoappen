import java.util.List;
import java.util.ArrayList;

public class AccountRegister {
    // Listan innehåller registrets konton
    private List<Account> accounts = new ArrayList<>();

    // Factory-metoden skapar ett konto och lägger det i listan
    public void createAccount(String owner, double startBalance) {
        Account account = new Account(owner, startBalance);
        accounts.add(account);
    }

    // Går igenom listan och skriver ut varje kontos ägare och saldo
    public void printAll() {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            System.out.println(account.getOwner() + ": " + account.getBalance());
        }
    }

    // Söker efter ägarnamn, stora och små bokstäver räknas som samma
    public Account findAccount(String owner) {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.getOwner().equalsIgnoreCase(owner)) {
                // Första matchande kontot returneras och sökningen avslutas
                return account;
            }
        }
        // Ingen matchning i listan = null
        return null;
    }
}