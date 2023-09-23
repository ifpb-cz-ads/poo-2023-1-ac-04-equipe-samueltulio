//Carvalho & Teixeira atividade prática 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int numero;

        System.out.println("Informe o nome do usuário: ");
        nome = input.nextLine();
        System.out.println("Informe o número da conta do usuário: ");
        numero = input.nextInt();
        Conta user = new Conta(nome, numero);

        boolean menu = true;
        int option;
        float value = 0;
        while(menu == true) {
            System.out.println("Informe o que gostaria de fazer (1 para depósito e 2 para saque e 3 para visualziar seus dados).");
            option = input.nextInt();
            switch(option) {
                case 1:
                    System.out.println("Informe o valor para fazer o depósito:");
                    value = input.nextFloat();
                    if(user.deposito(value) == true) {
                        System.out.println("Depósito efetuado com sucesso!");
                    } else {
                        System.out.println("Depósito não efetuado!");
                    }
                    break;
                case 2:
                    System.out.println("Informe o valor para fazer o saque:");
                    value = input.nextFloat();
                    if(user.sacar(value) == true) {
                        System.out.println("Saque efetuado com sucesso!");
                    } else {
                        System.out.println("Saque não efetuado!");
                    }
                    break;
                case 3:
                    System.out.printf("O usuário %s é retentor da conta %d e possui R$%.2f de saldo.", user.getTitular(), user.getNumero(), user.getSaldo());
                    break;
                default: 
                    menu = false;
            }
        }

        input.close();
    }
}
