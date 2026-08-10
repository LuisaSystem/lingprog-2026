public class livro{

    //variáveis de instância
    public String titulo;
    public String autor;
    public boolean disponivel;
    public static int totalivros;

    //método construtor - sobregarga
    public livro (){
        this("Livro não cadastrado", "Autor não cadastrado");
    }

    public livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
        livro.totalivros++;
    }

    //metodo de classe
    public static int getTotalivros(){
        return livro.totalivros;
    }

    //metodos de instância
    public void emprestar(){
        if (this.disponivel){
            this.disponivel = false;
            System.out.println("check!");
        }
        else {
            System.out.println("not check!");
        }
    }
    public void devolver(){
        this.disponivel = true;
        System.out.println("Voltou para casa!");
    }
    public void exibirLivro(){
        System.out.println("\nTitulo: "+ this.titulo +
                " Autor: "+ this.autor +
                " Disponivel? "+(this.disponivel ? "Disponivel": "Emprestado"));
    }

}










