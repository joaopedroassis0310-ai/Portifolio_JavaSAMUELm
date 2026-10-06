import java.util.Scanner;


public class qualquercoisapontocom {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Dgite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Olá! Muito prazer em conhecê-lo, Meu nome é " + nome + " e eu tenho anos " + idade + " de idade!" );
   
        Scanner sc2 = new Scanner(System.in);
         System.out.println("Digite um numero: ");
         int numero1 = sc2.nextInt();

         System.out.println("digite outro numero: ");
         int numero2 = sc2.nextInt();

     

          int soma = numero1 + numero2;
          int subtracao = (numero1 - (numero2));
          int multiplicacao = numero1 * numero2;
          int divisao = numero1 / numero2;
          int resto = numero1 % numero2;

          System.out.println(soma);
          System.out.println(subtracao);
          System.out.println(multiplicacao);
          System.out.println(divisao);
          System.out.println(resto);



        


  }
}
