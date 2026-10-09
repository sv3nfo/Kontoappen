import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kontoappen startar...");

        // Registret skapar kontona och håller dem i sin lista
        AccountRegister register = new AccountRegister();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("1. Skapa konto");
            System.out.println("2. Lista konton");
            System.out.println("3. Sätt in pengar");
            System.out.println("4. Ta ut pengar");
            System.out.println("5. Avsluta");
            System.out.println("Val: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                scanner.nextLine();
                System.out.println("Ägare: ");
                String owner = scanner.nextLine();
                System.out.print("Startbelopp: ");
                double startBalance = scanner.nextDouble();
                register.createAccount(owner, startBalance);
            } else if (choice == 2) {
                register.printAll();
            } else if (choice == 3) {
                scanner.nextLine();
                System.out.print("Ägare: ");
                String owner = scanner.nextLine();
                Account found = register.findAccount(owner);
                if (found != null) {
                    System.out.print("Belopp: ");
                    double amount = scanner.nextDouble();
                    found.deposit(amount);
                    System.out.println("Saldo: " + found.getBalance());
                } else {
                    System.out.println("Konto saknas.");
                }
            } else if (choice == 4) {
                scanner.nextLine();
                System.out.print("Ägare: ");
                String owner = scanner.nextLine();
                Account found = register.findAccount(owner);
                if (found != null) {
                    System.out.print("Belopp: ");
                    double amount = scanner.nextDouble();
                    found.withdraw(amount);
                    System.out.println("Saldo: " + found.getBalance());
                } else {
                    System.out.println("Konto saknas.");
                }
            } else if (choice == 5) {
                System.out.println("Avslutar...");
            } else {
                System.out.println("Ogiltigt val. Försök igen.");
            }
        }
        System.out.println("Hej då.");
    }
}
