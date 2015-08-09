/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.testes;

import br.com.beans.Filmes;
import br.com.jpa.EntityManagerUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author Anderson
 */
public class testeInserirFilme {
    public static void main(String[] args){
        EntityManager em = EntityManagerUtil.getEntityManager();
        Filmes t = new Filmes();
        t.setNome("Dogville"); 
        t.setAno(2003);
        t.setDistribuidora("Lionsgate Films");
        t.setGenero("Drama");               
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    }
}
