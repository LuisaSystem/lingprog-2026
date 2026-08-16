public class conta{
    private static int totalcontas = 0;

    private String titular;
    private String numero;
    private double saldo;
    private double LimiteChequeEspecial;

    public conta(String titular, String numero, double saldoInicial){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
        setLimiteChequeEspecial(0.0); // nasceu validado!
        totalcontas++;
    }

     public void depositar(double valor){
        if(valor > 0) setSaldo(saldo + valor);
     }

     public void sacar(double valor){
        if(valor > 0) setSaldo(saldo - valor);
     }

     //getters - leitura
    public String getTitular(){return titular;}
    public double getSaldo(){return saldo;}
    public double getLimiteChequeEspecial(){return LimiteChequeEspecial;}

    private  void setSaldo(double x){
        if (x >= 0){
            this.saldo = x;
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