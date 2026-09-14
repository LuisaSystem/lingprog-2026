public class funcionario {
    //protected => deixa a variavel pública para as filhas
    protected String nome;
    protected double salario;

    public funcionario() {
        this("Sem nome", 0.0);
    }
    public funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //calcular bonus para qualquer funcionário
    public double calcularBonus(){
        return this.salario * 0.15; //15% do salario
    }
    public void exibiDados(){
        System.out.println("\nNome: "+this.nome+
                " Salario: "+this.salario+
                " Bônus: "+this.calcularBonus() +
                " Total a receber: " + (this.calcularBonus() + this.salario));
    }
}