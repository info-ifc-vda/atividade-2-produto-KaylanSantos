public class produto {

     String nome;
     double valor;
     int quant;

       public produto(String nome, double valor, int quant){

                this.nome = nome;
                this.valor = valor;
                this.quant = quant;

       }

       public double calcularValorTotal(){

             double total = this.valor * this.quant;
             return total;

       }

       public void alterarQuantidade(int qtd){

              this.quant += qtd;

       }

       public String imprimirDados(){

              String dados = "Nome do produto: " + this.nome +
                             "Valor R$ " + this.valor +
                             "Quantidade em estoque: " + this.quant;

               return dados;              

       }

}
