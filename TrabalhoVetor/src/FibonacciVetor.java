public class FibonacciVetor {
    public static void main(String[] args) {

                int n = 10; // Quantidade de termos
                long[] fib = new long[n];

                // Define os dois primeiros termos
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
}
