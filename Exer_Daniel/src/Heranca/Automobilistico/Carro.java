package Heranca.Automobilistico;

// Passo 3: Heranca.Automobilistico.Carro extends Heranca.Automobilistico.Veiculo
public class Carro extends Veiculo {
    private int numeroPortas;

    // Passo 3: Construtor que chama o super(marca, ano)
    public Carro(String marca, int ano, int numeroPortas) {
        super(marca, ano); // Passa os dados para o construtor da classe pai (Heranca.Automobilistico.Veiculo)
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }
}
