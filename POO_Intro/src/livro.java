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
        this("Livro não cadastrado", "Autor não cadastrado", true);
    }

    public livro(String titulo, String autor, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
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

    //metodos de classe (static)
    public static boolean getDisponibili(){
        return qtdLivros;
    }

    public static double getCodigos(){
        return cod;
    }

}
//------------------------------------------------------------------------------------------
class biblioteca {
    public static void main(String[] args){
        //criando objetos (istancias) a partir da classe -> construtor padrão
        livro li1 = new livro("O pequeno príncipe", "Saint-Exupéry", false);
        livro li2 = new livro("Memória de Brás Cubas", "Machado de Assis", true);
        livro li3 = new livro("As Proveções de Apolo", "Rick Riodan", true);
        livro li4 = new livro();

        // chamar os métodos de instância
        li1.codLivro(2.3);
        li1.exibirLivro();

        li2.codLivro(92.7);
        li2.exibirLivro();

        li3.codLivro(56.3);
        li3.exibirLivro();

        li4.exibirLivro();

        // == == de classe (static) pelo nome da classe
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Livros disponiveis?: " + livro.getDisponibili());
        System.out.println("Codigo dos livros: " + livro.getCodigos());

    }

}










