package br.maua.models;

import br.maua.enumeracoes.HorarioSistema;
import br.maua.enumeracoes.TiposMembros;

public class ScriptGuys extends Funcionarios{

    public ScriptGuys(String usuario, String email, TiposMembros tiposMembros) {
        super(usuario, email, tiposMembros);
    }

    @Override
    public void mensagem(HorarioSistema horarioSistema) {
        switch (horarioSistema) {
            case NORMAL:
                System.out.format("%s - Prazer em ajudar novos amigos de código!\n", this.getUsuario());
                break;
            case EXTRA:
                System.out.format("%s - QU3Ro_S3us_r3curs0s.py\n", this.getUsuario());
                break;
            default:
                break;
        }
        
    }

    @Override
    public void apresentarUsuario() {
        System.out.println("\nNome de Usuario: " + this.getUsuario() +
        "\nE-mail: " + this.getEmail() +
        "\nCargo: " + this.getTiposMembros() + "\n");
        
    }
    
}
