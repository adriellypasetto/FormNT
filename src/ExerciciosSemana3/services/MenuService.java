package ExerciciosSemana3.services;

import ExerciciosSemana3.entities.Cliente;
import ExerciciosSemana3.entities.Filme;
import ExerciciosSemana3.entities.Funcionario;
import ExerciciosSemana3.entities.Usuario;

import java.util.Scanner;

public class MenuService {

    public static void menuInicial(){

        System.out.println("MENU INICIAL - CINEMA CINEDRY");
        System.out.println("Escolha uma das seguintes opções: ");
        System.out.println("1 - CADASTRAR-SE ");
        System.out.println("2 - FAZER LOGIN");
        System.out.println("3 - SAIR");

        Scanner sc = new Scanner(System.in);

        int opcaoEscolhida = sc.nextInt();
        sc.nextLine();

        switch (opcaoEscolhida){
            case 1:
                UsuarioService.cadastrar();
                break;
            case 2:
                System.out.println("Digite seu usuário: ");
                String user = sc.nextLine();

                System.out.println("Digite sua senha: ");
                String password = sc.nextLine();

                UsuarioService.logar(user, password);
                break;
            case 3:
                MenuService.menuInicial();
                break;
            default:
                System.out.println("Opção inválida!!!");
                MenuService.menuInicial();
        }
    }

    public static void menuFuncionario(){
        System.out.println("BEM-VINDO ::: ACESSO FUNCIONÁRIO :::");

        System.out.println("DIGITE A OPÇÃO DESEJADA ABAIXO:");
        System.out.println("1 - Cadastrar filme.");
        System.out.println("2 - Verificar filmes em cartaz.");
        System.out.println("3 - Excluir filmes.");
        System.out.println("4 - Voltar ao menu inicial.");

        Scanner sc = new Scanner(System.in);

        int opcaoEscolhida = sc.nextInt();
        sc.nextLine();

        switch (opcaoEscolhida){
            case 1:
                FilmeService.cadastrar();
                break;
            case 2:
                System.out.println(Filme.filmesEmCartaz);
                MenuService.menuFuncionario();
                break;
            case 3:
                FilmeService.excluirFilmesSemIngresso();
                break;
            case 4:
                MenuService.menuInicial();
                break;
            default:
                System.out.println("Opção inválida!!!");
                MenuService.menuFuncionario();
        }
    }

    public static void menuCliente(Usuario usuario){
        System.out.println("BEM-VINDO ::: ACESSO CLIENTE :::");

        System.out.println("DIGITE A OPÇÃO DESEJADA ABAIXO:");
        System.out.println("1 - Comprar ingresso.");
        System.out.println("2 - Verificar filmes em cartaz.");
        System.out.println("3 - Visualizar ingresso comprado.");
        System.out.println("4 - Voltar ao menu inicial.");

        Scanner sc = new Scanner(System.in);

        int opcaoEscolhida = sc.nextInt();
        sc.nextLine();

        switch (opcaoEscolhida){
            case 1:
                Cliente.comprarIngresso(usuario);
                break;
            case 2:
                System.out.println(Filme.filmesEmCartaz);
                MenuService.menuCliente(usuario);
                break;
            case 3:
                Cliente.mostrarIngressosComprados(usuario);
                break;
            case 4:
                MenuService.menuInicial();
                break;
            default:
                System.out.println("Opção inválida!!!");
                MenuService.menuCliente(usuario);
        }


    }


}
