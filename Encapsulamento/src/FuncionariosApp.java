public class FuncionariosApp {
    public static void main(String[] args) {
        canlendariofunc f1 = new canlendariofunc();
        f1.setNome("Orivaldo da silva");
        f1.setSalario(3400.00);
        f1.setCargaHorariasemanal(3);
        f1.exeibir();

        System.out.println("Nome:  "+ f1.getNome());

        canlendariofunc f2 = new canlendariofunc("Marcos", -3000.0, 60);
        f2.exeibir();
    }
}
