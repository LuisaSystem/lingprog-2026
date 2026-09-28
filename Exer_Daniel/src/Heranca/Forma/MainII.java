package Heranca.Forma;

public class MainII {
    public static void main(String[] args) {
        // Instanciando as formas geométricas
        Circulo c = new Circulo(5.0);          // Raio = 5
        Retangulo r = new Retangulo(4.0, 6.0); // Largura = 4, Altura = 6

        // Testando as chamadas dos métodos sobrescritos
        System.out.printf("Área do Círculo: %.2f\n", c.calcularArea());
        System.out.printf("Área do Retângulo: %.2f\n", r.calcularArea());
    }
}
