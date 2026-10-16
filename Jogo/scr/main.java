import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Personagem personagem = new Personagem("Heroi", 100, "Samuel");
        Personagem personagem2 = new Personagem("Monstro", 100, "Dragao");

        personagem.setNome(sc);
        personagem.personagem(sc);

        int vidaMonstro = personagem2.getVida();
        int vidaJogador = personagem.getVida();
        int danoMonstro = 30;

        String classeP = personagem.NomePublico;
        boolean combateTerminado = false;

        Berserk berserk = null;

        if (classeP.equalsIgnoreCase("Berserk")) {
            berserk = new Berserk();
        }

        boolean classeValida =
                classeP.equalsIgnoreCase("Mago")
                || classeP.equalsIgnoreCase("Guerreiro")
                || classeP.equalsIgnoreCase("Berserk");

        if (!classeValida) {
            System.out.println("Classe inválida! Escolha Mago, Guerreiro ou Berserk.");
            sc.close();
            return;
        }

        System.out.println("\nAlguns inimigos apareceram...");
        System.out.println("Nome: " + personagem2.getNome());
        System.out.println("Vida do monstro: " + vidaMonstro);
        System.out.println("Vida do jogador: " + vidaJogador);

        while (vidaMonstro > 0 && vidaJogador > 0 && !combateTerminado) {

            System.out.println("\n======================================");
            System.out.println("O que quer fazer?");
            System.out.println("1 - Atacar");
            System.out.println("2 - Fazer aliança");

            if (berserk != null) {
                System.out.println("3 - Usar Fúria (40 de dano)");
            }

            System.out.println("======================================");

            int escolha = lerInteiro(sc, "Escolha uma opção de 1 a 3:");

            if (escolha == Integer.MIN_VALUE) {
                break;
            }

            boolean inimigoAtaca = false;

            if (escolha == 1) {

                int dano;

                if (classeP.equalsIgnoreCase("Mago")) {
                    Mago mago = new Mago();

                    System.out.println("O Mago ergue seu cajado...");
                    mago.ataque();

                    dano = 30;

                } else if (classeP.equalsIgnoreCase("Guerreiro")) {
                    Guerreiro guerreiro = new Guerreiro();

                    System.out.println("O Guerreiro saca sua espada...");
                    guerreiro.ataque();

                    dano = guerreiro.Dano;

                } else {
                    System.out.println("O Berserk prepara sua arma!");

                    berserk.ataque();
                    dano = berserk.getDano();
                }

                vidaMonstro -= dano;

                if (vidaMonstro < 0) {
                    vidaMonstro = 0;
                }

                System.out.println("Você causou " + dano + " de dano ao monstro!");
                System.out.println("Vida atual do monstro: " + vidaMonstro);

                inimigoAtaca = vidaMonstro > 0;

            } else if (escolha == 2) {

                System.out.println("\nTentou fazer uma aliança!");

                int numeroJogador = lerInteiro(sc, "Digite um número de 0 a 10:");

                if (numeroJogador == Integer.MIN_VALUE) {
                    break;
                }

                if (numeroJogador < 0 || numeroJogador > 10) {
                    System.out.println("Número inválido! Escolha entre 0 e 10.");

                } else if (numeroJogador == 5) {
                    System.out.println("\nParabéns! Você fez uma aliança!");
                    System.out.println("O monstro agora é seu aliado!");

                    combateTerminado = true;

                } else {
                    System.out.println("\nA aliança falhou!");
                    System.out.println("O monstro ataca você!");

                    inimigoAtaca = true;
                }

            } else if (escolha == 3 && berserk != null) {

                if (berserk.isFuriaUsada()) {
                    System.out.println("A Fúria já foi utilizada neste combate!");

                } else {
                    int dano = berserk.usarFuria();

                    vidaMonstro -= dano;

                    if (vidaMonstro < 0) {
                        vidaMonstro = 0;
                    }

                    System.out.println("Você causou " + dano + " de dano ao monstro!");
                    System.out.println("Vida atual do monstro: " + vidaMonstro);

                    inimigoAtaca = vidaMonstro > 0;
                }

            } else {
                System.out.println("Opção inválida! Digite uma opção disponível no menu.");
                continue;
            }

            if (inimigoAtaca && vidaJogador > 0) {
                System.out.println("\nÉ a vez do monstro!");
                System.out.println("O monstro lança um ataque de fogo!");

                vidaJogador -= danoMonstro;

                if (vidaJogador < 0) {
                    vidaJogador = 0;
                }

                System.out.println("Você perdeu " + danoMonstro + " de vida!");
                System.out.println("Vida atual do jogador: " + vidaJogador);
            }
        }

        System.out.println("\n======================================");

        if (combateTerminado) {
            System.out.println("COMBATE TERMINADO! O monstro é seu aliado!");
        } else if (vidaMonstro <= 0) {
            System.out.println("Parabéns! Você derrotou o monstro!");
        } else {
            System.out.println("Combate encerrado.");
        }

        System.out.println("Vida final do jogador: " + vidaJogador);
        System.out.println("Vida final do monstro: " + vidaMonstro);

        sc.close();
    }

    private static int lerInteiro(Scanner sc, String mensagem) {
        while (true) {
            System.out.println(mensagem);

            if (!sc.hasNextLine()) {
                return Integer.MIN_VALUE;
            }

            String entrada = sc.nextLine().trim();

            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite apenas números inteiros.");
            }
        }
    }
}
