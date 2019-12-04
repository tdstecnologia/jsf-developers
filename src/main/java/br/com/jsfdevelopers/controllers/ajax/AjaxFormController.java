package br.com.jsfdevelopers.controllers.ajax;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class AjaxFormController implements Serializable {
    
    private String texto;
    private String mensagem;
    
    public String getMensagem() {
        setMensagem(texto);
        return mensagem;
    }
    
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public String getTexto() {
        return texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
