package ExerciciosSemana3.Exercicio1.Classes.Cadastros;

import ExerciciosSemana3.Exercicio1.Classes.Login;
import ExerciciosSemana3.Exercicio1.Classes.MenuCliente;
import ExerciciosSemana3.Exercicio1.Classes.MenuFuncionario;
import ExerciciosSemana3.Exercicio1.Classes.Usuario;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
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

        String senhaBase64 = Base64.getEncoder().encodeToString(senha.getBytes(StandardCharsets.UTF_8));

        usuarioCadastrado.setIdade(idade);
        usuarioCadastrado.setNome(nome);
        usuarioCadastrado.setRole(role);
        usuarioCadastrado.setUser(usuario);
        usuarioCadastrado.setPassword(senhaBase64);

        usuarios.add(usuarioCadastrado);
        Login.telaLogin();

    }


    public static void verificarCredenciais(String user, String senha) {
        boolean usuarioAutenticado = false;

        for (Usuario usuario : usuarios) {

            if (usuario.getUser().equals(user)) {
                byte[] byteSenha = Base64.getDecoder().decode(usuario.getPassword());
                String senhaDescriptografada = new String(byteSenha);

                if (senha.equals(senhaDescriptografada)) {
                    usuarioAutenticado = true;
                    System.out.println("LOGIN AUTORIZADO...");
                    if (usuario.getRole() == 1) {
                        MenuCliente.acessoCliente();
                    } else {
                        MenuFuncionario.acessoFuncionario();
                    }
                } else {
                    System.out.println("Senha incorreta");
                }
            }else {
                System.out.println("USUARIO NÃO ENCONTRADO");
            }
        }
   }
}




