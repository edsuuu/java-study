package veiculos;

public abstract class VeiculoMotorizadoAbstrata implements VeiculoInterface {
    // Classes abstratas podem ter atributos e métodos implementados, 
    // mas não podem ser instanciadas diretamente (new VeiculoMotorizado() é proibido).
    
    protected int combustivel = 0;
    protected String modelo; // Atributo comum que subiu para a classe pai

    // Construtor da classe pai
    public VeiculoMotorizadoAbstrata(String modelo) {
        this.modelo = modelo;
    }

    // Método concreto (já implementado) que será herdado por todos os veículos motorizados
    public void abastecer(int quantidade) {
        if (quantidade < 0) {
            // "Jogamos" um erro que obriga quem chamou o método a tratar ou parar a execução
            throw new IllegalArgumentException("A quantidade de combustível não pode ser negativa!");
        }
        this.combustivel += quantidade;
        System.out.println("Abastecendo " + quantidade + " litros. Total: " + this.combustivel + "L.");
    }

    // Método abstrato: a classe pai apenas declara, e as classes filhas 
    // são OBRIGADAS a implementar como isso será feito.
    public abstract void ligar();
}
