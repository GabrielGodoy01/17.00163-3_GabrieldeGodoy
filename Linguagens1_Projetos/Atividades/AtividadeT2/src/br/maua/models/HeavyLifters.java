package br.maua.models;

import br.maua.enumeracoes.HorarioSistema;
import br.maua.enumeracoes.TiposMembros;

public class HeavyLifters extends Funcionarios {

    public HeavyLifters(String usuario, String email, TiposMembros tiposMembros) {
        super(usuario, email, tiposMembros);
    }

    @Override
    public void mensagem(HorarioSistema horarioSistema) {
        switch (horarioSistema) {
            case NORMAL:
                System.out.format("%s - Podem contar conosco!\n", this.getUsuario());
                break;
            case EXTRA:
                System.out.format("%s - N00b_qu3_n_Se_r3pita.bat\n", this.getUsuario());
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
