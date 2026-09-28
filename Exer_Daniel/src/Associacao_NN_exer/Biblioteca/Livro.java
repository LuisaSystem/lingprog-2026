package Associacao_NN_exer.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private List<Autoria> autorias;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.autorias = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Autoria> getAutorias() {
        return autorias;
    }

    // Passo 3: Método para adicionar a autoria na lista do Biblioteca.Livro
    public void adicionarAutoria(Autoria autoria) {
        if (!this.autorias.contains(autoria)) {
            this.autorias.add(autoria);
        }
    }
}

