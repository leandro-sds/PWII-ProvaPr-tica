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
        List<Livro> livros = null;
        
        Query query = em.createQuery("SELECT l.id, l.titulo, l.autores, l.ano FROM Livro l", Livro.class);
        livros = query.getResultList();
        
        return livros;
    }
}
