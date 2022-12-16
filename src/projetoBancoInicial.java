
//import java.util.Locale;
import java.util.Scanner;

public class projetoBancoInicial {
    public static void main(String[] args) throws Exception {
        // Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double saldo, saldoAtual, depositar, sacar;
        saldo = 0;
        int opcao;
        var fim = false;
        saldoAtual = saldo;

        while (fim == false) {
            System.out.print("\n**************************************************\n");
            System.out.print("\nBem vindo!\nO que precisa fazer?\n");
            System.out.print("\nDigite\n1 para ver seu saldo\n2 para depositar\n3 para sacar\n4 para SAIR\n\n");
            opcao = scan.nextInt();
            System.out.print("\n**************************************************\n");

            if (opcao == 1) {
                System.out.printf("\nSeu saldo é de: R$ %.2f\n", (float) saldoAtual);
                saldo = saldoAtual;
            } else if (opcao == 2) {
                System.out.print("\nQual o valor deseja depositar? R$: ");
                depositar = scan.nextDouble();
                saldoAtual = saldo + depositar;
            } else if (opcao == 3) {
                if (saldo <= 0) {
                    System.out.print("Você não possui saldo para sacar!");
                } else {
                    System.out.print("\nQual o valor deseja sacar? R$: ");
                    sacar = scan.nextDouble();

                    if (sacar > saldoAtual) {
                        System.out.print("\nVocê não possui esse saldo para sacar!\n");
                        System.out.print("Seu saldo atual é R$ \n" + saldoAtual);
                    } else {
                        saldoAtual = saldo - sacar;
                        System.out.print("O saldo agora é: R$ " + saldoAtual);
                    }
                }
            } else {
                System.out.println("\nObrigado, volte sempre!");
                fim = true;
            }

        }
    }
}