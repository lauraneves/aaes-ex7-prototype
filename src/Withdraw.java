package src;

public class Withdraw extends Transaction{
    public Withdraw(double value) {
        this.type = "Saque";
        this.value = value;
    }

    public void showDetails() {
        System.out.println("Tipo: " + type);
        System.out.println("Valor: " + value);
    }
}
