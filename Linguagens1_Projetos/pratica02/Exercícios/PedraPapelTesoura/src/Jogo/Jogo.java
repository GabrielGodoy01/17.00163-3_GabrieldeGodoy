package Jogo;

public class Jogo {
    public String jogada;
    public Jogadores jogadores;


    void x1(String valor){
        if(this.jogadores.ppt.equals(valor)){
            System.out.println("Empate");
        }else{
            if(this.jogadores.ppt.equals("pedra") && valor.equals("tesoura")){
                System.out.println("Jogador 1 venceu");
            }

            if(this.jogadores.ppt.equals("tesoura") && valor.equals("pedra")){
                System.out.println("Jogador 2 venceu");
            }

            if(this.jogadores.ppt.equals("pedra") && valor.equals("papel")){
                System.out.println("Jogador 2 venceu");
            }

            if(this.jogadores.ppt.equals("papel") && valor.equals("pedra")){
                System.out.println("Jogador 1 venceu");
            }

            if(this.jogadores.ppt.equals("papel") && valor.equals("tesoura")){
                System.out.println("Jogador 2 venceu");
            }

            if(this.jogadores.ppt.equals("tesoura") && valor.equals("papel")){
                System.out.println("Jogador 1 venceu");
            }
        }


    }


}
