package br.maua.models;

import br.maua.enumeracoes.HorarioSistema;
import br.maua.enumeracoes.TiposMembros;

public class BigBrothers extends Funcionarios{

    public BigBrothers(String usuario, String email, TiposMembros tiposMembros) {
        super(usuario, email, tiposMembros);
    }

    @Override
    public void mensagem(HorarioSistema horarioSistema) {
        switch (horarioSistema) {
            case NORMAL:
                System.out.format("%s - Sempre ajudando as pessoas membros ou não S2!\n", this.getUsuario());
                break;
            case EXTRA:
                System.out.format("%s - ...\n", this.getUsuario());
                break;
            default:
                break;
        }
        
    }

    @Override
    public void apresentarUsuario() {
        System.out.println("\nNome de Usuario: " + this.getUsuario() +
        "\nE-mail: " + this.getEmail() +
        "\nCargo: " + this.getTiposMembros());
        
    }
    
}
