package ExerciciosSemana3.services;

import ExerciciosSemana3.entities.Cliente;
import ExerciciosSemana3.entities.Funcionario;
import ExerciciosSemana3.entities.Usuario;
import ExerciciosSemana3.enums.Role;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Iterator;
import java.util.Scanner;

import static ExerciciosSemana3.entities.Usuario.usuarios;

public class UsuarioService {

    public static void cadastrar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");
        String nome = sc.nextLine();


        System.out.println("Digite o tipo de usuário [1 = Funcionario / 2 = Cliente]: ");
        Role role = null;
        int roleEscolhido = sc.nextInt();
        if (roleEscolhido == 1) {
            role = Role.FUNCIONARIO;
        } else if (roleEscolhido == 2) {
            role = Role.CLIENTE;
        } else {
            System.out.println("Tipo de usuário inválido ou inexistente!");
        }

        System.out.println("Digite a idade do usuario: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o seu user name para Login: ");
        String user = sc.nextLine();


        System.out.println("Digite sua senha para Login: ");
        String password = sc.nextLine();

        String passwordCriptografado = Base64.getEncoder().encodeToString(password.getBytes(StandardCharsets.UTF_8));

        if (role == Role.FUNCIONARIO) {
            Usuario usuario = new Funcionario(nome, role, idade, user, passwordCriptografado);
            usuarios.add(usuario);
        } else {
            Usuario usuario = new Cliente(nome, role, idade, user, passwordCriptografado);
            usuarios.add(usuario);
        }

        MenuService.menuInicial();
    }

    public static void logar(String user, String password) {

        Iterator<Usuario> iterator = usuarios.iterator();

        while (iterator.hasNext()) {
            Usuario usuario = iterator.next();

            if (usuario.getUser().equals(user)) {
                byte[] bytePassword = Base64.getDecoder().decode(usuario.getPassword());
                String senhaDescriptografada = new String(bytePassword);

                if (password.equals(senhaDescriptografada)) {
                    System.out.println("USUÁRIO AUTENTICADO COM SUCESSO!!!");
                    if(usuario.getRole().equals(Role.FUNCIONARIO)){
                        MenuService.menuFuncionario();
                    } else {
                        MenuService.menuCliente(usuario);
                    }
                    return;
                } else {
                    System.out.println("Senha inválida!!!");
                    MenuService.menuInicial();
                }
            }
        }
        System.out.println("Usuário inválido!!!");
        MenuService.menuInicial();
    }
}










