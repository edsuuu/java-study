package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1212, "edsu", 0.0);

        BusinessAccount bacc = new BusinessAccount(1212, "edsu", 0.0, 500.0);

        // upcasting

        Account acc1 = bacc;
        BusinessAccount acc2 = new BusinessAccount(1212, "edsu", 0.0, 500.0);
        Account acc3 = new SavingAccount(1234, "solutions", 0.0, 0.01);

        //downcasting

        BusinessAccount acc4 = acc2;

        acc4.emprestimo(100.0);

//        tipo de erro corrigir com instantOf
        // BusinessAccount acc5 = (BusinessAccount) acc3;

        //VAlidacao 1 - da erro
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.emprestimo(200.0);
            System.out.println("Emprestimo feito");
        }
// validacao 2 pq acc3 é do tipo saving ent faz update
        if (acc3 instanceof SavingAccount) {
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update feito");
        }

    }
}
