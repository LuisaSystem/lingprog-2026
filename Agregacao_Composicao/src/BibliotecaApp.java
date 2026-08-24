public class BibliotecaApp {
    public static void main(String[] args) {
        Livro li1 = new Livro("Java", "Deitel", "Campus", 2022);
        Livro li2 = new Livro("C++", "Gustavo", "Novatec", 2023);
        Livro li3 = new Livro("Python", "Carlos", "Bookman", 2021);

        //criar biblioteca
        biblioteca bi1 = new biblioteca("Boara para cima", "Ruas do limoeiros, 1009");
        //adiocionar livros na biblioteca
        bi1.adicionarLivro(li1);
        bi1.adicionarLivro(li2);
        bi1.adicionarLivro(li3);
        //exibe acervo
        bi1.consultaAcervo();
    }
}
