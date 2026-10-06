package Jogo.src;

public class main {
    public static void main(String[] args){
        Personagem heroi = new Personagem("Samuel do mal");
        Personagem heroi1 = new Personagem("ze gotinha");
        Personagem vilão = new Personagem("ze pilintra");
        Personagem vilão1 = new Persongem("Samuel do bem");


        System.out.println("Iniciar Jogo");
        heroi.receberDano(40);
        heroi.receberDano(10);
        heroi.tomarPocaoCurativa(10);
        heroi.tomarPocaoCurativa(70);
    }

}
