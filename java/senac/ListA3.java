import java.util.ArrayList;
import java.util.List;

public class ListA3{
    public static void main(String[] args){
        List<Integer> notas = new ArrayList<>();
        notas.add(10);
        notas.add(20);
        notas.add(30);
        notas.add(40);
        notas.add(50);

        
        int notaTotal = notas.get(0) + notas.get(1) + notas.get(2) + notas.get(3) + notas.get(4);
        int mediaNota = notaTotal / notas.size(); 

        System.out.println("Nota Total: " + notaTotal);
        System.out.println("Média das Notas: " + mediaNota);

    }
}