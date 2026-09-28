package Composicao_Agrecacao.Escola;

public class Professor {
    // Atributos private
    private String nome;
    private String especialidade;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // Getters obrigatórios
    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
