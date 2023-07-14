package ExerciciosSemana3.Exercicio1.Classes;

import ExerciciosSemana3.Exercicio1.Classes.Cadastros.CadastroFilme;

import java.util.Scanner;

public class MenuFuncionario {

    public static void acessoFuncionario() {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("*** ACESSOS FUNCIONARIOS ***");
        System.out.println("");
        System.out.println("DIGITE A OPÇÃO DESEJADA ABAIXO:");
        System.out.println("1 - Cadastrar filme ");
        System.out.println("2 - Verificar filmes em cartaz");
        System.out.println("3 - Excluir filmes");
        System.out.println("4 - Voltar ao menu inicial ");

        int opcao = sc.nextInt();

        if (opcao == 1) {
            CadastroFilme.cadastroFilmes();
        } else if (opcao == 2) {
            CadastroFilme.listarFilmes();
            MenuFuncionario.acessoFuncionario();
        } else if (opcao == 3) {
            ExcluirFilme.excluirFilme();
        } else {
            MenuInicial.menuInicial();
        }
    }
}
