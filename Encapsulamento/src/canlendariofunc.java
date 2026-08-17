public class canlendariofunc {
    private String nome;
    private double salario;
    private int cargaHorariasemanal;

    //não esquecer construtor padrão
    public canlendariofunc(){
        this("Sem nome", 0.0,1);
    }
    public canlendariofunc(String nome, double salario, int cargaHorariasemanal){
        this.setNome(nome);
        this.setSalario(salario);
        this.setCargaHorariasemanal(cargaHorariasemanal);
    }

    //setters
    public void setNome(String nome){
       if (nome.isEmpty() || nome.length() > 50){
           System.out.println("Nome inválido!");
       }else {
           this.nome = nome;
       }

    }

    public void setSalario(double salario){
        if (this.salario >= 0){
            this.salario = salario;
        }else {
            System.out.println("Valor inválido!");
        }
    }

    public void setCargaHorariasemanal(int cargaHorariasemanal) {
        if (this.cargaHorariasemanal >= 1 && this.cargaHorariasemanal <= 44){
            this.cargaHorariasemanal = cargaHorariasemanal;
        } else {
            this.cargaHorariasemanal = 1;
            System.out.println("Periodo inválido!");
        }

    }

    //getters
    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public int getCargaHorariasemanal() {
        return this.cargaHorariasemanal;
    }

    public void exeibir(){
        System.out.println("Nome: " + this.nome +
            " Salário: R$" + this.salario +
            " Carga horária  semanal: " + this.cargaHorariasemanal);
    }
}
