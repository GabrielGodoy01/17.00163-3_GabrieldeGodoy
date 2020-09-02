package br.maua.Model;

public class PokCarta {
    private String url;
    private String id;
    private String nome;
    private String raridade;
    private String serie;
    private String colecao;

    public PokCarta(String nome, String id, String raridade, String serie, String colecao, String url) {
        this.url = url;
        this.id = id;
        this.nome = nome;
        this.raridade = raridade;
        this.serie = serie;
        this.colecao = colecao;
    }

    @Override
    public String toString() {
        return "PokCarta{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", raridade='" + raridade + '\'' +
                ", serie='" + serie + '\'' +
                ", colecao='" + colecao + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
