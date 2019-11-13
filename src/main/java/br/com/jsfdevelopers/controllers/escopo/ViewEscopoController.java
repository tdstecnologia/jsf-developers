package br.com.jsfdevelopers.controllers.escopo;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@ViewScoped
@Named
public class ViewEscopoController implements Serializable{

    private Integer contador = 0;

    public void incrementar() {
        System.out.println("Contador antes do incremento: ".concat(contador.toString()));
        contador++;
        System.out.println("Contador depois do incremento: ".concat(contador.toString()));
    }

    public void decrementar() {
        System.out.println("Contador antes do decremento: ".concat(contador.toString()));
        contador--;
        System.out.println("Contador depois do decremento: ".concat(contador.toString()));
    }

    public Integer getContador() {
        return contador;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }

}
