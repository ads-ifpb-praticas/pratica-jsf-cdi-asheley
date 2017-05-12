/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpb.praticas.jsf.controladores;

import br.com.ifpb.praticas.jsf.entidades.Pessoa;
import br.com.ifpb.praticas.jsf.servicos.ServicoPessoa;
import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@ViewScoped
public class ControladorPessoa implements Serializable{
    
    @Inject
    private Pessoa pessoa;

    @Inject
    private ServicoPessoa servico;

    public String cadastrar() {
        servico.salvar(pessoa);
        return "index";
    }

    public List<Pessoa> listar() {
        return servico.listar();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
