package Heranca.Forma;

// Passo 3: Heranca.Forma.Retangulo extends Heranca.Forma.Heranca.Forma
public class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Passo 3 e 4: Sobrescrevendo com @Override e aplicando a fórmula
    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
