package br.com.jsfdevelopers.controllers.navegacao;

import javax.inject.Named;

@Named
public class NavegacaoController {

    public String paginaUm(){
        return "/navegacao/pagina-um";
    }
    
    public String paginaDois(){
        return "/navegacao/pagina-dois";
    }
    
    public String paginaUmRedirect(){
        return "/navegacao/pagina-um?faces-redirect=true";
    }
    
    public String paginaDoisRedirect(){
        return "/navegacao/pagina-dois?faces-redirect=true";
    }
    
}
