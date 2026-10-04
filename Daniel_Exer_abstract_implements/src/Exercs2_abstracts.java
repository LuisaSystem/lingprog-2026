import java.util.ArrayList;
import java.util.List;

// 1. Interface Notificavel
interface DesafioNotificavel {
    void notificar(String mensagem);

    default void notificarAtraso() {
        notificar("Seu pagamento está atrasado");
    }
}

// 2. Classe abstrata Funcionario
abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void exibirFicha() {
        System.out.println("Funcionário: " + nome + " | Salário Base: R$ " + salarioBase);
    }

    public abstract double calcularSalario();
}

// 3. FuncionarioCLT
class FuncionarioCLT extends Funcionario {
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.1);
    }
}

// 4. FuncionarioPJ
class FuncionarioPJ extends Funcionario implements DesafioNotificavel {
    public FuncionarioPJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("[PJ] " + mensagem);
    }
}

// 5. Estagiario
class Estagiario extends Funcionario implements DesafioNotificavel {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 0.8;
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("[Estagiário] " + mensagem);
    }
}

// Main do Desafio
public class Exercs2_abstracts {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new FuncionarioCLT("Carlos CLT", 4000.0));
        funcionarios.add(new FuncionarioPJ("Pedro PJ", 6000.0));
        funcionarios.add(new Estagiario("Bruna Estágio", 1500.0));

        System.out.println("--- Folha de Pagamento (Polimorfismo) ---");
        for (Funcionario f : funcionarios) {
            f.exibirFicha();
            System.out.println("Salário Final Líquido: R$ " + f.calcularSalario());
            System.out.println("------------------------------------");
        }

        System.out.println("\n--- Disparando Notificações de Atraso ---");
        List<DesafioNotificavel> notificaveis = new ArrayList<>();
        for (Funcionario f : funcionarios) {
            if (f instanceof DesafioNotificavel) {
                notificaveis.add((DesafioNotificavel) f);
            }
        }

        for (DesafioNotificavel n : notificaveis) {
            n.notificarAtraso();
        }
    }
}

