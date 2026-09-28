package Composicao_Agrecacao.Futebol;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Jogador> jogadores; // Passo 2: ArrayList de jogadores

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    // Passo 3: O jogador já existe e é recebido pronto de fora (Agregação)
    public void adicionarJogador(Jogador jogador) {
        if (jogador != null && !this.jogadores.contains(jogador)) {
            this.jogadores.add(jogador);
        }
    }

    public String getNome() {
        return nome;
    }

    // Passo 4: Método listarJogadores() que imprime o nome de cada jogador do time
    public void listarJogadores() {
        System.out.println("Jogadores do time " + nome + ":");
        for (Jogador j : jogadores) {
            System.out.println("- " + j.getNome() + " (Nº " + j.getNumeroCamisa() + ")");
        }
    }
}
