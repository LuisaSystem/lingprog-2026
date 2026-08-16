public class conta{
    private static int totalcontas = 0;

    private static String titular;
   // private String numero;
    private static double saldo;
    private static double LimiteChequeEspecial;

    public conta(String titular, String numero, double saldoInicial){
        this.titular = titular;
      //  this.numero = numero;
        this.saldo = saldoInicial;
        setLimiteChequeEspecial(0.0); // nasceu validado!
        totalcontas++;
    }

     public static void depositar(double valor){
        if(valor > 0) setSaldo(saldo + valor);
     }

     public static void sacar(double valor){
        if(valor > 0) setSaldo(saldo - valor);
     }

     //getters - leitura
    public static String getTitular(){return titular;}
    public static double getSaldo(){return saldo;}
    public static double getLimiteChequeEspecial(){return LimiteChequeEspecial;}

    private static void setSaldo(double x){
        if (x >= 0){
            saldo = x;
        }else {
            System.out.println("saldo inválido");
        }
    }

    //getter - validar o limite
    public void  setLimiteChequeEspecial(double valor){
        if (valor >= 0) LimiteChequeEspecial = valor;
        else System.out.println("Limite inválido");
    }
}