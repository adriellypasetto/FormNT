package ExerciciosSemana3.Exercicio1.Classes;

import java.util.Objects;

public class Usuario {
    private String nome;
    private int role;
    private int idade;
    private String user;
    private String password;

    public Usuario() {
    }

    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Usuario other = (Usuario) obj;
        return Objects.equals(user, other.user);
    }

    public Usuario(String nome, int role, int idade, String user, String password) {
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

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
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

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", role='" + role + '\'' +
                ", idade=" + idade +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
