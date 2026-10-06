package JavaPOO.senac;


public class Main{

     public static void main(String[] args){
        
        lampada lampada = new lampada();
        lampada.cor = "Branca";
        lampada.Marca = "Positivo";
        lampada.Modelo = "Yakuza";
        lampada.Voltagem = 24;
        lampada.tipo = "Led";
        
        System.out.println("COR - " + lampada.cor);
            System.out.println("MARCA - " + lampada.Marca);
                System.out.println("MODELO - " + lampada.Modelo);
                    System.out.println("VOLTAGEM - " + lampada.Voltagem);
    }
}
