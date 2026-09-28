package Associacao_NN_exer.Estudio;

public class Atuacao {
    private Ator ator;
    private Filme filme;
    private String personagem;

    // Passo 2: Construtor referenciando Estudio.Estudio.Ator, Estudio.Filme e o atributo personagem
    public Atuacao(Ator ator, Filme filme, String personagem) {
        this.ator = ator;
        this.filme = filme;
        this.personagem = personagem;
    }

    public Ator getAtor() {
        return ator;
    }

    public Filme getFilme() {
        return filme;
    }

    public String getPersonagem() {
        return personagem;
    }

    // Passo 4: Método estático que cria a Estudio.Atuacao e sincroniza as duas pontas
    public static Atuacao atuar(Ator ator, Filme filme, String personagem) {
        // 1. Cria a instância de Estudio.Atuacao
        Atuacao novaAtuacao = new Atuacao(ator, filme, personagem);

        // 2. Sincroniza adicionando a atuação no ator e no filme
        ator.adicionarAtuacao(novaAtuacao);
        filme.adicionarAtuacao(novaAtuacao);

        return novaAtuacao;
    }
}

