package Heranca.Automobilistico;

// Passo 4: Moto extends Heranca.Automobilistico.Veiculo
public class Motor extends Veiculo {
    private int cilindradas;

    // Passo 4: Construtor que também chama o super(marca, ano)
    public Motor(String marca, int ano, int cilindradas) {
        super(marca, ano); // Passa os dados para o construtor da classe pai (Heranca.Automobilistico.Veiculo)
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }
}
