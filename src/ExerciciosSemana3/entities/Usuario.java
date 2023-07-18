package ExerciciosSemana3.entities;

import ExerciciosSemana3.enums.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Usuario {

    private String nome;
    private Role role;
    private int idade;
    private String user;
    private String password;

    public static List<Usuario> usuarios = new ArrayList<>();

    public Usuario(String nome, Role role, int idade, String user, String password) {
        this.nome = nome;
        this.role = role;
        this.idade = idade;
        this.user = user;
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void listarFilmesEmCartaz(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return idade == usuario.idade && nome.equals(usuario.nome) && role == usuario.role && user.equals(usuario.user) && password.equals(usuario.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, role, idade, user, password);
    }
}
