package ExerciciosSemana3.Exercicio1.Classes;

import ExerciciosSemana3.Exercicio1.Classes.Cadastros.CadastroUsuario;

import java.util.Scanner;

public abstract class MenuInicial {

    public static void menuInicial() {
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU INICIAL -  VENDAS DE INGRESSOS PARA CINEMA");
        System.out.println("Escolha uma opção :");
        System.out.println("1 - CADASTRAR-SE ");
        System.out.println("2 - FAZER LOGIN");
        System.out.println("3 - SAIR ");


        int opcao = sc.nextInt();

        if (opcao == 1 ){
            sc.nextLine();
             CadastroUsuario.realizarCadastroUsuario();
        } else if (opcao == 2) {

        }else
            System.out.println("Sistema encerrado");


    }

}
