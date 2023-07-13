package ExerciciosSemana3.Exercicio1.Classes.Cadastros;

import ExerciciosSemana3.Exercicio1.Classes.Filme;
import ExerciciosSemana3.Exercicio1.Classes.MenuFuncionario;
import ExerciciosSemana3.Exercicio1.Classes.MenuInicial;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroFilme {

    public static List<Filme> filmes = new ArrayList<>();


    public static void cadastroFilmes() {
        Scanner sc = new Scanner(System.in);
        Filme filmeCadastrado = new Filme();
        System.out.println("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Titulo do filme: ");
        String titulo = sc.nextLine();
        System.out.println("Gênero: ");
        String genero = sc.nextLine();
        System.out.println("Classificação indicativa: ");
        int classificacao = sc.nextInt();
        sc.nextLine();
        System.out.println("Duração do filme: ");
        String duracao = sc.nextLine();
        System.out.println("Valor do Ingresso: ");
        double valor = sc.nextDouble();
        sc.nextLine();
        System.out.println("Tecnologia (3D/2D): ");
        String tecnologia = sc.nextLine();

        filmeCadastrado.setClassificacao(classificacao);
        filmeCadastrado.setDuracao(duracao);
        filmeCadastrado.setGenero(genero);
        filmeCadastrado.setId(id);
        filmeCadastrado.setTitulo(titulo);
        filmeCadastrado.setTecnologia(tecnologia);
        filmeCadastrado.setValor(valor);

        filmes.add(filmeCadastrado);

        System.out.println("Cadastro do filme ID" + id + " realizado.");

        MenuFuncionario.acessoFuncionario();
    }


    public static void listarFilmes() {
        System.out.println(" * * SEGUE ABAIXO FILMES EM CARTAZ * * ");
        System.out.println("");

        for (Filme filme : filmes) {

            System.out.println(filme);
            MenuFuncionario.acessoFuncionario();

        }
        }
    }







