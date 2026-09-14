public class gerente extends funcionario{
    private double bonusGerente;

    public gerente(){
        this("Sem nome", 0.0, 0.0);
    }
    public gerente(String nome, double salario, double bonusGerente) {
        super(nome, salario);// chama construtor superclasse
        this.bonusGerente = bonusGerente;
    }

    public double getBonusGerente() {
        return bonusGerente;
    }
    public void setBonusGerente(double bonusGerente) {
        this.bonusGerente = bonusGerente;
    }

    @Override //anular de metodos
    public double calcularBonus(){
        return super.calcularBonus() + this.bonusGerente;
    }

    @Override
    public void exibiDados(){
        super.exibiDados();
        System.out.println("Bônus gerencial: " + this.bonusGerente);
    }
}
