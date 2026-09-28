package Associacao_NN_exer.Biblioteca;

public class Biblioteca {
    public static void main(String[] args) {
        // Criando os objetos principais
        Livro livro1 = new Livro("Java: Como Programar");
        Autor autor1 = new Autor("Deitel");

        // Utilizando o método estático para vincular e sincronizar
        Autoria.autorar(livro1, autor1, "autor principal");

        // Testando se ambos os lados foram atualizados
        System.out.println("Biblioteca.Livro: " + livro1.getTitulo());
        System.out.println("Autores deste livro:");
        for (Autoria a : livro1.getAutorias()) {
            System.out.println("- " + a.getAutor().getNome() + " (" + a.getPapel() + ")");
        }

        System.out.println("\nBiblioteca.Biblioteca.Autor: " + autor1.getNome());
        System.out.println("Livros deste autor:");
        for (Autoria a : autor1.getAutorias()) {
            System.out.println("- " + a.getLivro().getTitulo() + " (" + a.getPapel() + ")");
        }
    }
}

