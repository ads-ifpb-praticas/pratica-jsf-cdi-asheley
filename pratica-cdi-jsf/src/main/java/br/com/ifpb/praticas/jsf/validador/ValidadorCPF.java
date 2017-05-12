/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpb.praticas.jsf.validador;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator("cpfValidador")


public class ValidadorCPF implements Validator {
    private CPFValidator validator = new CPFValidator();

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent,
                         Object o) throws ValidatorException {
        try {
            validator.assertValid(o.toString());
        } catch (InvalidStateException e) {
            throw new ValidatorException(new FacesMessage("Erro", "CPF " +
                    "inválido"));
        }
}
    
}