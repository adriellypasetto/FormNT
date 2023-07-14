package ExerciciosSemana3.Exercicio1.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ExerciciosSemana3.Exercicio1.Classes.Cadastros.CadastroFilme.filmes;
import static ExerciciosSemana3.Exercicio1.Classes.Cadastros.CadastroUsuario.usuarios;

public class Ingressos {
    private Filme filme;
    private Usuario cliente;
    private int poltrona;

    public Ingressos() {
    }

    public Ingressos(Filme filme, Usuario cliente, int poltrona) {
        this.filme = filme;
        this.cliente = cliente;
        this.poltrona = poltrona;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }
}

