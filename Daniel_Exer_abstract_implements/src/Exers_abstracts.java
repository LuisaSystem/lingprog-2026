// ==================== EXERCÍCIO 6.1 ====================
abstract class Veiculo {
    protected String placa;

    public Veiculo(String placa) {
        this.placa = placa;
    }

    public abstract double calcularImposto();

    public void exibirPlaca() {
        System.out.println("Placa: " + this.placa);
    }
}

class Carro extends Veiculo {
    public Carro(String placa) { super(placa); }
    @Override
    public double calcularImposto() { return 500.00; }
}

class Moto extends Veiculo {
    public Moto(String placa) { super(placa); }
    @Override
    public double calcularImposto() { return 150.00; }
}

// ==================== EXERCÍCIOS 6.2 & 6.3 ====================
interface Notificavel {
    void notificar(String mensagem);

    default void notificarComHorario(String mensagem) {
        System.out.print("[10:32] ");
        notificar(mensagem);
    }
}

class EmailService implements Notificavel {
    @Override
    public void notificar(String mensagem) { System.out.println("[EMAIL] " + mensagem); }
}

class SmsService implements Notificavel {
    @Override
    public void notificar(String mensagem) { System.out.println("[SMS] " + mensagem); }
}

class PushService implements Notificavel {
    @Override
    public void notificar(String mensagem) { System.out.println("[PUSH] " + mensagem); }
}

// ==================== EXERCÍCIO 6.4 ====================
interface Desenhavel {
    void desenhar();
}

abstract class FormaGeometrica implements Desenhavel {
    protected String nome;

    public FormaGeometrica(String nome) { this.nome = nome; }

    @Override
    public void desenhar() { System.out.println("Desenhando a forma: " + nome); }
    public abstract double calcularPerimetro();
}

class Quadrado extends FormaGeometrica {
    private double lado;
    public Quadrado(double lado) { super("Quadrado"); this.lado = lado; }
    @Override
    public double calcularPerimetro() { return lado * 4; }
}

class Triangulo extends FormaGeometrica {
    private double lado;
    public Triangulo(double lado) { super("Triângulo"); this.lado = lado; }
    @Override
    public double calcularPerimetro() { return lado * 3; }
}

// ==================== CLASSE MAIN DE TESTES ====================
public class Exers_abstracts {
    public static void main(String[] args) {
        System.out.println("--- Teste 6.1 (Veículos) ---");
        Veiculo[] veiculos = { new Carro("ABC-1234"), new Moto("XYZ-5678") };
        for (Veiculo v : veiculos) {
            v.exibirPlaca();
            System.out.println("Imposto: R$ " + v.calcularImposto());
        }

        System.out.println("\n--- Teste 6.2 & 6.3 (Notificações) ---");
        Notificavel[] canais = { new EmailService(), new SmsService(), new PushService() };
        for (Notificavel canal : canais) {
            canal.notificarComHorario("Alerta de sistema!");
        }

        System.out.println("\n--- Teste 6.4 (Formas Geométricas) ---");
        FormaGeometrica q = new Quadrado(5);
        q.desenhar();
        System.out.println("Perímetro: " + q.calcularPerimetro());
    }
}

