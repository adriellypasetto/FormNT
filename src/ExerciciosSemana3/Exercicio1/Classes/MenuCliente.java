package ExerciciosSemana3.Exercicio1.Classes;

import ExerciciosSemana3.Exercicio1.Classes.Cadastros.CadastroFilme;

import java.util.List;
import java.util.Scanner;

public class MenuCliente {


    public static List<Ingressos> acessoCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("*** ACESSOS CLIENTE ***");
        System.out.println("");
        System.out.println("DIGITE A OPÇÃO DESEJADA ABAIXO:");
        System.out.println("1 - Comprar ingresso ");
        System.out.println("2 - Verificar filmes em cartaz");
        System.out.println("3 - Visualizar ingresso comprado");
        System.out.println("4 - Voltar ao menu inicial ");

        int opcao = sc.nextInt();

        if (opcao == 1) {
            VendaIngresso.venderIngresso();
        } else if (opcao == 2) {
            CadastroFilme.listarFilmes();

        } else if (opcao == 3) {
            System.out.println("INSERIR METODO VISUALIZAR INGRESSO");
        } else {
            MenuInicial.menuInicial();
        }


        return null;
    }
}
