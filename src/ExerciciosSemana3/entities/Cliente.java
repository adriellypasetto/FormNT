package ExerciciosSemana3.entities;

import ExerciciosSemana3.enums.Role;

import ExerciciosSemana3.services.MenuService;

import java.util.Scanner;



public class Cliente extends Usuario {

   // public static List<Ingresso> ingressosComprados = new ArrayList<>();

    public Cliente(String nome, Role role, int idade, String user, String password) {
        super(nome, role, idade, user, password);
    }


    public static void comprarIngresso(Usuario usuario) {

        System.out.println("=== FILMES EM CARTAZ ===");
        for (Filme filme : Filme.filmesEmCartaz) {
            System.out.println(filme.getId() + " - " + filme.getTitulo());
        }

        System.out.println("FAVOR INFORMAR QUAL O FILME ESCOLHIDO (ID)");

        Scanner sc = new Scanner(System.in);

        long opcaoFilme = sc.nextLong();
        sc.nextLine();

        Filme filmeEscolhido = Filme.buscarFilmePorId(opcaoFilme);

        if (filmeEscolhido != null && filmeEscolhido.getPoltronasDisponiveis() > 0) {
            if (usuario.getIdade() >= filmeEscolhido.getIdadeMinima()) {
                System.out.print("Digite a quantidade de ingressos que deseja comprar: ");
                int quantidadeIngressos = sc.nextInt();
                sc.nextLine();

                if (quantidadeIngressos > filmeEscolhido.getPoltronasDisponiveis()) {
                    System.out.println("Não há poltronas suficientes disponíveis.");
                } else {
                    System.out.println("Você deseja confirmar a compra do filme: " + filmeEscolhido.getTitulo() + "? [1] SIM / [2] NÃO");
                    int confirmaCompra = sc.nextInt();

                    if (confirmaCompra == 1) {
                        System.out.println("Compra realizada com sucesso!");
                        Ingresso ingressoCompradoAgora = new Ingresso(filmeEscolhido, usuario);
                        Usuario.ingressosComprados.add(ingressoCompradoAgora);

                        int ingressosAnteriores = 0;
                        for (Ingresso ingressoComprado : ingressosComprados) {
                            if (ingressoComprado.equals(filmeEscolhido)) {
                                ingressosAnteriores++;
                            }
                        }

                        int totalIngressosComprados = ingressosAnteriores + quantidadeIngressos;

                        System.out.println("Você comprou " + totalIngressosComprados + " ingresso(s) para o filme " + filmeEscolhido.getTitulo());

                        for (int i = 0; i < quantidadeIngressos; i++) {
                            Ingresso ingresso = new Ingresso(filmeEscolhido, usuario);
                        }

                        MenuService.menuCliente(usuario);
                        return;
                    } else {
                        System.out.println("Compra cancelada! Retornando ao menu!");
                    }
                }
            } else {
                System.out.println("Você não atende à classificação de idade mínima para este filme.");
            }
        } else {
            System.out.println("Filme não encontrado ou não há poltronas disponíveis.");
        }

        MenuService.menuCliente(usuario);
    }

    public static void mostrarIngressosComprados(Usuario usuario) {
        if (Usuario.ingressosComprados.isEmpty()) {
            System.out.println("Nenhum ingresso comprado.");
        } else {
            System.out.println("Ingressos comprados (" + Usuario.ingressosComprados.size() + "):");
            for (int i = 0; i < Usuario.ingressosComprados.size(); i++) {
                Ingresso ingresso = Usuario.ingressosComprados.get(i);
                System.out.println("Ingresso " + (i + 1) + ":");
                System.out.println("Filme: " + ingresso.getFilme().getTitulo());
            }
        }
        MenuService.menuCliente(usuario);
    }
}

