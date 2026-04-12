public class FibonacciVetor {

    // ~ TERCEIRO EMAGRECIMENTO ~

    public  static void fibonnaciEngine(long[] fib){
        // certeiii
        // Define os dois primeiros termos
        int n = 10;
        fib[0] = 0;
        if (n > 1) {
            fib[1] = 1;
            // Preenche o vetor
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }

        // Exibe o vetor
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
    public static void main(String[] args, int n) {
        long[] fib = new long[n];
        fibonnaciEngine(fib);



    }
}
