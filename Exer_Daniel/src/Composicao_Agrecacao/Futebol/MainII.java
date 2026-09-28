package Composicao_Agrecacao.Futebol;

public class MainII {
    public static void main(String[] args) {
        // Criando os jogadores de forma independente (Agregação)
        Jogador j1 = new Jogador("Neymar Jr", 10);
        Jogador j2 = new Jogador("Rodrygo", 11);

        // Criando o time
        Time meuTime = new Time("Santos FC");

        // Passo 3: Passando os objetos jogadores criados de fora para dentro do time
        meuTime.adicionarJogador(j1);
        meuTime.adicionarJogador(j2);

        // Passo 4: Listando os jogadores do time
        meuTime.listarJogadores();
    }
}
