package Metodos;

public class main {
    public static void main(String[] args) {

        luffy luffy = new luffy();
        luffy.nome = "Luffy";
        luffy.recompensa = 3000000000L;
        luffy.Tesouro = "Thousand_Sunny";
        //luffy.sonho = "Ser o Rei dos Piratas";

        sanji sanji = new sanji();
        sanji.nome = "Sanji";
        sanji.recompensa = 103200000000L;
        sanji.Tesouro = "Thounsand_Sunny";
        //sanji.sonho = "Encontrar o All Blue";

        zoro zoro = new zoro();
        zoro.nome = "Zoro";
        zoro.recompensa = 111100000000L;
        zoro.Tesouro = "Thounsand_Sunny";
        zoro.sonho = "Ser o maior espadachim do mundo";

        chopper chopper = new chopper();
        chopper.nome = "Tony Tony Chopper";
        chopper.recompensa = 1000L;
        chopper.Tesouro = "Thounsand_Sunny";
        chopper.sonho = "se tornar um médico capaz de curar qualquer doença no mundo";

        System.out.println("Nome: " + luffy.nome);

        luffy.atacar();
        sanji.atacar();
        zoro.atacar();
        chopper.atacar();

        pirata pirata = new pirata();
        pirata.atacar();
    } 
}
