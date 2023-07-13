package ExerciciosSemana3.Exercicio1.Classes;

import ExerciciosSemana3.Exercicio1.Classes.Cadastros.CadastroUsuario;

import java.util.Scanner;

public class Login {
    public static String user ;
    public static String senha ;



    public static  void telaLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** FAÇA SEU LOGIN COM SUAS CREDENCIAIS ABAIXO ***");
        System.out.println("Usuario: ");
        String user = sc.nextLine();
        System.out.println("Senha: ");
        String senha = sc.nextLine();
        CadastroUsuario.verificandoCredenciais();

    };



    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }




    }



