package src;

public class Main {
    public static void main(String[] args) {
        TransactionManager manager = new TransactionManager();

        manager.addTransaction("Deposito", 100.0);
        manager.addTransaction("Saque", 50.0);
    }
}
