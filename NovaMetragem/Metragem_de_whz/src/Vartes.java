import java.util.Scanner;

public class Vartes {

 public static void main(String[] args){
  Scanner es = new Scanner(System.in);
 // Colocar seu nome
  System.out.println("Insira o seu nome: ");
  String nome = es.next();

 // Colocar a quantidade de kwh antiga
  System.out.println("Adicione o numero de KWH do mês passado: ");
  float kwh = es.nextFloat();

 // Colocar a quantidade agor
  System.out.println("Adicione o numero de KWH do mês recente: ");
  float kwhnow = es.nextFloat();

  // Quanto gastou

  float receber = kwh - kwhnow;

  // bandeiras

  String mess = "";
  if (receber == 100f){
    mess = "Bandeira verde.";
  } else if (receber >= 100f && receber <= 200f) {
    mess = "Bandeira Amarela!";
    System.out.println("R$ 2,00 (dois reais) de acréscimo: "+ receber+2.00f);
  } else if (receber >= 200f && receber <= 300f) {
    mess = "Bandeira Vermelha!!";
    System.out.println("R$ 5,00 (cinco reais) de acréscimo: "+ receber+5.00f);
  } else if (receber > 300f) {
      mess = "Bandeira Preta!!!";
      System.out.println("R$ 10,00 (ez reais) de acréscimo: "+ receber+10.00 +". Pague imediatamente sua conta!!");
  } else {
      mess = "Contagens de valores não contingentes!";
  }

     //resumo
     double total = receber * 0.60f;
     System.out.println("Resumo: "+nome+", "+receber+", "+mess+"!\n E o total: "+total);




















































 }
}
