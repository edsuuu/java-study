package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double taxas;

    public double netSalary() {
        return grossSalary - taxas;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString() {
        return name + ", Salario liquido tirando o imposto R$ " + String.format("%.2f", netSalary());
    }
}
