package task16;

import java.util.Objects;

public class Account {
    private int id;
    private String accountNumber;
    private String currency;
    private Double amount;

    public Account(int id, String accountNumber, String currency, Double amount) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Номер счёта не может быть пустым");
        }
        this.id = id;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.amount = amount;
    }

    // Геттеры
    public int getId() { return id; }
    public String getAccountNumber() { return accountNumber; }
    public String getCurrency() { return currency; }
    public Double getAmount() { return amount; }

    // Сеттер для суммы
    public void setAmount(Double amount) { this.amount = amount; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber);
    }
}
