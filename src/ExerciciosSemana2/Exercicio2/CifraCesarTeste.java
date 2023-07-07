package ExerciciosSemana2.Exercicio2;

import java.util.Scanner;

import static ExerciciosSemana2.Exercicio2.CifraCesar.cifraCesar;

public class CifraCesarTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto ou uma palavra: ");
        String textoEntrada = sc.nextLine();

        System.out.print("Digite o número da chave: ");
        int chave = sc.nextInt();

        System.out.println("Selecione uma opção:");
        System.out.println("1 - Criptografar");
        System.out.println("2 - Descriptografar");
        int opcao = sc.nextInt();

        if (opcao == 1 || opcao == 2) {
            String resultado = cifraCesar(textoEntrada, chave, opcao);

            if (opcao == 1) {
                System.out.println("Texto criptografado: " + resultado);
            } else {
                System.out.println("Texto descriptografado: " + resultado);
            }
        } else {
            System.out.println("Opção inválida. Por favor, comece novamente.");
        }

        sc.close();
    }
}

