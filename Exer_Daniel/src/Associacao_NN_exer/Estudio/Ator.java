package Associacao_NN_exer.Estudio;

import java.util.ArrayList;
import java.util.List;

public class Ator {
    private String nome;
    private List<Atuacao> atuacoes;

    public Ator(String nome) {
        this.nome = nome;
        this.atuacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Atuacao> getAtuacoes() {
        return atuacoes;
    }

    // Passo 3: Método para adicionar a atuação na lista do Estudio.Estudio.Ator
    public void adicionarAtuacao(Atuacao atuacao) {
        if (!this.atuacoes.contains(atuacao)) {
            this.atuacoes.add(atuacao);
        }
    }
}
