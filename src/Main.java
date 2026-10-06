public class Main {
    public static void main(String[] args) {
        System.out.println("Kontoappen startar...");

        Account account = new Account("Kim", 1000.0);
        System.out.println(account.getOwner());
        System.out.println(account.getBalance());

        account.deposit(200.0);
        System.out.println(account.getBalance());

        account.deposit(-100.0);
        System.out.println(account.getBalance());

        account.withdraw(200.0);
        System.out.println(account.getBalance());

        account.withdraw(2000.0);
        System.out.println(account.getBalance());
    }
}
