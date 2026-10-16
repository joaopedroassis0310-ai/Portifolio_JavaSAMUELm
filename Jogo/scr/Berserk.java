import java.util.Scanner;
public class Berserk {

    private int Dano = 25;
    private boolean furiaUsada = false;

    public void ataque() {
        System.out.println("O Berserk ataca com sua arma! ⚔️");
    }

    public int getDano() {
        return Dano;
    }

    public int usarFuria() {
        if (furiaUsada) {
            System.out.println("A Fúria já foi utilizada neste combate!");
            return 0;
        }

        furiaUsada = true;

        System.out.println("O Berserk entra em estado de FÚRIA!");
        System.out.println("Um golpe devastador! 💥");

        return 40;
    }

    public boolean isFuriaUsada() {
        return furiaUsada;
    }
}