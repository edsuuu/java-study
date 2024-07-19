package entities;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public void aumentarSalarioPorPorcentagem(double porcentagem) { // this é opcional
        this.salary += this.salary * porcentagem / 100.0;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", name: " + name + '\'' +
                ", salary: " + salary;
    }
}
