/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import BR.AssuntoBR;
import BR.LivroBR;
import BR.TipoBR;
import DAO.LivroDAO;
import Entity.Assunto;
import Entity.Livro;
import Entity.Tipo;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author leand
 */

@Named(value = "livroBean")
@RequestScoped
public class LivroBean {
    private String titulo;
    private String autores;
    private String ano;
    private String editora;
    private String cidade;
    private String resumo;
    private int assuntoid;
    private int tipoid;
    private List<Assunto> assuntoidList;
    private List<Tipo> tipoidList;
    private List<Livro> livrolist = new ArrayList<Livro>();
    private LivroBR livrobr = new LivroBR();
    private AssuntoBR assuntobr = new AssuntoBR();
    private TipoBR tipobr = new TipoBR();

    public LivroBean() {
        this.assuntoidList = assuntobr.getLista();
        this.tipoidList = tipobr.getTipoList();
        this.livrolist = livrobr.getLivroList();
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    public List<Livro> getLivrolist() {
        return livrolist;
    }
    
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getAssuntoid() {
        return assuntoid;
    }

    public void setAssuntoid(int assuntoid) {
        this.assuntoid = assuntoid;
    }

    public int getTipoid() {
        return tipoid;
    }

    public void setTipoid(int tipoid) {
        this.tipoid = tipoid;
    }
    
    public List<Assunto> getAssuntoIDList() {
        return assuntoidList;
    }

    public List<Tipo> getTipoidList() {
        return tipoidList;
    }

    public void setTipoidList(List<Tipo> tipoidList) {
        this.tipoidList = tipoidList;
    }
    
    public String Cadastrar() {
        LivroBR livrobr = new LivroBR();
        return livrobr.Cadastrar(titulo, autores, ano, editora, cidade, resumo, assuntoid, tipoid);
    }

    
}
