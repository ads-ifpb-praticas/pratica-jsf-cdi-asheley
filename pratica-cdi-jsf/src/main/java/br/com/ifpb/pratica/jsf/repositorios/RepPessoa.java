/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpb.pratica.jsf.repositorios;

import br.com.ifpb.praticas.jsf.entidades.Pessoa;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class RepPessoa implements Repositorio<Pessoa>,Serializable{

   @Inject
    private EntityManager em;

    @Override
    public void salvar(Pessoa obj) {
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
    }

    @Override
    public void remover(Pessoa obj) {
        em.remove(obj);
    }

    @Override
    public Pessoa consultar(Long id) {
        return em.find(Pessoa.class, id);
    }

    @Override
    public List<Pessoa> listarTodos() {
        Query q = em.createQuery("SELECT p FROM Pessoa p");
        return q.getResultList();
    }
}
