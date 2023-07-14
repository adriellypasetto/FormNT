package ExerciciosSemana3.Exercicio1.Classes;

import ExerciciosSemana3.Exercicio1.Classes.Cadastros.CadastroUsuario;

import java.util.Scanner;

public class Login {

    public static  void telaLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** FAÇA SEU LOGIN COM SUAS CREDENCIAIS ABAIXO ***");
        System.out.println("Usuario: ");
        String user = sc.nextLine();
        System.out.println("Senha: ");
        String senha = sc.nextLine();
        CadastroUsuario.verificarCredenciais(user, senha);

    };
}



