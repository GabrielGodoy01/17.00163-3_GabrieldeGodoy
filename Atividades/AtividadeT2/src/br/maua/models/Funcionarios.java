package br.maua.models;

import br.maua.enumeracoes.HorarioSistema;
import br.maua.enumeracoes.TiposMembros;
import br.maua.interfaces.PostarMensagem;

import java.util.ArrayList;

public class Funcionarios implements PostarMensagem{
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
                "Nome de Usuario = '" + usuario + '\'' +
                ", E-mail = '" + email + '\'' +
                ", Cargo = " + tiposMembros +
                '}';
    }

    @Override
    public void mensagem(ArrayList<Funcionarios> funcionarios) {
        for(int i = 0; i < funcionarios.size(); i++) {
            TiposMembros tiposMembros = funcionarios.get(i).getTiposMembros();
            //Por favor não nos julgue pelos feitos a seguir:
            if(tiposMembros == TiposMembros.MOBILEMEMBERS && horarioSistema == HorarioSistema.NORMAL){
                System.out.println(funcionarios.get(i).getUsuario() + " -  HAPPY CODING!");
            }else if(tiposMembros == TiposMembros.MOBILEMEMBERS && horarioSistema == HorarioSistema.EXTRA){
                System.out.println(funcionarios.get(i).getUsuario() + " -  Happy_C0d1ng. Maskers");
            }else if(tiposMembros == TiposMembros.HEAVYLIFTERS && horarioSistema == HorarioSistema.NORMAL){
                System.out.println(funcionarios.get(i).getUsuario() + " -  Podem contar conosco!");
            }else if(tiposMembros == TiposMembros.HEAVYLIFTERS && horarioSistema == HorarioSistema.EXTRA){
                System.out.println(funcionarios.get(i).getUsuario() + " -  N00b_qu3_n_Se_r3pita.bat");
            }else if(tiposMembros == TiposMembros.SCRIPTGUYS && horarioSistema == HorarioSistema.NORMAL){
                System.out.println(funcionarios.get(i).getUsuario() + " -  Prazer em ajudar novos amigos de código!");
            }else if(tiposMembros == TiposMembros.SCRIPTGUYS && horarioSistema == HorarioSistema.EXTRA){
                System.out.println(funcionarios.get(i).getUsuario() + " -  QU3Ro_S3us_r3curs0s.py");
            }else if(tiposMembros == TiposMembros.BIGBROTHERS && horarioSistema == HorarioSistema.NORMAL){
                System.out.println(funcionarios.get(i).getUsuario() + " -  Sempre ajudando as pessoas membros ou não S2!");
            }else if(tiposMembros == TiposMembros.BIGBROTHERS && horarioSistema == HorarioSistema.EXTRA){
                System.out.println(funcionarios.get(i).getUsuario() + " -  ...");
            }
        }
    }
}
