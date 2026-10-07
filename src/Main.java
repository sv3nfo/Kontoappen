public class Main {
    public static void main(String[] args) {
        System.out.println("Kontoappen startar...");

        // Testkonto
        Account account = new Account("Kimpa", 1000.0);
        System.out.println(account.getOwner());
        System.out.println(account.getBalance());

        account.deposit(200.0);
        System.out.println(account.getBalance());

        // Negativt belopp = nekas, saldot = oförändrat
        account.deposit(-100.0);
        System.out.println(account.getBalance());

        account.withdraw(200.0);
        System.out.println(account.getBalance());

        // För stort uttag = nekas, saldot = oförändrat
        account.withdraw(2000.0);
        System.out.println(account.getBalance());

        // Registret skapar kontona och håller dem i sin lista
        AccountRegister register = new AccountRegister();
        register.createAccount("Kimpa", 1000.0);
        register.createAccount("Bosse", 2000.0);
        register.printAll();

        // Sökningen returnerar kontot (Kimpa), eller null om inget matchar
        Account found = register.findAccount("Kimpa");

        // found är null om kontot saknas - då ska kontot inte användas
        if (found != null) {
            System.out.println(found.getOwner() + ": " + found.getBalance());
        } else {
            System.out.println("Kontot finns inte.");
        }

        // Samma variabel används igen, men för ett namn som inte finns
        found = register.findAccount("Saknas");

        if (found != null) {
            System.out.println(found.getOwner() + ": " + found.getBalance());
        } else {
            System.out.println("Kontot finns inte.");
        }
    }
}
