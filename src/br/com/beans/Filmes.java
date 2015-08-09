/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 *
 * @author Anderson
 */

@Entity
@Table(name="FILMES")
public class Filmes implements Serializable{
    
    @Id
    @Column(name="ID")
    @SequenceGenerator(name="SEQ", sequenceName = "SEQ_FILME_ID", allocationSize = 1)
    @GeneratedValue(generator = "SEQ", strategy = GenerationType.SEQUENCE)
    private Integer codigo;
    
    @Column(name="NOME", length = 40, nullable = false)
    private String nome;
    
    @Column(name="ANO", nullable = false)
    private int ano;
    
    @Column(name="DISTRIBUIDORA", length = 40, nullable = false)
    private String distribuidora;
    
    @Column(name="GENERO", length = 15, nullable = false)
    private String genero;
    
    //@OneToMany(mappedBy = "filmes")
    //@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    //@LazyCollection(LazyCollectionOption.EXTRA)    
    //private Collection<Ator> listaAtores = new ArrayList<Ator>();

    
    public Filmes() {
        
    }   
    
    
    //public Collection<Ator> getListaAtores() {
      //  return listaAtores;
    //}

    //public void setListaAtores(Collection<Ator> listaAtores) {
      //  this.listaAtores = listaAtores;
    //}    
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    //public void adicionarAtor(Ator a){
        //a.setFilme(this);
      //  getListaAtores().add(a);
    //}
    
    //public void removerAtor(Ator a){
        //if(getListaAtores().contains(a)){
        //    getListaAtores().remove(a);
      //  }
    //}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Filmes other = (Filmes) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    
 
    
}
