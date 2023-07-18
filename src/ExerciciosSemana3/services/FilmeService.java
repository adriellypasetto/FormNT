package ExerciciosSemana3.services;

import ExerciciosSemana3.entities.Filme;

import java.util.Scanner;

public class FilmeService {

    public static void cadastrar(){
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

        System.out.println("Digite a tecnologia do filme: ");
        String tecnologia = sc.nextLine();

        Filme filme = new Filme(titulo, genero, idadeMinima, tempo, valor, tecnologia);
        System.out.println("FILME CADASTRADO COM SUCESSO!");
        MenuService.menuFuncionario();
    }
}
