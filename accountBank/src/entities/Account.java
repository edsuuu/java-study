package entities;

public class Account {
    private final int numberAccount;
    private String namePerson;
    private double balance;

    public Account(int numberAccount, String namePerson) {
        this.numberAccount = numberAccount;
        this.namePerson = namePerson;
    }

    public Account(int numberAccount, String namePerson, double initialDeposity) {
        this.numberAccount = numberAccount;
        this.namePerson = namePerson;
        deposito(initialDeposity);
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public double getBalance() {
        return balance;
    }

    public void deposito(double valor) {
        balance += valor;
    }

    public void saque(double valor) {
        double taxa = 5.00;
        balance -= (valor + taxa);
    }

    public String toString() {
        return "Numero da conta: " + numberAccount + ", Nome da Pessoa: " + namePerson + ", Valor na Conta: R$ " + String.format("%.2f", balance);
    }
}
