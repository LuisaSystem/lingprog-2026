package Composicao_Agrecacao.Escola;

public class Turma {
    private String nome;
    private Professor professor; // Referência ao Composicao_Agrecacao.Escola.Professor (associação simples)

    // Passo 2: Construtor que recebe o nome e a referência do Composicao_Agrecacao.Escola.Professor de fora
    public Turma(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    // Passo 3: Método getProfessor() devolvendo o professor responsável
    public Professor getProfessor() {
        return professor;
    }
}
