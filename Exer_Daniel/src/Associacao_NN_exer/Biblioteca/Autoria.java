package Associacao_NN_exer.Biblioteca;

public class Autoria {
    private Livro livro;
    private Autor autor;
    private String papel;

    // Passo 2: Construtor referenciando Biblioteca.Livro, Biblioteca.Biblioteca.Autor e o atributo papel
    public Autoria(Livro livro, Autor autor, String papel) {
        this.livro = livro;
        this.autor = autor;
        this.papel = papel;
    }

    public Livro getLivro() {
        return livro;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getPapel() {
        return papel;
    }

    // Passo 4: Método estático que centraliza a criação e sincroniza as duas pontas
    public static Autoria autorar(Livro livro, Autor autor, String papel) {
        // 1. Cria a instância de Biblioteca.Autoria
        Autoria novaAutoria = new Autoria(livro, autor, papel);

        // 2. Sincroniza adicionando a autoria no livro e no autor
        livro.adicionarAutoria(novaAutoria);
        autor.adicionarAutoria(novaAutoria);

        return novaAutoria;
    }
}

