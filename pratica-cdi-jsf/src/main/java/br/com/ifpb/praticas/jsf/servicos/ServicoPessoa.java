/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpb.praticas.jsf.servicos;

import br.com.ifpb.praticas.jsf.entidades.Pessoa;
import br.com.ifpb.pratica.jsf.repositorios.Repositorio;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;


public class ServicoPessoa implements Serializable{
    
     @Inject
    private Repositorio<Pessoa> repositorio;

    public ServicoPessoa() {
    }
    
    @Inject
    public ServicoPessoa(Repositorio<Pessoa> repositorio) {
        this.repositorio = repositorio;
    }
     
     

    public void salvar(Pessoa p) {
        repositorio.salvar(p);
    }

    public List<Pessoa> listar() {
        return repositorio.listarTodos();
    }
    
    public void remover(Pessoa p){
        repositorio.remover(p);
    }
}
