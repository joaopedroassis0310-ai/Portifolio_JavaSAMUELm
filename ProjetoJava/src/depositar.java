package ProjetoJava.src;

import java.util.Scanner;

public class depositar extends contaCorrente {

    void depositar(contaCorrente contaAlvo) {

        Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o valor que deseja depositar: ");
            double valor = scanner.nextDouble();

        if(valor > 0){
            contaAlvo.Saldo = contaAlvo.Saldo + valor;
        }else{
            System.out.println("Impossivel completar esta ação");
        }
        scanner.close();
    }
}
