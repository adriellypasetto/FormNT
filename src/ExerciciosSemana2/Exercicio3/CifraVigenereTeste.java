package ExerciciosSemana2.Exercicio3;

import java.util.Scanner;

import static ExerciciosSemana2.Exercicio3.CifraVigenere.cifraVigenere;


public class CifraVigenereTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = sc.nextLine();
        System.out.println("Digite a chave (palavra) : ");
        String chave = sc.nextLine();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Criptografar");
        System.out.println("2 - Descriptografar");
        int opcao = sc.nextInt();

        String resultado;

        if (opcao == 1) {
            resultado = cifraVigenere(texto, chave, true);
            System.out.println("Texto criptografado: " + resultado);
        } else if (opcao == 2) {
            resultado = cifraVigenere(texto, chave, false);
            System.out.println("Texto descriptografado: " + resultado);
        } else {
            System.out.println("Opção inválida. Por favor, comece novamente.v");
        }
    }


}


