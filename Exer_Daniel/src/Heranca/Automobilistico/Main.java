package Heranca.Automobilistico;

public class Main {
    public static void main(String[] args) {
        // Instanciando Heranca.Automobilistico.Carro e Moto
        Carro meuCarro = new Carro("Toyota", 2024, 4);
        Motor minhaMoto = new Motor("Honda", 2025, 250);

        // Chamando o método herdado de Heranca.Automobilistico.Veiculo
        System.out.println("Dados do Heranca.Automobilistico.Carro:");
        meuCarro.exibirDados();
        System.out.println("Portas: " + meuCarro.getNumeroPortas());

        System.out.println("\nDados da Moto:");
        minhaMoto.exibirDados();
        System.out.println("Cilindradas: " + minhaMoto.getCilindradas() + "cc");
    }
}
