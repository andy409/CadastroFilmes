/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.testes;

import br.com.beans.Diretor;
import br.com.beans.Filmes;
import br.com.jpa.EntityManagerUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author Anderson
 */
public class testeInserirDiretor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        Filmes filme = em.find(Filmes.class, 7);
        Diretor t = new Diretor();
        t.setNome("Lars Von Trier");
        t.setFilme(filme);
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
        
    }
    
}
