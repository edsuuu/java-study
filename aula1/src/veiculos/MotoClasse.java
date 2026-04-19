package veiculos;

public class MotoClasse extends VeiculoMotorizadoAbstrata {
    
    public MotoClasse(String modelo) {
        // O super() repassa o modelo para o construtor da classe pai inicializar
        super(modelo);
    }

    @Override
    public void acelerar() {
        if (this.combustivel > 0) {
            System.out.println("Moto " + this.modelo + " acelerando! Randandandan!");
            this.combustivel--; 
        } else {
            System.out.println("Moto " + this.modelo + " não tem combustível para acelerar!");
        }
    }

    @Override
    public void frear() {
        System.out.println("Moto " + this.modelo + " acionando os freios a disco!");
    }

    // Implementação OBRIGATÓRIA do método abstrato exigido pela classe pai (VeiculoMotorizadoAbstrata)
    @Override
    public void ligar() {
        System.out.println("Dando partida no botão/pedal da moto " + this.modelo + "!");
    }
}
