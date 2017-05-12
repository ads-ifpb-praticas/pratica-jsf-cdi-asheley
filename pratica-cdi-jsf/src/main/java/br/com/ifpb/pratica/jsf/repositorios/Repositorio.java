/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpb.pratica.jsf.repositorios;

import java.util.List;


public interface Repositorio <E> {
    
    void salvar(E obj);

    void remover(E obj);

    E consultar(Long id);

    List<E> listarTodos();
}
