public class Main{
    public static void main(String args[]){

        // variavel do tipo "String"
        String nome = "Luisa";
        //         ==      "int"
        int idade = 19;
        //         ==   "float"
        float altura = 1.74f;
        float peso = 70.0f;
        // calculo de imc
        float imc = peso / (altura * altura);

        System.out.println( nome+", seu peso é "+imc);

        if(imc < 18.5f){
            System.out.println("Você está abaixo do peso");
        }

    }
}
