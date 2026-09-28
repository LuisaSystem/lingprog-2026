package Heranca.Forma;

// Passo 2: Heranca.Forma.Circulo extends Heranca.Forma.Heranca.Forma
public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    // Passo 2 e 4: Sobrescrevendo com @Override e aplicando a fórmula
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
