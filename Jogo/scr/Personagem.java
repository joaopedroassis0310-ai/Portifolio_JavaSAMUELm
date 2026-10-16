
import java.util.Scanner;

public class Personagem {

    private String nome;
    int atacar;
    private int vida;
    String equipamento;
    int nivel;
    String NomePublico;

    public Personagem(String nomeInicial, int vidaInicial, String classe) {
        this.nome = nomeInicial;
        this.vida = vidaInicial;
        this.NomePublico = classe;
    }

    public void setNome(Scanner sc) {
        System.out.println("Digite o nome do seu personagem!");
        String nomeInicial = sc.nextLine().trim();

        if (!nomeInicial.isEmpty()) {
            this.nome = nomeInicial;
        } else {
            System.out.println("Nome inválido! Será mantido: " + this.nome);
        }
    }

    public void personagem(Scanner sc) {
        System.out.println("Escolha sua classe:");
        System.out.println("Mago 🔥");
        System.out.println("Guerreiro 🗡️");
        System.out.println("Berserk 🪓");

        String classe = sc.nextLine().trim();

        if (classe.equalsIgnoreCase("Mago")) {
            NomePublico = "Mago";
        } else if (classe.equalsIgnoreCase("Guerreiro")) {
            NomePublico = "Guerreiro";
        } else if (classe.equalsIgnoreCase("Berserk")) {
            NomePublico = "Berserk";
        } else {
            NomePublico = "";
            System.out.println("Classe inválida!");
            return;
        }

        System.out.println("Nome: " + nome);
        System.out.println("Classe escolhida: " + NomePublico);
        System.out.println("==================================");
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida() {
        if (vida <= 0) {
            vida = 0;
            System.out.println("Você morreu, tente novamente!");
        }
    }
}
