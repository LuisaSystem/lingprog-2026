public class livro{

    //variáveis de instância
    public String titulo;
    public String autor;
    public boolean disponivel;

    //método construtor
    public livro (){
        this("Livro não cadastrado", "Autor não cadastrado");
    }

    public livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    //metodos de instância
    public void nopeYes(boolean disponivel){
        if (disponivel == true){
            System.out.println("check!");
        }

        if(!disponivel){
            System.out.println("not check!");
        }
    }

    public void codLivro(double cod){
        if (cod > 500.0) System.out.println("Código limite!");
    }

    public void exibirLivro(){
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Dispponivel?: "+ disponivel);
    }

}










