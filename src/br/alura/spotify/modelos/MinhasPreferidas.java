package br.alura.spotify.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio)
    {
        if(audio.getClassificacao() >= 9)
        {
            System.out.println(audio.getTitulo() + "\n--> É considerado sucesso absoluto e preferido por todos!");
        }
        else
        {
            System.out.println(audio.getTitulo() + "\n--> Todo mundo está curtindo!");
        }
    }



}

