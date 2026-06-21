package task16;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account acc1 = new Account(1, "BY123", "BYN", 1000.0);
        Account acc2 = new Account(2, "BY456", "BYN", 500.0);
        Account acc3 = new Account(3, "BY789", "USD", 200.0); // другая валюта
        Account acc4 = new Account(4, "BY012", "BYN", 800.0);
        Account acc5 = new Account(5, "BY345", "BYN", 300.0);

        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);
        bank.addAccount(acc4);
        bank.addAccount(acc5);

        System.out.println("Баланс до переводов:");
        printBalance(acc1);
        printBalance(acc2);
        printBalance(acc3);
        System.out.println();

        // Тест 1: успешный перевод
        performTransfer(bank, "BY123", "BY456", 200.0);

        // Тест 2: перевод с несуществующего счёта
        performTransfer(bank, "BY999", "BY456", 100.0);

        // Тест 3: перевод на несуществующий счёт
        performTransfer(bank, "BY123", "BY999", 100.0);

        // Тест 4: недостаточно средств
        performTransfer(bank, "BY789", "BY456", 300.0);

        // Тест 5: перевод в другой валюте
        performTransfer(bank, "BY789", "BY456", 100.0);

        // Тест 6: отрицательная сумма
        performTransfer(bank, "BY123", "BY456", -50.0);

        System.out.println("\nБаланс после переводов:");
        printBalance(acc1);
        printBalance(acc2);
        printBalance(acc3);
    }

    private static void performTransfer(Bank bank, String from, String to, Double amount) {
        try {
            bank.transferMoney(from, to, amount);
            System.out.printf("Перевод %.2f BYN со счёта %s на счёт %s выполнен успешно%n", amount, from, to);
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка");
            System.out.println();
        }
    }

    private static void printBalance(Account account) {
        System.out.printf("Счёт %s: %.2f %s%n",
                account.getAccountNumber(),
                account.getAmount(),
                account.getCurrency());
    }
}
