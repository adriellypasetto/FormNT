package ExerciciosSemana3.entities;

import ExerciciosSemana3.enums.Role;

import ExerciciosSemana3.services.MenuService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ExerciciosSemana3.entities.Filme.filmesEmCartaz;

public class Cliente extends Usuario {

    public static List<Filme> ingressosComprados = new ArrayList<>();

    public Cliente(String nome, Role role, int idade, String user, String password) {
        super(nome, role, idade, user, password);
    }

    public static void comprarIngresso(){
        for(Filme filme : filmesEmCartaz){
            for(Usuario usuario : usuarios){
                if (usuario.getIdade() >= filme.getIdadeMinima() && filme.getPoltronasDisponiveis() > 0){
                    System.out.println(filme);

                    System.out.println("FAVOR INFORMAR QUAL O FILME ESCOLHIDO (ID)");

                    Scanner sc = new Scanner(System.in);

                    Long opcaoFilme = sc.nextLong();

                    if (opcaoFilme == filme.getId()) {
                        System.out.print("Digite a quantidade de ingressos que deseja comprar: ");
                        int quantidadeIngressos = sc.nextInt();
                        sc.nextLine();

                        if (quantidadeIngressos > filme.getPoltronasDisponiveis()) {
                            System.out.println("Não há poltronas suficientes disponíveis.");
                            MenuService.menuCliente(usuario);

                        } else {
                            System.out.println("Você deseja confirmar a compra? [1] SIM / [2] NAO");
                            int confirmaCompra = sc.nextInt();

                            if (confirmaCompra == 1){
                                System.out.println("Compra realizada com sucesso!");

                                Filme ingressoComprado = Filme.buscarFilmePorId(opcaoFilme);
                                Ingresso ingresso = new Ingresso(ingressoComprado, usuario);

                                ingressosComprados.add(ingressoComprado);

                            } else {
                                System.out.println("Compra cancelada! Retornando ao menu!");
                                MenuService.menuCliente(usuario);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void mostrarIngressosComprados(){
        System.out.println(ingressosComprados);
    }
}
