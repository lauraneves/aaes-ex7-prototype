package src;

import java.util.HashMap;
import java.util.Map;

public class TransactionManager {
    private final Map<String, Transaction> transactions = new HashMap<>();

    public TransactionManager() {
        transactions.put("Deposito", new Deposit(0));
        transactions.put("Saque", new Withdraw(0));
    }

    public void addTransaction(String type, double value) {
        Transaction transaction;
        try {
            transaction = (Transaction) transactions.get(type).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        transaction.value = value;
        transaction.showDetails();
    }
}
