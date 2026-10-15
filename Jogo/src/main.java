package Jogo.src;

import java.util.Scanner;

public class main {

    public static void main(String[] args){

        Personagem personagem = new Personagem("Heroi", 100, "Samuel");
        Personagem personagem2 = new Personagem("Monstro", 100, "Dragao");
        personagem.setNome();
        personagem.personagem();


        Scanner sc = new Scanner(System.in);
            int vidaMonstro = personagem2.getVida();
                int vidaJogador = personagem.getVida();
                int danoMonstro = 30;
        String classeP = personagem.NomePublico;
        boolean combateTerminado = false;

        if (classeP.equalsIgnoreCase("Mago") || classeP.equalsIgnoreCase("Guerreiro")){
            System.out.println("\nAlguns inimigos apareceram...");
            System.out.println("Nome: " + personagem2.getNome());
            System.out.println("Vida do monstro: " + vidaMonstro);
            System.out.println("Vida do jogador: " + vidaJogador);
                while (vidaMonstro > 0 && vidaJogador > 0 && !combateTerminado) {
                    System.out.println("\n======================================");
                    System.out.println("O que queres fazer?");
                    System.out.println("1 - Atacar");
                    System.out.println("2 - Fazer aliança");
                    System.out.println("======================================");
            int escolha = sc.nextInt();
        
        if (escolha == 1){
            int dano;

        if (classeP.equalsIgnoreCase("Mago")) {
            Mago mago = new Mago();
            System.out.println("O Mago ergue o seu cajado...");
            mago.ataque();
            dano = 30;
            } else{
                Guerreiro guerreiro = new Guerreiro();
                System.out.println("O Guerreiro saca a sua espada...");
                System.out.println("Shiiing! ⚔️");
                dano = guerreiro.Dano;
            }
                vidaMonstro -= dano;

        if(vidaMonstro < 0){
            vidaMonstro = 0;
            }
            System.out.println("Deste " + dano + " de dano ao monstro!");
            System.out.println("Vida atual do monstro: " + vidaMonstro);
        
        if (vidaMonstro > 0){
            System.out.println("\nÉ a vez do monstro!");
            System.out.println("O monstro lança um ataque de fogo!🔥");
                vidaJogador -= danoMonstro;

        if (vidaJogador < 0){
                vidaJogador = 0;
            }
            System.out.println("Perdeu " + danoMonstro + " de vida!");
            System.out.println("Vida atual do jogador: " + vidaJogador);
            }
            } else if(escolha == 2){
                System.out.println("\nTentaste fazer uma aliança!");
                System.out.println("Digita um número de 0 a 10:");
            int numeroJogador = sc.nextInt();

        if(numeroJogador < 0 || numeroJogador > 10){
            System.out.println("Número inválido! Escolhe entre 0 e 10.");
            } else if(numeroJogador == 5){
                        System.out.println("\nParabéns! você fez uma aliança!");
                        System.out.println("O monstro agora é teu aliado!");
                        combateTerminado = true;
                        } else{
                            System.out.println("\nA aliança falhou!");
                            System.out.println("O monstro ataca-te!");

            vidaJogador -= danoMonstro;

        if(vidaJogador < 0){
            vidaJogador = 0;
            }
            System.out.println("Perdeu " + danoMonstro + " de vida!");
            System.out.println("Vida atual do jogador: " + vidaJogador);
            }
        } else{
            System.out.println("Escolha inválida! Digita 1 ou 2." );
        }
    }
            System.out.println("\n======================================");
            if(combateTerminado){
                System.out.println("COMBATE TERMINADO! O monstro é teu aliado! 🤝");
            } else if(vidaMonstro <= 0){
                System.out.println("Parabéns! Derrotou o monstro!");
            } else if(vidaJogador <= 0){
                System.out.println("Foi derrotado pelo monstro!");
            }
            System.out.println("Vida final do jogador: " + vidaJogador);
            System.out.println("Vida final do monstro: " + vidaMonstro);
        } else{
            System.out.println("Classe inválida! Escolhe Mago ou Guerreiro.");
        }
        sc.close();
    }
}