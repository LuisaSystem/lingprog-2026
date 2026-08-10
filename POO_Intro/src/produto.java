public class produto {
    public String nome;
    public double preco;
    public int qtdEstoque;
    public static int totalProdutos;

    public produto (){
        this("Produto sem nome", 0.0, 0);
    }
    public produto(String nome, double preco, int qtdEstoque){
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        produto.totalProdutos++;
    }


    public static int getTotalProdutos() {
        return totalProdutos;
    }

    public void vender(int x){
        if(x <= this.qtdEstoque){
            this.qtdEstoque -= x;
            System.out.println("Vendido!");
        }
        else {
            System.out.println("Produto sem estoque suficiente");
        }
    }

    public void repor(int qtd){
        this.qtdEstoque += qtd;
    }

    public void exibirDados(){
        System.out.println("\nNome do Produto: " + this.nome +
                " Preço R$: " + this.preco +
                " Quantidade do estoque: " + this.qtdEstoque);
    }
}