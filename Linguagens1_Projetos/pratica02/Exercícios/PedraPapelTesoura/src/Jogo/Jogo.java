package Jogo;

public class Jogo {
    public String jogada;
    public Jogadores jogadores;


    void primeiro(String valor){
        if(this.jogadores.ppt.equals(valor)){
            System.out.println("certo");
        }else{
            System.out.println("erou");
        }
    }


}
