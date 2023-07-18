package ExerciciosSemana3.entities;

public class Ingresso {

    private Filme filme;
    private Usuario usuario;

    public Ingresso(Filme filme, Usuario usuario) {
        this.filme = filme;
        this.usuario = usuario;

        if (filme.getPoltronasDisponiveis() > 0) {
            filme.setPoltronasDisponiveis(filme.getPoltronasDisponiveis() - 1);

        } else {
            System.out.println("INGRESSO ESGOTADO PARA A SESSÃO!");
        }
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
