package br.maua.models;

import br.maua.enumeracoes.HorarioSistema;
import br.maua.enumeracoes.TiposMembros;
import br.maua.interfaces.PostarMensagem;

import java.util.ArrayList;

public class Funcionarios {
    private String usuario;
    private String email;
    private TiposMembros tiposMembros;
    private HorarioSistema horarioSistema;

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

    @Override
    public String toString() {
        return "Funcionarios{" +
                "usuario='" + usuario + '\'' +
                ", email='" + email + '\'' +
                ", tiposMembros=" + tiposMembros +
                '}';
    }
}
