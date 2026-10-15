package Jogo.src;

public class exemplo {
    // Atributos totalmente desprotegidos
    String nome;
    private int vida;

    public exemplo (String nomeEscolhido){
        this.nome = nomeEscolhido;
        this.vida = 100;
        System.out.println("Aqui nasce o Heroi");
    }

    // Método que tenta impor uma regra
    void tomarPocaoCurativa(int cura){
        vida = vida + cura;
        if(vida > 100){
            vida = 100;
        }
        System.out.println("Vida " + cura);
    }
    void receberDano(int dano){
    vida = vida - dano;
    if(vida <= 0){
        vida = 0;
        System.out.println("você foi derrotado");
    }else{
        System.out.println("Sofreu dano " + dano );
    }
}
}