package br.com.jsfdevelopers.controllers.components;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class SelectOneMenuController implements Serializable {

    private String cor;
    private List<String> cores;

    public SelectOneMenuController() {
    }

    
    public void exibirCorSelecionada(){
        System.out.println("Cor selecionada: "+cor);
    }
    
    
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public List<String> getCores() {
        if (Objects.isNull(this.cores)) {
            this.cores = new ArrayList<>();
            this.cores.add("Amarelo");
            this.cores.add("Azul");
            this.cores.add("Branco");
            this.cores.add("Verde");
            this.cores.add("Vermelho");
        }
        return cores;
    }

    public void setCores(List<String> cores) {
        this.cores = cores;
    }

}
