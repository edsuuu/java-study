package veiculos;

// Carro é uma classe concreta. Ela HERDA de VeiculoMotorizado e, 
// consequentemente, precisa IMPLEMENTAR os métodos obrigatórios da interface Veiculo.
public class CarroClasse extends VeiculoMotorizadoAbstrata {
    
    public CarroClasse(String modelo) {
        // O super() chama o construtor da classe pai (VeiculoMotorizadoAbstrata)
        // Ele deve ser SEMPRE a primeira instrução dentro do construtor da classe filha!
        super(modelo);
        System.out.println("O construtor foi chamado! O objeto Carro (modelo: " + this.modelo + ") acabou de ser criado.");
    }

    public void exibirDetalhes() {
        System.out.println("O modelo do carro é: " + this.modelo);
        ligarMotorInterno();
    }

    private void ligarMotorInterno() {
        System.out.println("Motor do " + this.modelo + " ligado internamente! Vrum vrum...");
    }

    // Como mudamos o pacote, se quisermos acessar isso no Main, 
    // precisaremos torná-lo public, mas como o exercício pedia protected,
    // ele ficará acessível apenas para subclasses ou classes no mesmo pacote (veiculos).
    protected void buzinar() {
        System.out.println(this.modelo + " está buzinando: Biii biii!");
    }

    // A anotação @Override indica que estamos sobrescrevendo/implementando um método de uma interface/pai
    @Override
    public void acelerar() {
        if (this.combustivel > 0) {
            System.out.println(this.modelo + " está acelerando! Vrummmm!!!");
            this.combustivel--; // Consome combustível ao acelerar
        } else {
            System.out.println(this.modelo + " não pode acelerar, está sem combustível!");
        }
    }

    @Override
    public void frear() {
        System.out.println(this.modelo + " acionou os freios! Srrrshhhh...");
    }

    // Implementação OBRIGATÓRIA do método abstrato exigido pela classe pai (VeiculoMotorizadoAbstrata)
    @Override
    public void ligar() {
        System.out.println("Girando a chave do carro " + this.modelo + " para ligar o motor!");
    }
}
