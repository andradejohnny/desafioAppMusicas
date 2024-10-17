package br.alura.spotify.modelos;

public class Podcast extends Audio{
    private String canal;
    private String host;
    private String descricao;

    //Getters and Setters

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 500)
        {
            return 10;
        }
        else
        {
            return 8;
        }
    }
}
