package Composicao_Agrecacao.Casa;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String endereco;
    private List<Comodo> comodos; // Passo 2: ArrayList de comodos

    // Passo 3: O construtor recebe as informações necessárias e instancia os cômodos internamente
    public Casa(String endereco) {
        this.endereco = endereco;
        this.comodos = new ArrayList<>();
    }

    // Método na Composicao_Agrecacao.Casa.Composicao_Agrecacao.Casa para criar um cômodo internamente (sem receber o objeto pronto de fora)
    public void criarComodo(String nome, double areaM2) {
        Comodo novoComodo = new Comodo(nome, areaM2);
        this.comodos.add(novoComodo);
    }

    public String getEndereco() {
        return endereco;
    }

    // Passo 4: Método listarComodos() que imprime o nome e área de cada cômodo
    public void listarComodos() {
        System.out.println("Composicao_Agrecacao.Casa.Composicao_Agrecacao.Casa localizada em: " + endereco);
        System.out.println("Lista de Cômodos:");
        for (Comodo c : comodos) {
            System.out.println("- " + c.getNome() + " (" + c.getAreaM2() + "m²)");
        }
    }
}
