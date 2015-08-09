/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.testes;

import br.com.beans.Ator;
import br.com.beans.Filmes;
import br.com.jpa.EntityManagerUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author Anderson
 */
public class testeInserirAtor {
    public static void main(String[] args){
        EntityManager em = EntityManagerUtil.getEntityManager();
        Filmes filme = em.find(Filmes.class, 7);
        Ator a = new Ator();
        a.setNome("Nicole Kidman");
        a.setFilme(filme);
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
    }
}
