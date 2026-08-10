public class Biblioteca {
    public static void main(String[] args) {
        // objetos da classe ou instância da classe

        livro l1 = new livro("lol", "Jonas");
        livro l2 = new livro("hur", "Fred Fazbear");
        livro l3 = new livro();

        l1.emprestar();
        l1.exibirLivro();
        l1.devolver();
        l1.exibirLivro();
    }
}
