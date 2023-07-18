package ExerciciosSemana3.services;

import ExerciciosSemana3.entities.Cliente;
import ExerciciosSemana3.entities.Filme;
import ExerciciosSemana3.entities.Ingresso;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilmeService {

    public static void cadastrar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o titulo do filme: ");
        String titulo = sc.nextLine();

        System.out.println("Digite o genero do filme: ");
        String genero = sc.nextLine();

        System.out.println("Digite a classificação de idade: ");
        int idadeMinima = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o tempo de duração do filme: ");
        String tempo = sc.nextLine();


        System.out.println("Digite o valor do filme: ");
        double valor = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a tecnologia do filme: ");
        String tecnologia = sc.nextLine();

        Filme filme = new Filme(titulo, genero, idadeMinima, tempo, valor, tecnologia);
        System.out.println("FILME CADASTRADO COM SUCESSO!");
        MenuService.menuFuncionario();
    }

    public static void excluirFilmesSemIngresso() {

        System.out.println("=== EXCLUSÃO DE FILMES SEM INGRESSOS ===");
        System.out.println("Filmes em cartaz:");
        System.out.println(Filme.filmesEmCartaz);
        System.out.println("Informe o ID do filme que deseja excluir:");

        Scanner sc = new Scanner(System.in);

        long idFilmeExcluir = sc.nextLong();
        sc.nextLine();

        Filme filmeExcluir = Filme.buscarFilmePorId(idFilmeExcluir);

        if (filmeExcluir != null) {
            boolean ingressosComprados = false;
            for (Ingresso ingressoComprado : Cliente.ingressosComprados) {
                if (filmeExcluir.equals(ingressoComprado)) {
                    ingressosComprados = true;
                    break;
                }
            }

            if (!ingressosComprados) {
                Filme.filmesEmCartaz.remove(filmeExcluir);
                System.out.println("Filme excluído com sucesso!");
            } else {
                System.out.println("Não é possível excluir o filme. Ingressos já foram comprados.");
            }
        } else {
            System.out.println("Filme não encontrado.");
        }
        MenuService.menuFuncionario();
    }
}