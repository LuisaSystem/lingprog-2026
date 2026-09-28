package Composicao_Agrecacao.Escola;

public class MainIII {
    public static void main(String[] args) {
        // Criando o objeto Composicao_Agrecacao.Escola.Professor de forma independente
        Professor prof = new Professor("Dr. Alan Turing", "Ciência da Computação");

        // Passo 2: Criando a Composicao_Agrecacao.Escola.Turma e passando o professor no construtor
        Turma turma = new Turma("3º Ano A - POO", prof);

        // Passo 3: Recuperando e imprimindo os dados através do getProfessor()
        System.out.println("Composicao_Agrecacao.Escola.Turma: " + turma.getNome());
        System.out.println("Composicao_Agrecacao.Escola.Professor responsável: " + turma.getProfessor().getNome());
        System.out.println("Especialidade: " + turma.getProfessor().getEspecialidade());
    }
}
