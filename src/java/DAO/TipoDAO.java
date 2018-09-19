/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Tipo;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author leand
 */
public class TipoDAO extends GenericDAO<Tipo> {
    private EntityManager em = daoHelper.getEM();
    
    public List<Tipo> getTipoList() {
        return em.createNamedQuery("Tipo.findAll").getResultList();
    }
}
