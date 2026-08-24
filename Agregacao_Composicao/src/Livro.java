public class Livro {
    private String titulo, autor, editora;
    private int ano;
    private boolean diponivel;
    public Livro(){
        this("sem título", "sem autor", "sem editora", 0);
    }
    public Livro(String titulo, String autor, String editora, int ano){
        this.setTitulo(titulo); this.setAutor(autor);
        this.setEditora(editora); this.setAno(ano);
    }

    //setters getters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return this.autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getEditora() {
        return this.editora;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return this.ano;
    }

    public boolean isDiponivel() {
        return diponivel;
    }

    public void setDiponivel(boolean diponivel) {
        this.diponivel = diponivel;
    }

    public void emprestar(){
        this.diponivel = false;
    }
}