package ProjetoJava.src;

import java.util.Scanner;

public class sacar extends contaCorrente {

    void sacar(contaCorrente contaAlvo) {

        Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o valor que deseja sacar: ");
            double valor = scanner.nextDouble();

            if(valor > contaAlvo.Saldo){
                System.out.println("Impossível sacar o valor solicitado, saldo insuficiente.");
            }
            if(valor < contaAlvo.Saldo){
                System.out.println("Impossível sacar o valor solicitado, saldo insuficiente.");
            }else{
                contaAlvo.Saldo = contaAlvo.Saldo - valor;
            }

        scanner.close();
    }
}