/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BR;

import DAO.AssuntoDAO;
import Entity.Assunto;

/**
 *
 * @author leand
 */
public class AssuntoBR {

    private Assunto assunto;
    private AssuntoDAO assuntoDAO;

    public String Cadastrar(String observacao, String informacao) {
        String url;
        
        if (observacao.isEmpty() || informacao.isEmpty()) {
            url = "/index";
        } else {
            assuntoDAO = new AssuntoDAO();
            assunto = new Assunto(informacao, observacao);
            assuntoDAO.salvar(assunto);
            url = "/index";
        }
        return url;
    }
}
