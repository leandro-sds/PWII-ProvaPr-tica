/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BR;

import DAO.TipoDAO;
import Entity.Tipo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leand
 */
public class TipoBR {
    private Tipo tipo;
    private TipoDAO tipoDAO;
    
    public String Cadastrar(String tipo, String descricao) {
        String url;
        
        if(tipo.isEmpty() || descricao.isEmpty()){
            url = "/index";
        } else {
            this.tipo = new Tipo(tipo, descricao);
            tipoDAO = new TipoDAO();
            
            tipoDAO.salvar(this.tipo);
            url = "/index";
        }
        
        return url;
    }
    
    public List<Tipo> getTipoList() {
        tipoDAO = new TipoDAO();
        return tipoDAO.getTipoList();
    }
}
