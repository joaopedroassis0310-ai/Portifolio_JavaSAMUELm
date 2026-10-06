package ProjetoJava.src;

import java.util.Scanner;

public class main {
    public static void main(String[] args){

    contaCorrente contaCorrente = new contaCorrente();
    contaCorrente.nomeUser = "Marcos Aurélio";
    contaCorrente.banco = "Santander";
    contaCorrente.Saldo = 1500;
    contaCorrente.unidade = 395;
    contaCorrente.numConta = 983298;

    Scanner scanner = new Scanner(System.in);
        System.out.println("Você deseja depositar ou sacar? 1 - Depositar / 2 - Sacar\nDigite sua resposta: ");
    int resposta = scanner.nextInt();
    if(resposta == 1){
        depositar depositar = new depositar();
        depositar.depositar(contaCorrente);

        System.out.println("SALDO - " + contaCorrente.Saldo);
        System.out.println("BANCO - " + contaCorrente.banco);
            System.out.println("NOME DO USUÁRIO - " + contaCorrente.nomeUser);
                System.out.println("UNIDADE DO BANCO - " + contaCorrente.unidade);
                    System.out.println("NÚMERO DA CONTA - " + contaCorrente.numConta);
    }
    else if (resposta == 2){
    sacar sacar = new sacar();
    sacar.sacar(contaCorrente);

    System.out.println("SALDO - " + contaCorrente.Saldo);
        System.out.println("BANCO - " + contaCorrente.banco);
            System.out.println("NOME DO USUÁRIO - " + contaCorrente.nomeUser);
                System.out.println("UNIDADE DO BANCO - " + contaCorrente.unidade);
                    System.out.println("NÚMERO DA CONTA - " + contaCorrente.numConta);
    }else{
        System.out.println("Não existe essa opção, tente novamente mais tarde!");
    }


        

    }
}
