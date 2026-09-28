package Associacao_NN_exer.Estudio;

public class Estudio {
    public static void main(String[] args) {
        // Criando os objetos principais
        Ator ator1 = new Ator("Keanu Reeves");
        Filme filme1 = new Filme("The Matrix");

        // Utilizando o método estático para vincular e sincronizar
        Atuacao.atuar(ator1, filme1, "Neo");

        // Testando se ambos os lados foram atualizados
        System.out.println("Estudio.Estudio.Ator: " + ator1.getNome());
        System.out.println("Atuações deste ator:");
        for (Atuacao a : ator1.getAtuacoes()) {
            System.out.println("- Estudio.Filme: " + a.getFilme().getTitulo() + " | Personagem: " + a.getPersonagem());
        }

        System.out.println("\nEstudio.Filme: " + filme1.getTitulo());
        System.out.println("Elenco deste filme:");
        for (Atuacao a : filme1.getAtuacoes()) {
            System.out.println("- Estudio.Estudio.Ator: " + a.getAtor().getNome() + " | Personagem: " + a.getPersonagem());
        }
    }
}
