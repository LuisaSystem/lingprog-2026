public class vendedor extends funcionario {
    private double totalVendas;

    public vendedor(){
        this("Sem nome", 0.0, 0.0);
    }
    public vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularBonus(){
        return this.totalVendas * 0.10; // 10% das vendas
    }

    @Override
    public void exibiDados(){
        super.exibiDados();
        System.out.println("Bônus da comissão: "+ this.totalVendas);
    }
}
