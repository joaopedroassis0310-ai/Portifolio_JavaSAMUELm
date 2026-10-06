import java.util.Scanner;

public class AnoEmprestimoExpressaoA5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite número de dias do ano: ");
        int diasAno = scanner.nextInt();
        
        if(diasAno < 366){
            System.out.print("Este ano é ano comum \n");
        }else{
            System.out.print("Este ano é ano bissexto \n");
        }

         

        Scanner scanner2 = new Scanner(System.in);
            System.out.print("Digite sua idade: \n");
            int idade = scanner2.nextInt();

            System.out.print("Digite sua renda: \n");
            float renda = scanner2.nextFloat();     

         int idadeMinima = 18;
         double rendaMinima = 1.500;
         boolean historicoMinimo = true;


        if(idade < idadeMinima || renda < rendaMinima ){
            System.out.print("Não é possível fazer seu empréstimo.");
        }else{
            System.out.print("Seu pedido de empréstimo foi aceito.");
        }





    }
    
}