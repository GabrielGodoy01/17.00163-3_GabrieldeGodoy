package br.maua.models;

import br.maua.enumeracoes.HorarioSistema;
import br.maua.enumeracoes.TiposMembros;

public class MobileMembers extends Funcionarios {

    public MobileMembers(String usuario, String email, TiposMembros tiposMembros) {
        super(usuario, email, tiposMembros);
    }

    @Override
    public void mensagem(HorarioSistema horarioSistema) {
        switch (horarioSistema) {
            case NORMAL:
                System.out.format("%s - Happy  Coding!\n", this.getUsuario());
                break;
            case EXTRA:
                System.out.format("%s - Happy_C0d1ng. Maskers\n", this.getUsuario());
                break;
            default:
                break;
        }
        
    }
    
    @Override
    public void apresentarUsuario() {
        System.out.println("\nNome de Usuario: " + this.getUsuario() +
        "\nE-mail: " + this.getEmail() +
        "\nCargo: " + this.getTiposMembros()+ "\n");
        
    }
}
