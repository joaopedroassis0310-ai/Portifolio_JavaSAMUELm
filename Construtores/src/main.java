package Construtores.src;

public class main {
    public static void main(String[] args) {
        Produto camisa = new Produto("Futebol", 150);
        Produto celular = new Produto("Samsumg", 200);
        Produto VideoGame = new Produto("Nintendo", 300);
        System.out.println("Escolha o preço do seu aparelho!!!! Jovem guerreiro....");
        celular.setPreco();

        /*System.out.println("Item: " + camisa.getNome());
        System.out.println("Valor: " + camisa.getPreco());

        System.out.println("Item: " + celular.getNome());
        System.out.println("Valor: " + celular.getPreco());

        System.out.println("Item: " + VideoGame.getNome());
        System.out.println("Valor: " + VideoGame.getPreco());

        System.out.println("Aplicando desconto -> . . .");
        
        camisa.setPreco(-50);
        camisa.setPreco(20);*/
    }
}
