package Construtores.src;
import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nomeInicial, double precoInicial){
    this.nome = nomeInicial;
    this.preco = precoInicial;
}

//getters
public String getNome(){
    return this.nome;
}
public double getPreco(){
    return this.preco;
}

//setters
public void setPreco(){
    Scanner teclado = new Scanner(System.in);
    double novoPreco = teclado.nextDouble();

    if(novoPreco >= 0){
        this.preco = novoPreco;
        System.out.println("Preço do " + nome + " atualizado para: " + preco);
    }else{
        System.out.println("Erro");
    }
}
}
