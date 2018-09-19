/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Assunto;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author leand
 */
public class AssuntoDAO extends GenericDAO<Assunto>{
    private EntityManager em = daoHelper.getEM();
    
    public List<Assunto> getLista() {
        return em.createNamedQuery("Assunto.findAll").getResultList();
    }
}
