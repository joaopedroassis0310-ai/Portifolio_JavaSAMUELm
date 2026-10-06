import java.util.Scanner;

public class ProdutosA2{

    private static final double carteira = 5.50;

    public static void main(String[] args){
        String nome = "Maca";
        Double precoMaca = 1.60;
        int quantidadeMaca = 20;
        Boolean produtoAD = true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu pedido: ");
        double Maca = scanner.nextDouble();

        double venda = carteira - Maca;
        System.out.println("Restante dinero:" + venda);

    }
}