/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BR;

import DAO.LivroDAO;
import Entity.Assunto;
import Entity.Livro;
import Entity.Tipo;
import java.util.List;

/**
 *
 * @author leand
 */
public class LivroBR {
    private Livro livro;
    private LivroDAO livroDAO;
    
    public String Cadastrar(String titulo, String autores, String ano, String editora, String cidade, String resumo, int assuntoID, int tipoID) {
        String url;
        
        if(titulo.isEmpty() || autores.isEmpty() || ano.isEmpty() || cidade.isEmpty() || resumo.isEmpty() || assuntoID == 0 || tipoID == 0) {
            System.out.println("Erro");
            url = "";
        } else {
            livro = new Livro(titulo, autores, editora, ano, cidade, resumo, assuntoID, tipoID);
            livroDAO = new LivroDAO();
            livroDAO.salvar(livro);
            url = "/index";
        }
        
        return url;
    }
    
    public List<Livro> getLivroList() {
        livroDAO = new LivroDAO();
        return livroDAO.getLivroList();
    }
}
