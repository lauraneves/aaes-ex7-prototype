package src;

public class Deposit extends Transaction {
    public Deposit(double value) {
        this.type = "Depósito";
        this.value = value;
    }

    @Override
    public void showDetails() {
        System.out.println("Tipo: " + type);
        System.out.println("Valor: " + value);
    }
}
