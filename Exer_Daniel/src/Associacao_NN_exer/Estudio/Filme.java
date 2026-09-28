package Associacao_NN_exer.Estudio;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private List<Atuacao> atuacoes;

    public Filme(String titulo) {
        this.titulo = titulo;
        this.atuacoes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Atuacao> getAtuacoes() {
        return atuacoes;
    }

    // Passo 3: Método para adicionar a atuação na lista do Estudio.Filme
    public void adicionarAtuacao(Atuacao atuacao) {
        if (!this.atuacoes.contains(atuacao)) {
            this.atuacoes.add(atuacao);
        }
    }
}
