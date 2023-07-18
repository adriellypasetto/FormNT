package ExerciciosSemana3.entities;

import ExerciciosSemana3.enums.Role;

public class Funcionario extends Usuario {

    public Funcionario(String nome, Role role, int idade, String user, String password) {
        super(nome, role, idade, user, password);
    }
}
