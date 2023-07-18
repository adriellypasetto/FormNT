package ExerciciosSemana3.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Filme {

    private long id = 0;
    private String titulo;
    private String genero;
    private int idadeMinima;
    private String tempo;
    private double valor;
    private String tecnologia;
    private int poltronasDisponiveis = 100;

    public static List<Filme> filmesEmCartaz = new ArrayList<>();
    private static int contadorFilmes = 0;


    public Filme(String titulo, String genero, int idadeMinima, String tempo, double valor, String tecnologia) {
        contadorFilmes++;

        this.id = contadorFilmes;
        this.titulo = titulo;
        this.genero = genero;
        this.idadeMinima = idadeMinima;
        this.tempo = tempo;
        this.valor = valor;
        this.tecnologia = tecnologia;

        filmesEmCartaz.add(this);

    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getPoltronasDisponiveis() {
        return poltronasDisponiveis;
    }

    public void setPoltronasDisponiveis(int poltronasDisponiveis) {
        this.poltronasDisponiveis = poltronasDisponiveis;
    }

    public static Filme buscarFilmePorId(long id) {
        for (Filme filme : filmesEmCartaz) {
            if (filme.getId() == id) {
                return filme;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return id == filme.id && idadeMinima == filme.idadeMinima && Double.compare(filme.valor, valor) == 0 && poltronasDisponiveis == filme.poltronasDisponiveis && titulo.equals(filme.titulo) && genero.equals(filme.genero) && tempo.equals(filme.tempo) && tecnologia.equals(filme.tecnologia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, genero, idadeMinima, tempo, valor, tecnologia, poltronasDisponiveis);
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", idadeMinima=" + idadeMinima +
                ", tempo='" + tempo + '\'' +
                ", valor=" + valor +
                ", tecnologia='" + tecnologia + '\'' +
                ", poltronasDisponiveis=" + poltronasDisponiveis +
                '}';
    }
}
