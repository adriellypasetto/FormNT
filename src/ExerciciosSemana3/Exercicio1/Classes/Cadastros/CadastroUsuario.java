package ExerciciosSemana3.Exercicio1.Classes.Cadastros;

import ExerciciosSemana3.Exercicio1.Classes.Login;
import ExerciciosSemana3.Exercicio1.Classes.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroUsuario {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static String usuario;

    public static List<Usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(List<Usuario> usuarios) {
        CadastroUsuario.usuarios = usuarios;
    }

    public static void realizarCadastroUsuario() {
        Scanner sc = new Scanner(System.in);
        Usuario usuarioCadastrado = new Usuario();
        System.out.println("FAVOR INSERIR OS DADOS ABAIXO PARA REALIZAR O CADASTRO");
        System.out.println("Nome completo: ");
        String nome = sc.nextLine();
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        System.out.println(" Escolha uma das opções, você é cliente ou funcionário? -> [1] Cliente ou [2] Funcionario");
        int role = sc.nextInt();
        if (role == 1) {
            sc.nextLine();
            System.out.println("Selecionado Cliente");
            ;
        } else if (role == 2) {
            sc.nextLine();

            System.out.println("Selecionado Funcionário");
        } else {
            System.out.println("Opção invalida, comece novamente");
        }
        System.out.println("INFORME O NOME DE USUARIO");
         usuario = sc.nextLine();
        System.out.println("DIGITE UMA SENHA");
        String senha = sc.nextLine();

        usuarioCadastrado.setIdade(idade);
        usuarioCadastrado.setNome(nome);
        usuarioCadastrado.setRole(String.valueOf(role));
        usuarioCadastrado.setUser(usuario);

        usuarios.add(usuarioCadastrado);
        Login.telaLogin();

    }


    public static void verificandoCredenciais() {
        String valorUser = Login.user;
        boolean encontrado = false;

        for (Usuario usuario : usuarios) {
            if (usuario.getUser().equals(valorUser)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Usuário encontrado.");
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
    }



