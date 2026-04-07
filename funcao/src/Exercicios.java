import java.util.Scanner;

public class Exercicios {
    // exe1. calcula área do retângulo
    public static double calcularAR(double base, double altura){
        return (base * altura);
    }
    // exe2. verifica paridade
    public static boolean ehPar(int numero){
        return (numero % 2 == 0); // retorna true se par e false se ímpar
    }
    // exe3. converte Celsius para Farenheint
    public static float converteTemp(float celsius){
        return (celsius * 1.8f + 32);
    }
    // exe4.
    public static String avaliacao(float media){
        if (media >= 6){
            return "Aprovado";
        }
        else if (media >= 4){
            return "Recuperação";
        }
        else return "Reprovado";
    }
    public static void main(String[] args){
        //ex 1
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a base");
        double base = entrada.nextDouble();
        System.out.println("Informe a altura");
        double altura = entrada.nextDouble();
        System.out.println("Área do retângulo: " + calcularAR(base, altura));
        System.out.println("Vamos verificar se a base do retângulo é par");
        //ex 2
        if (ehPar((int)base)){
            System.out.println("Base é par");
        }
        else System.out.println("Base é ímpar");

        //ex 3
        System.out.println("Informe temperaatura em celsius");
        float celsius = entrada.nextFloat();
        System.out.println("Farnheint: "+converteTemp(celsius));

        //ex 4
        System.out.println("Informe a media do aluno");
        float media = entrada.nextFloat();
        System.out.println("Situação do aluno"+ avaliacao(media));


    }
}
