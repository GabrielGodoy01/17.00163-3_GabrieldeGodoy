package br.maua.models;

import br.maua.enumeracoes.HorarioSistema;
import br.maua.enumeracoes.TiposMembros;
import br.maua.interfaces.IApresentar;
import br.maua.interfaces.IPostarMensagem;

/**
 * Classe concreta para implementar um array de usuários do sistema que implementa PostarMensagem para os usuarios se comunicarem.
 * @author Gabriel de Godoy Braz e Matheus Vivas - 17.00163-3/17.04401-4
 */

public abstract class Funcionarios implements IPostarMensagem, IApresentar{
    private String usuario;
    private String email;
    private TiposMembros tiposMembros;
    private HorarioSistema horarioSistema;

    /**
     * @param usuario Identificação do usuário.
     * @param email Meio de contato com o usuário.
     * @param tiposMembros Cargo dentro da empresa do usuário.
     */
    public Funcionarios(String usuario, String email, TiposMembros tiposMembros) {
        this.usuario = usuario;
        this.email = email;
        this.tiposMembros = tiposMembros;
        this.horarioSistema = HorarioSistema.NORMAL;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getEmail() {
        return email;
    }

    public TiposMembros getTiposMembros() {
        return tiposMembros;
    }

    public void setHorarioSistema(HorarioSistema horarioSistema) {
        this.horarioSistema = horarioSistema;
    }

    public HorarioSistema getHorarioSistema() {
        return horarioSistema;
    }

}
