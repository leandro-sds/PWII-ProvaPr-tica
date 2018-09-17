/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import BR.TipoBR;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author leand
 */

@Named(value = "tipoBean")
@RequestScoped
public class TipoBean {
    private String tipo;
    private String descricao;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String Cadastrar() {
        TipoBR tipoBR = new TipoBR();
        return tipoBR.Cadastrar(tipo, descricao);
    }
}
