package ExerciciosSemana3.Exercicio1.Classes;

import java.util.Scanner;

import static ExerciciosSemana3.Exercicio1.Classes.Cadastros.CadastroFilme.filmes;

public class Ingressos {

    public static void vendaIngresso() {
        Scanner sc =  new Scanner(System.in);
        System.out.println("");
        System.out.println("** PAGINA DE VENDAS DE INGRESSOS**");
        System.out.println("");

        System.out.println("ESCOLHA UM FILME ");

        for (Filme filme: filmes) {
            System.out.println(filme);
            System.out.println("");
            System.out.println("FAVOR INFORMAR QUAL O FILME ESCOLHIDO (ID)");

            int opcaoFilme = sc.nextInt();

            if (opcaoFilme == filme.getId());

        }





    }

}
