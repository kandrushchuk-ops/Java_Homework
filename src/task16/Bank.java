package task16;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма перевода должна быть положительной");
        }

        Account from = accounts.get(accountNumberFrom);
        Account to = accounts.get(accountNumberTo);

        // Проверка 1: если счета не найдены
        if (from == null) {
            throw new AccountNotFoundException("Счёт отправителя не найден", "not.found.account");
        }
        if (to == null) {
            throw new AccountNotFoundException("Счёт получателя не найден", "not.found.account");
        }

        // Проверка валюты
        if (!from.getCurrency().equals("BYN") || !to.getCurrency().equals("BYN")) {
            throw new IllegalArgumentException("Перевод возможен только в валюте BYN");
        }

        // Проверка 2: если денег недостаточно
        if (from.getAmount() < amount) {
            throw new NotEnoughMoneyException("Недостаточно средств", "not.enough.money");
        }

        // Выполняем перевод
        from.setAmount(from.getAmount() - amount);
        to.setAmount(to.getAmount() + amount);
    }
}
