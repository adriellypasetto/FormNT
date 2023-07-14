package ExerciciosSemana3.Exercicio1.Classes;

import java.util.Scanner;

import static ExerciciosSemana3.Exercicio1.Classes.Cadastros.CadastroFilme.filmes;
import static ExerciciosSemana3.Exercicio1.Classes.Cadastros.CadastroUsuario.usuarios;

public class Ingressos {

    public static void vendaIngresso() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("** PAGINA DE VENDAS DE INGRESSOS**");
        System.out.println("");

        System.out.println("ESCOLHA UM FILME ");

        for (Filme filme : filmes) {
            for (Usuario usuario : usuarios) {
                if (usuario.getIdade() >= filme.getClassificacao() && filme.getPoltronas() > 0)
                    System.out.println(filme);
                System.out.println("");
                System.out.println("FAVOR INFORMAR QUAL O FILME ESCOLHIDO (ID)");

                int opcaoFilme = sc.nextInt();
                boolean compraConfirmada = false;
                if (opcaoFilme == filme.getId()) {
                    System.out.println("Você deseja confirmar a compra? [1] SIM / [2] NAO");
                    int confirmaCompra = sc.nextInt();
                    if (confirmaCompra == 1) {
                        System.out.println("Compra realizada com sucesso!!!");
                        filme.setPoltronas();
                        compraConfirmada = true;
                    } else if (confirmaCompra == 2) {
                        System.out.println("Compra cancelada, retornando ao menu");
                        MenuCliente.acessoCliente();
                    } else {
                        System.out.println("Opção inválida, retornando ao menu");
                        MenuCliente.acessoCliente();
                        {
                            System.out.println();
                        }
                    }
                } else {
                    System.out.println("Não encontramos um filme com esse número de ID, verifique a lista de filmes abaixo e tente novamente:");
                    System.out.println(filme);
                }
            }
        }
    }
}
