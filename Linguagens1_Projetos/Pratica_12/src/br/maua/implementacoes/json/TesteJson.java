package br.maua.implementacoes.json;

import br.maua.projeto.model.Jogo;
import br.maua.projeto.parsers.JogoParser;
import org.json.JSONObject;

public class TesteJson {
    public static void main(String[] args) {
        Jogo jogo1 = new Jogo("PC", "Cyberpunk");
        JSONObject json = JogoParser.toJson(jogo1);
        System.out.println("Formato toString: " + jogo1);
        System.out.println("------------------------");
        System.out.println("Formato JSON: " + json);
    }

}
