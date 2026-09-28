package Composicao_Agrecacao.Casa;

public class Main {
    public static void main(String[] args) {
        // Criando a casa apenas com o endereço (Composição)
        Casa minhaCasa = new Casa("Rua das Flores, 123");

        // Os cômodos são gerados DIRETAMENTE pela casa, cumprindo a regra 3
        minhaCasa.criarComodo("Quarto Principal", 14.5);
        minhaCasa.criarComodo("Sala de Estar", 22.0);
        minhaCasa.criarComodo("Cozinha", 12.8);

        // Passo 4: Listando os cômodos criados
        minhaCasa.listarComodos();
    }
}
