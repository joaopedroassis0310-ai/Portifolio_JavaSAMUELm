import java.util.Scanner;

public class converssorTempoA4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Quantidade de segundos: "); 
         int segundos = sc.nextInt();
         int minutos = segundos / 60;
         int hora = minutos / 60;

     System.err.println("tempo restante: " + hora + "h");

    }
}
