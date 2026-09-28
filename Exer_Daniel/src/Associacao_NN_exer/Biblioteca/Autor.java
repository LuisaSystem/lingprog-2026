package Associacao_NN_exer.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private List<Autoria> autorias;

    public Autor(String nome) {
        this.nome = nome;
        this.autorias = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Autoria> getAutorias() {
        return autorias;
    }

    // Passo 3: Método para adicionar a autoria na lista do Biblioteca.Biblioteca.Autor
    public void adicionarAutoria(Autoria autoria) {
        if (!this.autorias.contains(autoria)) {
            this.autorias.add(autoria);
        }
    }
}
