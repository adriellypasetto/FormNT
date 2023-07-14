package ExerciciosSemana3.Exercicio1.Classes;

import ExerciciosSemana3.Exercicio1.Classes.Cadastros.CadastroFilme;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.Scanner;

import static ExerciciosSemana3.Exercicio1.Classes.Cadastros.CadastroFilme.cadastroFilmes;
import static ExerciciosSemana3.Exercicio1.Classes.Cadastros.CadastroFilme.filmes;

public class ExcluirFilme {

    public static void excluirFilme() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Filmes em cartaz:");
        CadastroFilme.listarFilmes();

        System.out.println("Selecione o Id do filme que deseja excluir: ");
        System.out.println();
        int excluirId = sc.nextInt();

        boolean filmeNaLista = false;
        for (Filme filme : filmes) {
            if (filme.getId() == excluirId) {
                filmeNaLista = true;
                System.out.println("FILME EXCLUIDO COM SUCESSO");
                MenuFuncionario.acessoFuncionario();

                if (filme.getPoltronas() < 100) {
                    System.out.println("Não é possível excluir o filme. Ingressos já foram vendidos.");
                    MenuFuncionario.acessoFuncionario();
                    return;


                }
            }
        }
    }
}