package br.alura.spotify.modelos;

public class Musica extends Audio{
    private String compositor;
    private String artista;
    private String genero;
    private String album;

    //Getters and Setters

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 2000)
        {
            return 10;
        }
        else
        {
            return 7;
        }
    }
}
