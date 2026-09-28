package Heranca.Automobilistico;

public class Veiculo {
    // Passo 1: Atributos protected
    protected String marca;
    protected int ano;

    // Passo 1: Construtor que recebe os dois atributos
    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    // Passo 2: Método exibirDados()
    public void exibirDados() {
        System.out.println("Marca: " + marca + " | Ano: " + ano);
    }
}
