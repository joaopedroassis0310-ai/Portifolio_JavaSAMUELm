package Jogo.src;

import java.util.Scanner;

public class Personagem {
    private String nome;
    int atacar;
    private int vida;
    String equipamento;
    int nivel;
    String NomePublico;
    

   void personagem() {
    Scanner sc = new Scanner(System.in);

    System.out.println(
        "Escolha sua classe: Mago 🔥 ou Guerreiro 🗡️"
    );

    String classe = sc.nextLine();

    if (classe.equalsIgnoreCase("Mago")) {
        NomePublico = "Mago";

        System.out.println("Tipo: " + nome);
        System.out.println("Classe: Mago");

    } else if (classe.equalsIgnoreCase("Guerreiro")) {
        NomePublico = "Guerreiro";

        System.out.println("Nome: " + nome);
        System.out.println("Classe: Guerreiro");

    } else {
        System.out.println("Classe inválida!");
    }

    System.out.println("==================================");
}

    public Personagem(String nomeInicial, int vidaInicial, String classe){
    this.nome = nomeInicial;
    this.vida = vidaInicial;
    this.NomePublico = classe;
}
    public String getNome(){
    return this.nome;
}
    public int getVida(){
        return this.vida;
    }
    public void setNome() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do seu personagem!");
    String nomeInicial = scanner.nextLine();

    this.nome = nomeInicial;

    System.out.println(
        "O nome do seu personagem é " + this.nome
    );
}
    public void setVida(){
        if(vida <= 0){
            System.out.println("Você morreu, tente novamente! :/");
        }
    }
}
