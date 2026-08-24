import java.util.ArrayList;

public class biblioteca {
    private String nome, endereco;

    //vetor - Associação
    private ArrayList<Livro> livros;

    public biblioteca(){
        this("sem nome", "sem enderço");
    }
    public biblioteca(String nome, String endereco){
        this.setNome(nome); this.setEndereco(endereco);
        //alocar espaço na memória
        livros = new ArrayList<Livro>();
    }

    // adicionar livros - agregação( livro já criado)
    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }

    //Consulta acervo
    public void consultaAcervo(){
        //percorre o vetor de livors
        for(Livro livro : this.livros) { //para cada livro do vetor "livros"
            System.out.println("Nome: " + livro.getTitulo() +
                    " Autor: " + livro.getAutor() +
                    " Editora: " + livro.getEditora() +
                    " Ano: " + livro.getAno());
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void emprestar(String titulo){
        for (Livro livro : this.livros){
            if (livro.getTitulo().equals(titulo)){
                livro.emprestar();// emprestou  o livro
            }
        }
    }
}
