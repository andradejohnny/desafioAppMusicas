
# Gerenciador de Mídias de Áudio (Spotify Simulação)

Este é um programa simples de gerenciamento de mídias de áudio, incluindo músicas e podcasts. Ele simula as ações de reprodução e curtidas, e permite a classificação de mídia com base em critérios de popularidade. 

## Funcionalidades

- **Músicas**: Gerencie músicas, incluindo o título, artista, gênero e álbum. A classificação é determinada pelo número de reproduções.
- **Podcasts**: Gerencie podcasts com informações sobre o canal, host e descrição. A classificação é determinada pelo número de curtidas.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

### 1. `Audio` (Classe Base)
- Representa uma mídia de áudio genérica com atributos e métodos comuns, como título, duração, reproduções, curtidas e classificação.

### 2. `Musica` (Extende `Audio`)
- Contém informações específicas de uma música, como compositor, artista, gênero e álbum.
- Override no método `getClassificacao()` para retornar uma classificação com base no número de reproduções.

### 3. `Podcast` (Extende `Audio`)
- Contém informações específicas de um podcast, como o canal, host e descrição.
- Override no método `getClassificacao()` para retornar uma classificação com base no número de curtidas.

### 4. `Principal` (Classe Executável)
- Cria instâncias de músicas e podcasts, simula a reprodução e curtidas, e inclui esses objetos em uma lista de preferidos.

## Como Executar

1. Clone este repositório.
2. Compile e execute a classe `Principal.java` para rodar o programa.

## Exemplo de Uso

No código de exemplo da classe `Principal.java`, uma música da banda Kiss chamada "Forever" e um podcast chamado "Flow", apresentado por Igor Coelho, são criados, reproduzidos e curtidos diversas vezes. Esses itens são então adicionados à lista de preferidos.

```java
Musica minhaMusica = new Musica();
minhaMusica.setTitulo("Forever");
minhaMusica.setArtista("Kiss");

for (int i = 0; i < 1000; i++) {
    minhaMusica.reproduz();
}
for (int i = 0; i < 50; i++) {
    minhaMusica.curte();
}

Podcast meuPodcast = new Podcast();
meuPodcast.setTitulo("Flow");
meuPodcast.setHost("Igor Coelho");

for (int i = 0; i < 5000; i++) {
    meuPodcast.reproduz();
}
for (int i = 0; i < 1000; i++) {
    meuPodcast.curte();
}
```

## Requisitos

- Java 8 ou superior

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma _issue_ ou enviar um _pull request_.
