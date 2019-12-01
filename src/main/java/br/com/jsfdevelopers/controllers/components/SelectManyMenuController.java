package br.com.jsfdevelopers.controllers.components;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class SelectManyMenuController implements Serializable {

    private String cor = "";
    private List<Integer> codigos;
    private List<Cor> cores;

    public SelectManyMenuController() {
    }

    public void exibirCorSelecionada() {
        if(Objects.nonNull(this.codigos) && !this.codigos.isEmpty()){
            codigos.forEach( c -> {
                this.cor += " "+getCores().get(getCores().indexOf(new Cor(c, ""))).toString();
            });
            
        }
        System.out.println("Cor selecionada: " + cor);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public List<Integer> getCodigos() {
        return codigos;
    }

    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }
    
    public List<Cor> getCores() {
        if (Objects.isNull(this.cores)) {
            this.cores = new ArrayList<>();
            this.cores.add(new Cor(1, "Amarelo"));
            this.cores.add(new Cor(2, "Azul"));
            this.cores.add(new Cor(3, "Branco"));
            this.cores.add(new Cor(4, "Verde"));
            this.cores.add(new Cor(5, "Vermelho"));
        }
        return cores;
    }

    public void setCores(List<Cor> cores) {
        this.cores = cores;
    }

}
