package Composicao_Agrecacao.Futebol;

public class Jogador {
    private String nome;
    private int numeroCamisa;

    // Construtor padrão da agregação
    public Jogador(String nome, int numeroCamisa) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }
}
