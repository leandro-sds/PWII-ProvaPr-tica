/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Assunto;
import Entity.Livro;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;

/**
 *
 * @author leand
 */
public class LivroDAO extends GenericDAO<Livro>{
    private AssuntoDAO assuntodao = new AssuntoDAO();
    
    public List<Assunto> getAssuntoIDList() {
        return assuntodao.getLista();
    }
    
    public List<Livro> getLivroList() {
        EntityManager em = daoHelper.getEM();
        List<Livro> livros;
        
        Query query = em.createNamedQuery("Livro.findAll", Livro.class);
        livros = query.getResultList();
        
        return livros;
    }
}
