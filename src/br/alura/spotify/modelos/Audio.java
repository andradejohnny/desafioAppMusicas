package br.alura.spotify.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    //Getters and Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    //Metodos

    public void reproduz()
    {
        this.totalReproducoes++;
    }

    public void curte()
    {
        this.totalCurtidas++;
    }
}
