public class PrincipalProduto {

    public static void main(String[] args) {
        
             String n = "Mouse RedDragon";
             double v = 250;
             int qtd = 1987;

             produto p1 = new produto(n, v, qtd);

                   n = "Teclado";
                   v = 450;
                   qtd = 60;

                 produto p2 = new produto(n, v, qtd);

                 System.err.println(p1.imprimirDados());

                 p1.alterarQuantidade(-29);

                 p2.alterarQuantidade(30);

                 System.out.println(p1.imprimirDados());


    }
    
}
