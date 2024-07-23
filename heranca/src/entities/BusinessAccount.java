package entities;

public class BusinessAccount extends Account {
    private Double limiteEmprestimo;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double limiteEmprestimo) {
        super(number, holder, balance);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLoanLimit() {
        return limiteEmprestimo;
    }

    public void setLoanLimit(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double amount) {
        if (amount <= limiteEmprestimo) {
            balance += amount - 10.0;
//            deposit(amount);
        }
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
