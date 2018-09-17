/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author leand
 */
@Entity
@Table(name = "assunto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Assunto.findAll", query = "SELECT a FROM Assunto a")
    , @NamedQuery(name = "Assunto.findById", query = "SELECT a FROM Assunto a WHERE a.id = :id")
    , @NamedQuery(name = "Assunto.findByInformacao", query = "SELECT a FROM Assunto a WHERE a.informacao = :informacao")
    , @NamedQuery(name = "Assunto.findByObservacao", query = "SELECT a FROM Assunto a WHERE a.observacao = :observacao")})
public class Assunto implements GenericEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Informacao")
    private String informacao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Observacao")
    private String observacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "assuntoID")
    private Collection<Livro> livroCollection;

    public Assunto() {
    }

    public Assunto(Integer id) {
        this.id = id;
    }
    
    public Assunto(String informacao, String observacao) {
        this.informacao = informacao;
        this.observacao = observacao;
    }

    public Assunto(Integer id, String informacao, String observacao) {
        this.id = id;
        this.informacao = informacao;
        this.observacao = observacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @XmlTransient
    public Collection<Livro> getLivroCollection() {
        return livroCollection;
    }

    public void setLivroCollection(Collection<Livro> livroCollection) {
        this.livroCollection = livroCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Assunto)) {
            return false;
        }
        Assunto other = (Assunto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Assunto[ id=" + id + " ]";
    }
    
}
