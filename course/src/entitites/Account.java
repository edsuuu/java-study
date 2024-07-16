package entitites;

public class Account {
    private String person;
    private Double balance;

    public Account(String person, double balance) {
        this.person = person;
        this.balance = balance;
    }

    public String getPerson() {
        return person;
    }

    public void deposito(double amount) {}

}