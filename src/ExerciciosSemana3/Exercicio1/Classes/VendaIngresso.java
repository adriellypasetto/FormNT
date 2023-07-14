package ExerciciosSemana3.Exercicio1.Classes;

import ExerciciosSemana3.Exercicio1.Classes.Cadastros.CadastroFilme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import static ExerciciosSemana3.Exercicio1.Classes.Cadastros.CadastroFilme.filmes;
import static ExerciciosSemana3.Exercicio1.Classes.Cadastros.CadastroUsuario.usuarios;

public class VendaIngresso {

    public static List<Ingressos> ingressosVendidos = new ArrayList<>();


    public static  List<Ingressos> venderIngresso() {
        Ingressos ingresso = new Ingressos();
        Scanner sc = new Scanner(System.in);
        for (Filme filme : filmes) {
            for (Usuario usuario : usuarios) {
                if (usuario.getIdade() >= filme.getClassificacao() && filme.getPoltronas() > 0)
                    CadastroFilme.listarFilmes();
                System.out.println("");
                System.out.println("FAVOR INFORMAR QUAL O FILME ESCOLHIDO (ID)");

                int opcaoFilme = sc.nextInt();
                boolean compraConfirmada = false;
                if (opcaoFilme == filme.getId()) {
                    System.out.print("Digite a quantidade de ingressos que deseja comprar: ");
                    int quantidadeIngressos = sc.nextInt();
                    sc.nextLine();
                    if (quantidadeIngressos > filme.getPoltronas()) {
                        System.out.println("Não há poltronas suficientes disponíveis.");
                        MenuCliente.acessoCliente();
                    } else System.out.println("Você deseja confirmar a compra? [1] SIM / [2] NAO");
                    int confirmaCompra = sc.nextInt();
                    if (confirmaCompra == 1) {
                        System.out.println("Compra realizada com sucesso!!!");
                        filme.setPoltronas(filme.getPoltronas() - quantidadeIngressos);
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
                    ingressosVendidos.add(ingresso);
                } else {
                    System.out.println("Não encontramos um filme com esse número de ID, verifique a lista de filmes abaixo e tente novamente:");
                    System.out.println(filme);
                }
            }
            break;
        }
        return MenuCliente.acessoCliente();
    }
}