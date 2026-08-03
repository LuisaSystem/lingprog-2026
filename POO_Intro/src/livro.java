public class livro{
    // variaveis de classe (colocar o statics)
    static boolean qtdLivros = false;
    static final double cod = 0.0;

    //variáveis de instância
    String titulo;
    String autor;
    boolean disponivel;

    //Construtor padrão
    public livro (){
        this("Livro não cadastrado", "Autor não cadastrado", false);
    }

    public livro(String titulo, String autor, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    //metodos de instância
    public void codLivro(double cod){
        if (cod >= 500.0) cod = '!';
    }

    public void exibirLivro(){
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Dispponivel?: "+ disponivel);
    }

    //metodos de classe (static)
    public static boolean getDisponibili(){
        return qtdLivros;
    }

    public static double getCodigos(){
        return cod;
    }

}
//------------------------------------------------------------------------------------------











