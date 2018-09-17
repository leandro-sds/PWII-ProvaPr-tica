/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import BR.AssuntoBR;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author leand
 */

@Named(value = "assuntoBean")
@RequestScoped
public class AssuntoBean {
    private String observacao;
    private String informacao;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }
    
    public String Cadastrar() {
        AssuntoBR assuntoBR = new AssuntoBR();
        return assuntoBR.Cadastrar(observacao, informacao);
    }
}
